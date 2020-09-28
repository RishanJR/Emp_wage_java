package demo;

public abstract class Employee_wage {
	
	//Constants
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int total_hours=0;
		int daily_wage=0;
		
		System.out.println("Welcome to employee wage computation");
		
		// TYPE CASTING - To check if employee worked full time, part time or not
		int employeeCheck1 = (int) (Math.floor(Math.random()*10)%3);
	
		//Solving using switch case
		switch(employeeCheck1) {
		case IS_FULL_TIME :
				System.out.println("\nEmployee is present and worked full time");
				total_hours=8;
				break;
		case IS_PART_TIME:
				System.out.println("\nEmployee is present and worked part time");
				total_hours=4;
				break;
		default :
				System.out.println("\nEmployee is absent");
				break;
		}
	
		daily_wage=total_hours*EMP_RATE_PER_HOUR;
		System.out.println("The daily wage of the employee is "+daily_wage);
	}

}

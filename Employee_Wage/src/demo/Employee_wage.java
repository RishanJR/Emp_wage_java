package demo;

public abstract class Employee_wage {
	
	//Constants
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int MAX_WORK_DAYS = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int total_hours=0;
		int daily_wage=0;
		int total_wage=0;
		int number_of_days = 0;
		System.out.println("Welcome to employee wage computation");
		
		while(number_of_days<20) {
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
				total_hours=0;
				break;
			}
	
			daily_wage=total_hours*EMP_RATE_PER_HOUR;
			System.out.println("The daily wage of the employee is "+daily_wage);
			total_wage=total_wage+daily_wage;
			number_of_days++;
		}

		System.out.println("\nThe total wages earned by the employee is "+total_wage);
	}	
}

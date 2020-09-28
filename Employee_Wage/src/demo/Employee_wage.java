package demo;

public abstract class Employee_wage {
	
	//Constants
	public static final int EMP_RATE_PER_HOUR = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		int total_hours=0;
		int daily_wage=0;
		
		System.out.println("Welcome to employee wage computation");
	
		// TYPE CASTING - To check if employee is present or absent
		int employeeCheck1 = (int) (Math.floor(Math.random()*10)%2);
	
		if(employeeCheck1==0) {
			System.out.println("\nEmployee is present");
			total_hours=8;
		}	
		else
			System.out.println("\nEmployee is absent");
	
		daily_wage=total_hours*EMP_RATE_PER_HOUR;
		System.out.println("The daily wage of the employee is "+daily_wage);
	}

}

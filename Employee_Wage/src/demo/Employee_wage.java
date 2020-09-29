package demo;

public abstract class Employee_wage {
	
	//Constants
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int MAX_WORK_DAYS = 20;
	public static final int MAX_HOURS_WORKED = 100;
	
	public static void Compute_wage() {
		//Variables
		int total_hours=0;
		int daily_wage=0;
		int total_wage=0;
		int number_of_days = 0;
		int total_hours_worked=0;
		
		//Welcome Message
		System.out.println("Welcome to employee wage computation");
		
		//Condition to check until when to compute employee wages for a month
		//Number of days worked not more than 20
		//Number of hours worked not more than 100
		while(number_of_days<MAX_WORK_DAYS && total_hours_worked<MAX_HOURS_WORKED) {
			// TYPE CASTING - To check if employee worked full time, part time or not
			//Random to check in random if employee worked full time,part time or was absent
			int employeeCheck1 = (int) (Math.floor(Math.random()*10)%3);
			
			//Computing hours worked based on random result using switch case
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
			total_hours_worked=total_hours_worked+total_hours;
		}
		System.out.println("\nThe total wages earned by the employee is "+total_wage);
		System.out.println("The total hours worked in the month is "+total_hours_worked);
		System.out.println("The number of days worked is "+number_of_days);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compute_wage();
	}	
}

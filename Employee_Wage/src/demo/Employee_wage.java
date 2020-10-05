package demo;
import java.util.*;

public class Employee_wage {
	
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static void Compute_wage(String com_name, int max_hours, int max_days, int emp_wage) {
		//Variables
		int total_hours=0;
		int total_wage=0;
		int number_of_days = 0;
		int total_hours_worked=0;
		int daily_wages=0;
		
		//Condition to check until when to compute employee wages for a month
		//Number of days worked not more than 20
		//Number of hours worked not more than 100
		int daily_wage[]=new int[max_days+1];
		while(number_of_days<max_days && total_hours_worked<max_hours) {

			// TYPE CASTING - To check if employee worked full time, part time or not
			//Random to check in random if employee worked full time,part time or was absent
			int employeeCheck1 = (int) (Math.floor(Math.random()*10)%3);
			
			//Computing hours worked based on random result using switch case
			switch(employeeCheck1) {
			case IS_FULL_TIME :
				total_hours=8;
				break;
			case IS_PART_TIME:
				total_hours=4;
				break;
			default :
				total_hours=0;
				break;
			}
			
			daily_wages=total_hours*emp_wage;
			System.out.println(daily_wages);
			daily_wage[number_of_days] = daily_wages;
			total_wage=total_wage+daily_wage[number_of_days];
			number_of_days++;
			total_hours_worked=total_hours_worked+total_hours;
		}
		System.out.println("\n"+com_name);
		System.out.print("Daily wages of employee are "+Arrays.toString(daily_wage));
		System.out.println("\nThe total wages earned by the employee is "+total_wage);
		System.out.println("The total hours worked in the month is "+total_hours_worked);
		System.out.println("The number of days worked is "+number_of_days);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans;
		
		//Welcome Message
		System.out.println("Welcome to employee wage computation");
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter the company name");
			String COMPANY_NAME=sc.nextLine();
			System.out.println("Enter the maximum number of working hours in a month");
			int MAX_HOURS_WORKED=sc.nextInt();
			System.out.println("Enter the maximum number of working days in a month");
			int MAX_WORK_DAYS=sc.nextInt();
			System.out.println("Enter the Employee rate per hour");
			int EMP_RATE_PER_HOUR=sc.nextInt();
			
			Compute_wage(COMPANY_NAME, MAX_HOURS_WORKED, MAX_WORK_DAYS, EMP_RATE_PER_HOUR);
			
			System.out.println("\nEnter 1 if you want to repeat");
			ans=sc.nextInt();
		}while(ans==1);
	}
}

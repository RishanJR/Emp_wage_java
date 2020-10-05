package demo;
import java.util.*;

class company_info{
	
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	
	String name;
	static int max_hrs, max_days, rate;
	private int tot_wage=0;
	
	public company_info(String comp_name, int hours, int days, int salary) {
		// TODO Auto-generated constructor stub
		this.name=comp_name;
		this.max_hrs=hours;
		this.max_days=days;
		this.rate=salary;
	}
	
	public void set_tot_wages(int wage) {
		this.tot_wage+=wage;
	}

	public int get_tot_wages() {
		return this.tot_wage;
	}
	
	public void Compute_wage() {
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
		while(number_of_days<max_days && total_hours_worked<max_hrs) {

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
			
			daily_wages=total_hours*rate;
			daily_wage[number_of_days] = daily_wages;
			total_wage=total_wage+daily_wage[number_of_days];
			number_of_days++;
			total_hours_worked=total_hours_worked+total_hours;
		}
		
		set_tot_wages(total_wage);
	
		System.out.println("\n"+name);
		System.out.print("Daily wages of employee are "+Arrays.toString(daily_wage));
		System.out.println("\nThe total wages earned by the employee is "+total_wage);
		System.out.println("The total hours worked in the month is "+total_hours_worked);
		System.out.println("The number of days worked is "+number_of_days);
	}

	public void print_company_details() {
		System.out.println("Company name: "+name+"\nMax working days in a month: "+max_days+"\nMax working hours in a month: "+max_hrs+"\nEmployee salary"+rate+"\nTotal wages: "+tot_wage);
	}
}

public class Employee_wage {

	ArrayList<company_info> company;
	
	public Employee_wage() {
		company = new ArrayList<company_info>();
	}
	
	public void add_company() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter the company name");
		String COMPANY_NAME=sc.nextLine();
		System.out.println("Enter the maximum number of working hours in a month");
		int MAX_HOURS_WORKED=sc.nextInt();
		System.out.println("Enter the maximum number of working days in a month");
		int MAX_WORK_DAYS=sc.nextInt();
		System.out.println("Enter the Employee rate per hour");
		int EMP_RATE_PER_HOUR=sc.nextInt();
		
		company_info c=new company_info(COMPANY_NAME, MAX_HOURS_WORKED, MAX_WORK_DAYS, EMP_RATE_PER_HOUR);
		
		company.add(c);
	}
	
	public void search_company(String compName) {
		//count to check if the name given by the user matches existing records
		int count=0;
		for(int i=0 ; i<company.size() ; i++) {
			company_info c = (company_info)company.get(i);
			if(compName.equals(c.name)) {
				count=1;
				c.Compute_wage();
			}
		}
		if(count==0) {
			System.out.println("The Company name doesn't exist");
		}
	}
	
		
	public void print_company() {
		if(company.size()==0)
			System.out.println("There are no users in the address book");
		else
			for(int i=0 ; i<company.size() ; i++) {
				System.out.println("\nCompany "+(i+1)+" details are:");
				company_info c = (company_info)company.get(i);
				c.print_company_details();
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans;
		
		//Welcome Message
		System.out.println("Welcome to employee wage computation\n");
		
		Employee_wage emp = new Employee_wage();
		emp.print_company();
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("\nEnter 1 to add company details or 2 to compute the wages for the company or 3 to exit the program or 4 to print the company list");
			ans=sc.nextInt();
			switch (ans) {
			case 1:
				emp.add_company();
				break;
			case 2:
				System.out.println("Enter the company name for computing employee wages");
				String name = sc.next();
				emp.search_company(name);
				break;
			case 3:
				System.out.println("Exiting the program");
				break;
			case 4:
				System.out.println("Company details");
				emp.print_company();
				break;
			default:
				System.out.println("Not a valid option");
				break;
			}
		}while(ans!=3);
	}
}

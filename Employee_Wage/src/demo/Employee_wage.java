package demo;

public abstract class Employee_wage {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to employee wage computation");
	
		// TYPE CASTING - To check if employee is present or absent
		int employeeCheck1 = (int) (Math.floor(Math.random()*10)%2);
	
		if(employeeCheck1==0)
			System.out.println("\nEmployee is present");
		else
			System.out.println("\nEmployee is absent");
	}

}

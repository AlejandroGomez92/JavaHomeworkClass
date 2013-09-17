
import java.util.Scanner;


public class EmployeeTest 
{
	public static void main(String[] args)
	{
		Scanner S = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String fname = S.next();
		
		System.out.println("Enter last name: ");
		String lname = S.next();
		
		System.out.println("Enter salary: ");
		double salary = S.nextDouble();
		
		Employee theEmployee =new Employee(fname,lname ,salary );
		
		System.out.println("the yearly salary of "+theEmployee.getFirstName()+" "
		+theEmployee.getLastName()+" :");
		System.out.println(theEmployee.getMonthlySalary()*12);
		double newsalary=
				
		theEmployee.getMonthlySalary()*0.1+theEmployee.getMonthlySalary();
		theEmployee.setMonthlySalary(newsalary);
		System.out.println("the new yearly salary of "+
		theEmployee.getFirstName()+" "+theEmployee.getLastName()+" :");
		System.out.println(theEmployee.getMonthlySalary()*12);
		theEmployee.getMonthlySalary();
	}


}

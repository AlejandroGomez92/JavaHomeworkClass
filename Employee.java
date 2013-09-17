public class Employee 
{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	public Employee(String first, String last, double monthly)
	{
	firstName = first;
	lastName = last;
	if(monthly < 0)
	{ // you can also use setMonthlySalary(m)
		monthlySalary =0;
	}
	else monthlySalary = monthly;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String fname) 
	{
		firstName = fname;
	}
	public String getLastName() 
	{
		return lastName;
	}
		public void setLastName(String lname) 
	{
			lastName = lname;
	}
		public double getMonthlySalary() 
	{
		return monthlySalary;
	}
		public void setMonthlySalary(double monthly) 
		{
		if(monthly < 0)
		{
			monthlySalary =0;
		}
		else monthlySalary = monthly;
		}

	

}

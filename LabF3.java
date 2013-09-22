import java.util.Scanner;
public class LabF3 
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		
		String choice;
		String breakf;
		
		System.out.println("User is Hungry");
		System.out.println("Get in Line");
		System.out.println("Buy Lunch");
		
		System.out.println("Are You thirsty?");
		System.out.print("press Y for Yes or N for No:\n ");
		choice = S.next();
		
		System.out.println("Did You have breakfast?");
		System.out.print("press Y for Yes or N for No:\n ");
		breakf = S.next();
		
		
		
		if (choice.equals("Y") && breakf.equals("Y"))
		{
			System.out.println("Buy Diet Coke");
		}
		else if(choice.equals("Y") && !breakf.equals("Y"))
		{
			System.out.println("Buy Coke");
		}
		
		else 
		{
			System.out.println("Get Water");
		}
		
		System.out.println("Eat Lunch");
		System.out.println("Return Tray");
		System.out.println("Leave");
	}

}

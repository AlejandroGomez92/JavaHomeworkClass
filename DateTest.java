import java.util.Scanner;


public class DateTest 
{
	public static void main(String [] args){
		Scanner S = new Scanner(System.in);
		
		System.out.print("Enter year: ");
		int year = S.nextInt();
		
		System.out.print("Enter month: ");
		int month = S.nextInt();
		
		System.out.print("Enter day: ");
		int day = S.nextInt();
		
		Date theDate = new Date(year, month, day);
		
		System.out.print("You Entered :");
		
		theDate.display();
		}

}

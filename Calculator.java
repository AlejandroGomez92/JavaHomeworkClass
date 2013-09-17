
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Calculator 
{

    public static void main(String[] args) 
    {
        int number1;
        int number2;
        String operator;


        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.print("Please enter operation (+, -, /, *): ");
        operator = op.next();

        if (operator.equals("+"))
        {
            System.out.println("Your answer is " + (number1 + number2));
        }
        else if (operator.equals("-"))
        {
            System.out.println("Your answer is " + (number1 - number2));
        }

        else if (operator.equals("/"))
        {
            System.out.println("Your answer is " + (number1 / number2));
        }
        else if (operator.equals("*"))
        {
            System.out.println("Your answer is " + (number1 * number2));
        }


    }
}
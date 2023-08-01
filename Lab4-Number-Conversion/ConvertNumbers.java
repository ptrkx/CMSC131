import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/*

For this lab you need to implement the convertBase10toBase class and 
also write a main method to test it.  

The convertBase10toBase method needs to be written such that the first 
parameter will be assumed to be in base 10 and the second will the the base 
to which you need to convert that first value.  To generate the String return 
value you'll want to think about how to use the repeated division technique 
you saw earlier in the semester.

The provided main method is just provided so that you can test your program
locally before submitting.  The submit server testing will only use the   
convertBase10toBase method itself.

The TA will start lab by discussing the pseudocode and you you will 
implement the actual code.

This two-step process will help you get a feel for thinking out an
algorithm before you start writing code.  

*/


public class ConvertNumbers 
{
	
	//FIND THE NUMBER OF DIGITS base10val HAS~~~!
	
	
	public static String convertBase10toBase(int base10val, int targetBase)
	{
		
/*		ArrayList<Integer> list = new ArrayList<Integer>();
		while(base10val != 0)
		{
			int num = base10val % targetBase;
			list.add(num);
			base10val /= targetBase;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0; i < list.size(); i++)
		{
			stack.push(list.get(i));
		}
		
		
		return(stack.toString());
*/
		String conversion = "";
		while(base10val != 0)
		{
			int num = base10val % targetBase;
			conversion = num + conversion;
			base10val /= targetBase;
		}
		
		return(conversion);
		
		
		
		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
//		throw new RuntimeException("NOT YET IMPLEMENTED");

	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int decimalValue;
		int targetBaseValue;
		/*
		 * DO NOT change the Strings as they appear in the statement below because
		 * the various Tests are expecting to see output look exactly as these appear;
		 * you have been warned!
		 */
		System.out.print("Enter a positive integer value in Base 10: ");
		decimalValue = sc.nextInt();
		do {
			System.out.print("Enter a target base: ");
			targetBaseValue = sc.nextInt();

			System.out.print(decimalValue+"(10)=");
			System.out.print(
					convertBase10toBase(decimalValue, targetBaseValue) + 
					"("+targetBaseValue+")"
			);
			System.out.println();

			System.out.print(
				"Give another positive integer value in Base 10 or 0 to quit: "
			);
			decimalValue= sc.nextInt();

		} while(decimalValue!=0);

		sc.close();     
	}


}

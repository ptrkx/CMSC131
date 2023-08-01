import java.util.Scanner;
public class CountingSumming 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter a positive integer: ");
		System.out.println();
		num = scan.nextInt();
		
		if (num < 0)
		{
			System.out.println(num + " is a negative number. ");
		} else 
			{ 
			System.out.println("\nThe number " + num + " contains " + numDigits(num) + " digits.");
			System.out.println();
			}
	}
	
	
	public static int numDigits(int num)
	{
		if(num < 10)
		{
			return (1);
		}else 
			{
			return (1 + numDigits(num / 10));
			}
	}
	
	public static int sumDigits(int num)
	{
		if(num < 10)
			{
			return (num);
			}else 
				{
				return( (num % 10) + sumDigits(num / 10));
				}
	}
	
}

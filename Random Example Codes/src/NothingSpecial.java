
public class NothingSpecial 
{
	
/*	public static void main(String[] args)
	{
		if(add(2,2) == 4)
		{
			System.out.println("Hooray!");
		}
	}*/
	
	private int x;
	
	public NothingSpecial()
	{
		x = 3;
	}
	
	public int getX()
	{
		return x;
	}
	
	public static int add(int x, int y)
	{
		return(x - y);
	}
	
	public static int subtract(int x, int y)
	{
		return(x - y);
	}

	
//HOW TO THROW AN EXCEPTION	
	public static void dangerousMethod() throws ArithmeticException
	{
		throw new ArithmeticException("Hello!");
	}
	
}

/**
 * A general representation of a quadratic equation of the form:
 * (a*x^2 + b*x + c)
 * 
 * @author Evan Golub
 * @date March 2013
 */

package p4_student;


public class QuadraticEquation 
{
	private final MyDouble a;
	private final MyDouble b;
	private final MyDouble c;
	
	public QuadraticEquation() 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
//		throw new RuntimeException("Not yet implemented!");
	}

	public QuadraticEquation(MyDouble cIn) 
	{
		c = cIn;
		
		
		
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}

	public QuadraticEquation(MyDouble bIn, MyDouble cIn) 
	{
		b = bIn;
		c = cIn;
		
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}

	public QuadraticEquation(MyDouble aIn, MyDouble bIn, MyDouble cIn) 
	{
		a = aIn;
		b = bIn;
		c = cIn;
		
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}
	
	public QuadraticEquation(QuadraticEquation other) 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}
	
	public MyDouble getA() 
	{
		return a;
		
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		//throw new RuntimeException("Not yet implemented!");
	}
	
	public MyDouble getB() 
	{
		return b;
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		//throw new RuntimeException("Not yet implemented!");
	}
	
	public MyDouble getC() 
	{
		return c;
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		//throw new RuntimeException("Not yet implemented!");
	}
	
	public MyDouble evaluate(MyDouble x) 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}
	
	public QuadraticEquation add(QuadraticEquation quadIn) 
	{
		
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}

	public QuadraticEquation subtract(QuadraticEquation quadIn) 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}

	public QuadraticEquation limitedMultiply(QuadraticEquation quadIn) 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}

	public QuadraticEquation derivative() 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}

	public MyDouble normalize() 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}

	
	public int compareTo(QuadraticEquation quadIn) 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}
	
	
	public String toString() 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}
	
	public static QuadraticEquation parseQuadratic(String str) 
	{
		/*remove the code provided in this method before
		 *  you start implementing this method*/
		throw new RuntimeException("Not yet implemented!");
	}
	
	
	
	
	
	
	//NOTE: THIS IS WRITTEN FOR YOU - DO NOT CHANGE!!!!
	public boolean equals (Object other) 
	{
		if (other == null) 
		{
			return false;
		}
			else if (this.getClass()!=other.getClass())
			{
				return false;
			}
				else 
				{
					QuadraticEquation casted = (QuadraticEquation)other;
					return (
							a.equals(casted.a) && 
							b.equals(casted.b) && 
							c.equals(casted.c)
					);
				}
	}
	
	
}
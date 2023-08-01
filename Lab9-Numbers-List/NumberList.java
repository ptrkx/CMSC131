/**
 * Creates and manages a list of integers that supports common array operations as well
 * as the append operator that requires construction of a new array to contain the additional
 * element being "appended" to the original array.
 * 
 * @author CMSC131
 *
 */
public class NumberList 
{
	// do NOT change the name or declaration of this variable.
	public int[] values;  
	
	//Constructor for an empty list (provided for you)
	public NumberList() 
	{
		values = new int[0];
	}
	
	//Constructor passed in an array
	public NumberList(int[] a) 
	{
		values = a;
		
//		throw new RuntimeException("Not yet implemented...");
		
	}
	
	// creates a "shallow copy" of the original meaning that
	// the new NumberList contains the same elements in 
	// the same order as the original, but changes made
	// to one is invisible to the other.
	public NumberList(NumberList original) 
	{
		int[] copy = new int[values.length];
		for(int i = 0; i < values.length; i++)
		{
			copy[i] = values[i];
		}
		
		
				
		//throw new RuntimeException("Not yet implemented");
	}
	
	//Size getter
	public int getSize() 
	{
		int size = values.length;
		return size;
		
		//throw new RuntimeException("Not yet implemented...");
		
		
	}
	
	//Single-value getter
	public int getAt(int index) 
	{
		int num = values[index];
		return num;

		//YOUR CODE HERE
		//throw new RuntimeException("Not yet implemented...");
		
	}
	
	//Process the values to get the sum
	public long getSum() 
	{
		int sum = 0;
		for(int i = 0; i < values.length; i++)
		{
			sum += values[i];
		}
		
		return sum;
		
		//YOUR CODE HERE
		//throw new RuntimeException("Not yet implemented...");
		
	}
	
	//See if the given value is anywhere within the array
	public boolean contains(int searchVal) 
	{
		boolean found = false;
		
		for(int i = 0; i < values.length; i++)
		{
			if(values[i] == searchVal)
			{
				found = true;
			}
		}
		
		
		return found;
	}
	// you should know what this function looks like at this point ... think
	// about the method of the same name for Strings.
	public int indexOf( int target ) 
	{
		int index = -1;
		for(int i = 0; i < values.length; i++)
		{
			if(target == values[i])
			{
				index = i;
			}
		}
		
		return index;
		
		
		//throw new RuntimeException("Not yet implemented...");
	}
	
	// think about the difference between returning the minimum "value" versus
	// the "index of the minimum value" in an array. Think also about how 
	// we handle duplicate values ... 
	public int findMin() 
	{
		int min = 99999;
		int index = -1;
		
		for(int i = 0; i < values.length; i++)
		{
			if(min > values[i])
			{
				min = values[i];
			}
		}
		
		for(int i = 0; i < values.length; i++)
		{
			if(min == values[i])
			{
				index = i;
			}
		}
		
		return index;
		
		//throw new RuntimeException("Not yet implemented...");
	}
	
	// ask: how would this method appear for Integer[] arrays?
	public boolean sameArrays( int[] other ) 
	{
		int index = 0;
		
		if(values.length != other.length)
		{
			return false;
		} else if(values.length == other.length)
			{
				for(int i = 0; i < values.length; i++)
				{
					if(values[i] != other[i])
					{
						return false;
					}
				}
				return true;
			}
		return false;
		
		
		
	//	throw new RuntimeException("Not yet implemented...");
	}
	
	//Append a new element - the array must "grow" somehow first!
	public void append(int newValue) 
	{
		int[] newBiggerArray = new int[values.length + 1];

		for(int i = 0; i < values.length; i++)
		{
			newBiggerArray[i] = values[i];
		}
		newBiggerArray[values.length + 1] = newValue;
	
		
		
		values = newBiggerArray;
	}

	
	public int[] reverse() 
	{
		int[] reverseCopy = new int[values.length];
		for(int i = 0; i < values.length; i++)
		{
			reverseCopy[i] = values[values.length - i];
		}
		
		return reverseCopy;
		
		//throw new RuntimeException("Not yet implemented...");
	}
	
}

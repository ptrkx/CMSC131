
public class ArrayExample 
{
	public static void main(String[] args)
	{
		//declare an array variable 
		int[] array;
		
		//initialize the array to have size 3
		//entries are 0,1,2
		array = new int[3];
		
		//sets the elements of the array in a loop
		for(int i = 0; i < array.length; i++)
		{
			array[i] = i + 3;
		}
		
		//example of how to make a copy
		int[] copy = new int[array.length];
		
		for(int i = 0; i < array.length; i++)
		{
			copy[i] = array[i];
		}
		
		//points to the same array
		//if array changes then the refCopy changes with it
		int[] refCopy = array;
			
	}

}

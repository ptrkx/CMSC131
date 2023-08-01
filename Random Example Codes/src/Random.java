
public class Random 
{

	public static void main(String[] args) 
	{
		int size = 5;
		
		//Upper half of diamond--- triangle~~!
		for(int i = 0; i < size; i++)
		{
			for(int j = 0 ; j < size; j++)
			{
				if((i + j) > size)
					{
					System.out.print("*");
					System.out.print(" ");
					}else 
						{
						System.out.print(" ");
						}
			}
			System.out.println();
		}
		
		//Lower half of diamond--- upside down triangle~~!
		for(int i = 0; i < size; i++)
		{
			for(int j = size ; j > 0; j--)
			{
				if((i + j) < size)
					{
					System.out.print("*");
					System.out.print(" ");
					}else 
						{
						System.out.print(" ");
						}
			}
			System.out.println();
		}
		
	}
}

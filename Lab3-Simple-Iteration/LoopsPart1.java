import java.util.Scanner;

public class LoopsPart1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Shape? ");
		String shape = sc.next();

		
		//YOUR CODE STARTS HERE
		
		if (shape.equalsIgnoreCase("Square"))
		{
			System.out.print("Size? ");
			int side = sc.nextInt();
			
			for (int i = 0; i < side; i++)      		// determines height of square
				{
					for (int j = 0; j < side; j++)		//determines width of square
					{
						System.out.print("*");
					}
					System.out.println();
				}
				
			
		}else if (shape.equalsIgnoreCase("Rectangle"))
			{
				System.out.print("Width? ");			//determines height of rectangle
				int width = sc.nextInt();
				System.out.print("Height? ");			//determines width of rectangle
				int height = sc.nextInt();
				
				for (int i = 0; i < height; i++)
				{
					for (int j = 0; j < width; j++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
			}
		
		//YOUR CODE ENDS HERE

		sc.close();
	}

}

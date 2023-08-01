
public class ArrayExampleObj 
{
	public static void main(String[] args)
	{
		Point[] triangle = new Point[3];
		triangle[0] = new Point(0, 0);
		triangle[1] = new Point(0, 4);
		triangle[2] = new Point(3, 0);
		
		//reference copy
		Point[] refCopy = triangle;
		
		//shallow copy
		Point[] shalCopy = new Point[triangle.length];
		for(int i = 0; i < triangle.length; i++)
		{
			shalCopy[i] = triangle[i];
		}
				
		//deep copy
		Point[] deepCopy = new Point[triangle.length];
		for(int i = 0; i < triangle.length; i++)
		{
			deepCopy[i] = new Point(triangle[i].x, triangle[i].y);
		}
	}

}


class Point
{
	public int x;
	public int y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

public class Point2D 
{
	public double x;
	public double y;
	
	public Point2D(double xCoord,double yCoord)
	{
		x = xCoord;
		y = yCoord;
	}
	
	public void flipAcrossX()
	{
		 y = -y;
	}
	
	public void translate(int shiftX, int shiftY)
	{
		x += shiftX;
		y += shiftY; 
	}
	
	public String toString()
	{
		return"(" + x + "," + y + ")";
	}
	
	//setter method - mutator
	public void setX(int newX)
	{
		x = newX;
	}
	
	//getter method - accessor
	public double getX()
	{
		return x;
	}
	
	

}

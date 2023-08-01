import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Random1 
{
	static void update(int value)
	{
		value += 1;
	}
	
	public static void main(String[] args)
	{
		int num = 1;
		update(num);
		
		System.out.println(num);
	}

}

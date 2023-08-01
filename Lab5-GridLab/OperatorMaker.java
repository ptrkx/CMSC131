import java.awt.Color;
import GridTools.SquareGrid;

public class OperatorMaker 
{
	

	
	
	/* *************************************************
	 * Draws a single Operator in the already created grid
	 * that is passed as the first parameter 
	 * according to the symbol selection passed as the 
	 * second parameter by calling the appropriate
	 * helper method.	
	 * 
	 * All of the methods are static and are passed in a
	 * SquareGrid and the number indicating which symbol 
	 * to draw.				
	 * *************************************************/
	
	public static void drawOp(SquareGrid grid, int symbol) 
	{
		if (symbol == 1)
		{
			minus(grid);
		} else if(symbol == 2)
			{
			plus(grid);
			} else if(symbol == 3)
				{
				divide(grid);
				}else if(symbol == 4)
					{
					multiply(grid);
					}
	}
	
	
	
	

	/*
	 * The helper methods you should write...
	 * 
	 * 
	 * You may add more helper methods if you want, but they 
	 * all need to be static as well.	
	 */
	public static void minus(SquareGrid grid)
	{
		int mid = grid.getHt()/2;
		drawLine(grid, mid, Color.BLUE);
	}
	
	
	
	public static void plus(SquareGrid grid)
	{
		int mid = grid.getWd()/2;
		minus(grid);
		drawLineD(grid, mid, Color.BLUE);
	}

	public static void divide(SquareGrid grid)
	{
		int i = 0;
		int j = grid.getWd()-1;
		while(i < grid.getHt() && j >= 0)
		{
			grid.setColor(i, j,Color.BLUE);
			i++;
			j--;
		}
	}

	public static void multiply(SquareGrid grid)
	{
		int i = 0;
		int j = 0;
		while(i < grid.getHt() && j < grid.getWd())
		{
			grid.setColor(i, j,Color.BLUE);
			i++;
			j++;
		}
		
		divide(grid);
		plus(grid);
	}

	public static void drawLine(SquareGrid grid, int row,
			Color myColor)
	{
		for (int col = 0; col < grid.getWd(); col++)
		{
			grid.setColor(row,col,myColor);
		}		
	}
	
	public static void drawLineD(SquareGrid grid, int col,
				Color myColor)
	{
			for (int row = 0; row < grid.getHt(); row++)
			{
				grid.setColor(row,col,myColor);
			}
	}

	
}


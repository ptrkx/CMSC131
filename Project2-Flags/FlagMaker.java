import java.awt.Color;
import GridTools.MyGrid;

public class FlagMaker 
{

	/* *************************************************
	 * Draws a single flag in the already created grid
	 * that is passed as the first parameter 
	 * according to the countryCode passed as the 
	 * second parameter.		
	 * 
	 * (Student: you will need to modify this method	- the code
	 * provided here is for demonstration purposes only.			
	 * *************************************************/

	
//CHANGE THIS VALUE ONCE YOU FIGURE OUT HOW TO BRING THE SIZE INTO THE drawFlag METHOD	
	int size = 4;  
	
	
	public static void drawFlag(MyGrid grid, int flagNumber) 
	{
		/*	grid.setColor(3,3,Color.RED);
			drawLine(grid, 2, Color.YELLOW);
			grid.setColor(2,3,Color.BLUE);
		*/
		
//Poland
	
				if((grid.getHt() % 2 == 0) && flagNumber == 1) 
				{
					for (int i = 0; i < grid.getHt(); i++)
						{
						drawLine(grid, i, Color.RED);
						}
					for(int i = 0; i < (grid.getHt()/2) ; i ++)
							{
							drawLine(grid, i, Color.WHITE);
							}
				} else if(grid.getHt() % 2 ==1)
					{
					drawErrorFlag(grid);
					}
	
//Ukraine
		
				if((grid.getHt() % 2 == 0) && flagNumber == 2) 
				{
					for (int i = 0; i < grid.getHt(); i++)
						{
						drawLine(grid, i, Color.YELLOW);
						}
					for(int i = 0; i < (grid.getHt()/2) ; i ++)
							{
							drawLine(grid, i, Color.BLUE);
							}
				} else if(grid.getHt() % 2 == 1)
					{
					drawErrorFlag(grid);
					}
	
//The Czech Republic        
				
			
	
			if((grid.getHt() % 2 == 0) && flagNumber == 3) 
			{
				for (int i = 0; i < grid.getHt(); i++)
					{
					drawLine(grid, i, Color.RED);
					}
				for(int i = 0; i < (grid.getHt()/2) ; i ++)
						{
						drawLine(grid, i, Color.WHITE);
						}
		//code for triangle bit		
				for(int i = 0; i <grid.getHt(); i++)
				{
					for(int j = 0; j < grid.getWd(); j++)
					{
					grid.setColor(j/2, i/2, Color.BLUE);
					}
				}
				
				
			} else if(grid.getHt() % 2 != 0)
				{
				drawErrorFlag(grid);
				}
	
//	BENIN

		if((grid.getHt() % 6 == 0) && flagNumber == 4) 
			{
				for (int i = 0; i < grid.getHt(); i++)
					{
					drawLine(grid, i, Color.RED);
					}
				for(int i = 0; i < (grid.getHt()/2) ; i ++)
						{
						drawLine(grid, i, Color.YELLOW);
						}
				
				//code for green part of flag
				for(int i = 0; i <grid.getHt() + 3; i++)
				{
					for(int j = 0; j < grid.getWd(); j++)
					{
					grid.setColor(j/2, i/2, Color.GREEN);
					}
				}
				
			} else if(grid.getHt() % 6 != 0)
					{
					drawErrorFlag(grid);
					}
						
//Rwanda
			
		if((grid.getHt() % 4 == 0) && flagNumber == 5) 
			{
				for (int i = 0; i < grid.getHt(); i++)
					{
					drawLine(grid, i, Color.GREEN);
					}
				for(int i = 0; i < (grid.getHt()/4) * 3 ; i ++)
					{
					drawLine(grid, i, Color.YELLOW);
					}
				for(int i = 0; i < (grid.getHt()/2) ; i ++)
					{
					drawLine(grid, i, Color.BLUE);
					}
				
				
			} else if(grid.getHt() % 4 != 0)
				{
				drawErrorFlag(grid);
				}
			
		
//Bahamas		
		
		if((grid.getHt() % 2 == 0) && flagNumber == 6)
		{
			 int h = grid.getHt();
			 int w = grid.getWd();
			 for (int row = 0; row < h; ++row)
			 {
			 	for (int col = 0; col < w; ++ col)
			 	{
			 		grid.setColor (row, col, Color.BLUE);

			 	}
			 }
			 for (int row = h/2; row < ((h/2)+1); ++row)
			 {
			 	for (int col = 0; col < w; ++col)
			 	{
			 		grid.setColor (row, col, Color.YELLOW);
			 	}
			 }
			 for (int row = ((h/2)-1); row < ((h/2)+1); ++row)
			 {
			 	for (int col = 0; col < w; ++col)
			 	{
			 		grid.setColor (row, col, Color.YELLOW);
			 	}
			 }
			 for (int row = h/2; row < h; ++row)
			 {
			 	for (int col = 0; col < w-(row+(h-1)); ++col)
			 	{
			 		grid.setColor(row, col, Color.BLACK);
			 	}
			 }
			 for (int row = 0; row < h/2; ++row)
			 {
			 	for (int col = 0; col < row+2; ++col)
			 	{
			 		grid.setColor (row, col, Color.BLACK);
			 	}
			 }
		}else if(grid.getHt() % 2 != 0)
			{
			drawErrorFlag(grid);

			}
		
		
//Afghanistan
	
		if((grid.getHt() % 3 == 0) && flagNumber == 7) 
		{
			for(int i = 0; i < grid.getWd(); i++)
			{
				drawLineD(grid, i, Color.GREEN);
			}
			for(int i = 0; i < 2*(grid.getWd()/3); i++)
			{
				drawLineD(grid, i, Color.RED);
			}
			for(int i = 0; i < (grid.getWd()/3); i++)
			{
				drawLineD(grid, i, Color.BLACK);
			}
		}else if(grid.getHt() % 3 != 0)
			{
			drawErrorFlag(grid);
			}
	
//Jersey
		

		if((grid.getHt() % 2 == 1) && flagNumber == 8) 
		{
			  int h = grid.getHt();
			  int l = 0;
			  int r = 2*h;

			  for(int i = 0; i < h; i++){
			  	grid.setColor(i,l,Color.RED);
			  	l++;
			  	grid.setColor(i,l,Color.RED);
			  	l++;
			  	grid.setColor(i,r-1,Color.RED);
			  	r--;
			  	grid.setColor(i,r-1,Color.RED);
			  	r--;	
			}
			
		}else if(grid.getHt() % 2 != 1)
		 {
			drawErrorFlag(grid);
		 }
	
//Scotland
	
		if((grid.getHt() % 2 == 1) && flagNumber == 9) 
		{
			int h = grid.getHt();
			int w = grid.getWd();
			  int l = 0;
			  int r = 2*h;

			for(int i = 0; i < h; i++)
				{
					drawLine(grid, i, Color.BLUE);	
				}
			  for(int i = 0; i < h; i++)
			  {
			  	grid.setColor(i,l,Color.WHITE);
			  	l++;
			  	grid.setColor(i,l,Color.WHITE);
			  	l++;
			  	grid.setColor(i,r-1,Color.WHITE);
			  	r--;
			  	grid.setColor(i,r-1,Color.WHITE);
			  	r--;	
			  }
		} else if(grid.getHt() % 2 != 1)
			{
			drawErrorFlag(grid);
			}
		
		if(flagNumber == 99)
		{
			drawErrorFlag(grid);
		}
		
	
	
	
	
	
	}
	
	
	
	
	
	
	/*Helper functions for the drawFlag method appear below this line*/
	
	/*
	 * This method takes an already created grid, a row number that
	 * will be assumed to be a valid row on that grid and a color.  It
	 * then draws on that grid, in the indicated row, a full horizontal
	 * line in the color indicated.
	 * (Student: you may or may not wish to keep this method -- it is just
	 * provided as a demonstration of what you may want to do.)
	 */
	public static void drawLine(MyGrid grid, int row,
			Color myColor)
	{
		for (int col = 0; col < grid.getWd(); col++)
		{
			grid.setColor(row,col,myColor);
		}		
	}
		
	public static void drawLineD(MyGrid grid, int col,
				Color myColor)
	{
			for (int row = 0; row < grid.getHt(); row++)
			{
				grid.setColor(row,col,myColor);
			}
	}
	
	public static void drawErrorFlag(MyGrid grid)
	{
		grid.setColor(0,grid.getWd() - 1,Color.RED);
		grid.setColor(0,0,Color.RED);
		grid.setColor(grid.getHt() - 1, 0,Color.RED);
		grid.setColor(grid.getHt() - 1,grid.getWd() - 1,Color.RED);
	}
}

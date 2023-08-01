package p3_student;


import java.awt.Color;
import cmsc131PhotoLibrary.Photograph;
import cmsc131PhotoLibrary.Pixel;

/**
 * This class will be written by the Student.  It provides various
 * static methods that take a photograph and produce a copy of it with
 * various modifications.
 * 
 * See the project description for details of method implementations.
 * 
 * @author CMSC 131 Student
 *
 */
public class PhotoTools 
{

	public static Photograph copy(Photograph photo) 
	{
		Photograph copy = photo;
		return copy;
		
		
		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
//		throw new RuntimeException("NOT YET IMPLEMENTED");
	}

	
	public static Photograph makeGrayscale(Photograph photo) 
	{
		
		for(int i = 0; i < photo.getWd(); i++)
		{
			for(int j = 0; j < photo.getHt(); j++)
			{
				Pixel pixel = photo.getPixel(i, j);
				//int rbg = (pixel.getRed() * 25 / 10 + pixel.getGreen() * 60 / 10 + pixel.getBlue() * 15 / 10);
				
			}
		}
		
		
		
		
		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
	//	throw new RuntimeException("NOT YET IMPLEMENTED");
	}

	public static Photograph striped(Photograph photo) 
	{

		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
		throw new RuntimeException("NOT YET IMPLEMENTED");
	}
	
	public static Photograph isolateColor(Photograph photo, int type) 
	{

		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
		throw new RuntimeException("NOT YET IMPLEMENTED");
	}

	


	public static Photograph stretched(Photograph photo, int type) 
	{

		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
		throw new RuntimeException("NOT YET IMPLEMENTED");
	}

	public static Photograph mirrored(Photograph photo) 
	{

		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
		throw new RuntimeException("NOT YET IMPLEMENTED");
	}
	
	public static Photograph rotated(Photograph photo) 
	{

		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
		throw new RuntimeException("NOT YET IMPLEMENTED");
	}
	
	public static Photograph upsideDown(Photograph photo) 
	{

		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
		throw new RuntimeException("NOT YET IMPLEMENTED");
	}

	public static Photograph weirdCombo(Photograph photo) 
	{

		//REMOVE THE LINE OF CODE BELOW THIS COMMENT WEHN YOU IMPLEMENT THIS
		throw new RuntimeException("NOT YET IMPLEMENTED");
	}



}

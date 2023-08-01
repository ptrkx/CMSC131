/* This program will read input from the user and print
 * it out in the form specified.
 */

import java.util.Scanner;

public class PrintingShapes {
	/* This method should print an ordered list of the integers between
	 * (inclusively between) the two values passed. 
	 * Write them on a single line with commas between.
	 * e.g. if values given are 9 and 5, output should have 5,6,7,8,9*/
	public static void doBetween(int first, int second){

		System.out.println("Values Between "+first+" and "+second+": ");

	}
	
	/*This method should print all integers that are factors
	 * of both the parameters passed. Write the output
	 * all on one line but with spaces between.
	 * e.g. if values passed are 40 and 100, the output should have
	 * 2 4 5 10 20 */
	public static void doFactors(int first, int second){

		System.out.println("Factors of "+first+" and "+second+": ");

	}
	
	/*This method will print to the console a rectangle of dollar signs
	 * where the number of rows is indicated by the first parameter
	 * and the number of columns is indicated by the second parameter*/
	public static void doRectangle(int rows, int cols){

		System.out.println("Rectangle "+rows+" x "+cols+": ");
		
	}
	
	/*This method will print to the console a right triangle of stars
	 * where the size passed as the parameter indicates both its height
	 * and width and the right angle is in the bottom left corner. */
	public static void doLTriangle(int size){

		System.out.println("Triangle on Left where size = "+size+": ");

	}
	
	
	/*This method will print to the console a right triangle of stars
	 * where the size passed as the parameter indicates both its height
	 * and width and the right angle is in the bottom right corner. */
	public static void doRTriangle(int size){
		
		System.out.println("Triangle on Right where size = "+size+": ");

	}
    /* The main function gets the values from the user and calls each
     * method.  The numbers of each task correspond to the tasks on the 
     * handout distributed in the lab session.
     * Your code can assume the user has followed directions and is giving
     * a value that will work for that individual task.
     */
	public static void main(String[] args) {
		Scanner keyboardInput  = new Scanner(System.in);
		System.out.println("#1 ------------------------------");
		System.out.println("Give two positive Numbers");
		int val1 = keyboardInput.nextInt();
		int val2 = keyboardInput.nextInt();
		doBetween(val1, val2);
		System.out.println("#2 ------------------------------");
		System.out.println("Give two large positive Numbers");
		val1 = keyboardInput.nextInt();
		val2 = keyboardInput.nextInt();
		doFactors(val1, val2);
		System.out.println("#3 ------------------------------");
		System.out.println("Give two positive Numbers");
		val1 = keyboardInput.nextInt();
		val2 = keyboardInput.nextInt();
		doRectangle(val1, val2);
		System.out.println("#4 ------------------------------");
		System.out.println("Give one positive Number");
		val1 = keyboardInput.nextInt();
		doLTriangle(val1);
		System.out.println("#5 ------------------------------");
		System.out.println("Give one positive Number");
		val1 = keyboardInput.nextInt();
		doRTriangle(val1);
	}

}

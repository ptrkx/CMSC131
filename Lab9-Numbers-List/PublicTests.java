import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;


public class PublicTests {
	private static int SIZE = 100;
	private static int[] testArray = new int[SIZE];

	@Before
	public void setUp() throws Exception {
		for (int arrayPos = 0; arrayPos < SIZE; arrayPos++) {
			testArray[arrayPos] = SIZE - arrayPos;
		}
	}


	@Test
	public void testConstructorsLab9() {
		NumberList myList;
		
		myList = new NumberList();
		assertEquals(myList.values.length, 0);
		
		myList = new NumberList(testArray);
		assertEquals(myList.values.length, SIZE);
		
		for (int arrayPos = 0; arrayPos < SIZE; arrayPos++) 
		{
			assertEquals(myList.values[arrayPos], testArray.length - arrayPos);
		}
		
		//Make sure it's a real copy, not just a reference to the array passed in.
		testArray[3] = 100;
		assertNotSame(myList.values[3], testArray[3]);
		
		
	}


	@Test
	public void testGetSizeLab9() 
	{
		NumberList myList = new NumberList();
		assertEquals(myList.getSize(), 0);
		
		myList = new NumberList(testArray);
		assertEquals(myList.getSize(), SIZE);
	}


	@Test
	public void testGetAtLab9() {
		NumberList myList = new NumberList(testArray);
		
		for (int arrayPos = 0; arrayPos < SIZE; arrayPos++) {
			assertEquals(myList.getAt(arrayPos), SIZE - arrayPos);
		}

		int exceptionCount = 0;
		try {
			myList.getAt(-5);
		} catch (IndexOutOfBoundsException e) {
			exceptionCount++;
		}

		try {
			myList.getAt(testArray.length);
		} catch (IndexOutOfBoundsException e) {
			exceptionCount++;
		}

		assertEquals(exceptionCount, 2);
	}


}

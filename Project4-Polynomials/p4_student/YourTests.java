package p4_student;

import static org.junit.Assert.*;

import org.junit.Test;



public class YourTests 
{
	//Some example JUnit tests to get you started thinking about 
	//  writing JUnit tests...
	//There are signatures for JUnit tests you are required to write
	//  below the first few that we've provided.
	
	@Test
	public void testDefaultConstructor() 
	{
		QuadraticEquation testQuad = new QuadraticEquation();
		assertTrue(testQuad.getA().isZero()
				&& testQuad.getB().isZero()
				&& testQuad.getC().isZero());
	}
	
	@Test
	public void testSingleValConstructor() 
	{
		MyDouble cVal = new MyDouble(27.8);
				
		QuadraticEquation testQuad = new QuadraticEquation(cVal);
		assertTrue(testQuad.getA().isZero()
				&& testQuad.getB().isZero()
				&& testQuad.getC().equals(cVal));
	}

	@Test
	public void testThreeValConstructor() 
	{
		MyDouble aVal = new MyDouble(15.7);
		MyDouble bVal = new MyDouble(-23.7);
		MyDouble cVal = new MyDouble(4.3);
				
		QuadraticEquation testQuad = new QuadraticEquation(aVal, bVal, cVal);
		assertTrue(testQuad.getA().equals(aVal)
				&& testQuad.getB().equals(bVal)
				&& testQuad.getC().equals(cVal));
	}

	@Test
	public void testEvaluate() 
	{
		MyDouble aVal = new MyDouble(2);
		MyDouble bVal = new MyDouble(4);
		MyDouble cVal = new MyDouble(8);
		
		QuadraticEquation testQuad = new QuadraticEquation(aVal, bVal, cVal);
		assertTrue(testQuad.evaluate(MyDouble.zero).equals(new MyDouble(8)));
		assertTrue(testQuad.evaluate(new MyDouble(1)).equals(new MyDouble(14)));
		assertTrue(testQuad.evaluate(new MyDouble(2)).equals(new MyDouble(24)));
		assertTrue(testQuad.evaluate(new MyDouble(3)).equals(new MyDouble(38)));
	}

	
	
	
	//YOU NEED TO IMPLEMENT AT LEAST THESE JUNIT TESTS BELOW
	@Test
	public void testGetters() 
	{
		assertTrue(false); //REPLACE THIS WITH REAL TEST
	}

	@Test
	public void testAdd() 
	{
		assertTrue(false); //REPLACE THIS WITH REAL TEST	
	}

	@Test
	public void testSubtract() 
	{
		assertTrue(false); //REPLACE THIS WITH REAL TEST
	}

	@Test
	public void testMultiply() 
	{
		assertTrue(false); //REPLACE THIS WITH REAL TEST	
	}

	@Test
	public void testDerivative() 
	{
		assertTrue(false); //REPLACE THIS WITH REAL TEST
	}

	@Test
	public void testNormalize() 
	{
		assertTrue(false); //REPLACE THIS WITH REAL TEST
	}

	@Test
	public void testEqualsAndCompareTo() 
	{
		assertTrue(false); //REPLACE THIS WITH REAL TEST
	}

	@Test
	public void testToString() 
	{
		assertTrue(false); //REPLACE THIS WITH REAL TEST
	}
	
}

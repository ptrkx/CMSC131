

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTests 
{
	/*
	 * Note: these are delivered "empty" which means that they
	 * all succeed. Use a combination of "assert()" methods, your
	 * knowledge of what these methods are supposed to do, and
	 * a bit of logic and planning to design your own tests.
	 * 
	 * You are not limited to these ... you can create more by following
	 * the "pattern" to you see here.
	 * 
	 * As a matter of design: try to test only one or two functionalities per test.
	 */
	
	
	@Test
	public void testCipher() 
	{
		Cipher cipher = new Cipher(2);
	
	}

	@Test
	public void testEncipher() 
	{
		String text = "aaaa";
		Cipher cipher = new Cipher(2);
		cipher.encipher(text);
		
	}

	@Test
	public void testDecipher() 
	{
		String text = "aaaa";
		Cipher cipher = new Cipher(2);
		cipher.decipher(text);
		
		
	}

}

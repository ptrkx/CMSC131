

/**
 * This lab requires you to use Java's <code>String</code> methods, together
 * with the ``remainder'' function, written <code>a%b</code>, which returns 
 * the remainder of <code>a</code> divided by <code>b</code>. In addition,
 * the methods, <code>encipher(String plainText)</code> and 
 * <code>decipher( String cipherText )</code> must use either the
 * <code>StringBuilder</code> or the <code>StringBuffer</code> class in 
 * order to construct their return values, which are encrypted or decrypted
 * <code>String</code>s, respectively.
 * 
 * @author UMD CS Department.
 *
 */
public class Cipher 
{
	/* 
	 * Do NOT change this alphabet!
	 */
	private final static String alphabet = 
				"abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	/*
	 * This constant may be useful in the various computations that
	 * you will be required to implement in this class.
	 */
	private final static int alphaLength = alphabet.length();
	/*
	 * The "key" is set by the client during the construction of a <code>Cipher</code>
	 * object. The key is used to determine the "displacement" or the number of characters
	 * to the right (if positive) or to the left (if negative) that the alphabet will be
	 * shifted.
	 */
	private int key;
	/**
	 * The Cipher( int key ) constructor below should be used by clients wishing to 
	 * construct their own Cipher objecs. Note, the "key" may be any integer (in principle) 
	 * because it will be reduced MOD the size of the alphabet if it is outside of the range
	 * of the alphabet.
	 * @param key
	 */
	public Cipher( int key ) 
	{
		this.key = key;
	//	throw new UnsupportedOperationException( "You must implement this method." );
	}
	/**
	 * This method (function) takes plain Text (Strings) to cipher Text (Strings)
	 * by reconstructing the plainText, character by character, into cipher Text.
	 * It does this by using the "key" to transform each character.
	 * 
	 * Note: this method should use the StringBuilder (or StringBuffer) class
	 * to hold the return value. Teaching assistants will be scanning your 
	 * implementation to ensure that your code uses the String Builder
	 * or String Buffer class.
	 * 
	 * preconditions: The Cipher constructor has been successfully called.
	 * postconditions: A String representing the original message (plainText)
	 * with the desired transformations (encoding) is
	 * created and returned.
	 * 
	 * @param plainText
	 * @return
	 */
	public String encipher( String plainText ) 
	{

		String ciphertext="";
		for(int i = 0;i < plainText.length(); i++) 
		{
			int position = alphabet.indexOf(plainText.charAt(i));
			int keyPlace = (key + position) % 62;
			char replace = this.alphabet.charAt(keyPlace);
			ciphertext += replace;
		}
		return ciphertext;
		
//	throw new UnsupportedOperationException( "You must implement this method." );
	}
	
	/**
	 * This method (function) takes cipher Text (Strings) to plain Text (Strings)
	 * by reconstructing the cipherText, character by character, into the plain Text.
	 * It does this by using the key, along with some modular arithmetic, to transform
	 * each character in the cipher Text.
	 * 
	 * Note: your method should use the StringBuilder (or StringBuffer) class
	 * to hold the return value. Teaching assistants will be scanning your
	 * implementation to ensure that your code uses the StringBuilder or 
	 * StringBuffer class appropriately.
	 * 
	 * preconditions: The Cipher constructor was successfully called, and the <code>cipherText</code>
	 * was created by a call to the <code>encipher</code> method above.
	 * postcondition: The "inverse" transformation(s) are applied and the original (deciphered) 
	 * message is returned.
	 * 
	 * @param cipherText
	 * @return
	 */
	public String decipher( String cipherText ) 
	{
		String plaintext="";
		for(int i=0;i < cipherText.length(); i++)  
			{
			int position = this.alphabet.indexOf(cipherText.charAt(i));
			int keyPlace = (position - key) % 62;
			if(keyPlace < 0)
				{
				keyPlace = this.alphabet.length() + keyPlace;
				}
			char replace = this.alphabet.charAt(keyPlace);
			plaintext += replace;
			}
		return plaintext;
	}


		
		
		//throw new UnsupportedOperationException( "You must implement this method." );
	}

	/* Overrides */
	/* no overrides are provided for this class */
	
	/* Private methods */
	
	/*
	 * Define any "private methods" that you use to encode or decode messages below.
	 * 
	 */

	

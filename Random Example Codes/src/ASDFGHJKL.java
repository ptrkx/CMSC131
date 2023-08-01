
public class ASDFGHJKL 
{
	public static void main(String[] args)
	{
		mystery("bleak");
	}
	

	static void mystery( String str ) 
	{
		int start=0, end = str.length() ;
		while( start < str.length()) 
			{
			System.out.println( str.substring( start, end ));
			start++;
			end--;
			}
	}
	
}
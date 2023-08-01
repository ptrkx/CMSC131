package poker;

public class Deck 
{

	private Card[] cards;
	private Deck other;

	public Deck() 
	{
		Deck[] Deck = new Deck[cards.length];
		//throw new RuntimeException("Not yet implemented.");
	}

	public Deck(Deck other) 
	{
		this.other = other;
		
	//throw new RuntimeException("Not yet implemented.");
	}

	public Card getCardAt(int position) 
	{
		
		//throw new RuntimeException("Not yet implemented.");
	}

	public int getNumCards() 
	{
		for(int i = 0; i < cards.length; i++)
		{
			if(cards.getValue() < 11)
			{
				
			}
		}
		//throw new RuntimeException("Not yet implemented.");
	}

	/* hint: even and odd */
	public void shuffle() 
	{
		throw new RuntimeException("Not yet implemented.");
	}

	public void cut(int position) 
	{
		throw new RuntimeException("Not yet implemented.");
	}

	public Card[] deal(int numCards) 
	{
		throw new RuntimeException("Not yet implemented.");
	}
 
}

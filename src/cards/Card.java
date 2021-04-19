package cards;

public class Card {
private int num,suit;
/*construct a card*/
public Card(int num,int suit){
	this.num=num;
	this.suit=suit;
}
	public int getNum()
	{
		return num;
	}
	public int getSuit()
	{
		return suit;
	}
	public String toString()
	{
		switch(suit)//attach the proper suit letter according to its number
		{
			case 0:
				return num+"C";
			case 1:
				return num+"D";
			case 2:
				return num+"H";
			case 3:
				return num+"S";
			default:
				return null;
		}
	}
	//compare 2 cards via suit and number
	public int compareTo(Card other) {
		if(suit == other.getSuit() && num == other.getNum())
			return 0;
		if( num == other.getNum())
			return suit > other.getSuit()? 1:-1;
		return num<other.getNum()? -1:1;
	}
	

}

package cards;

public class Deck {
	private Card []cards; // an aray of cards
	private int numOfCards; // num of cards in a deck

	/*construcs a deck with num cards*/
	public Deck(int num) {
		numOfCards=num*4;
		cards=new Card[numOfCards]; 
		for(int i=0;i<num;i++)//loop for number
		{
			for(int j=0;j<4;j++)//loop for suit
				cards[(i*4)+j]=new Card(i,j);//fill array with cards 
		}
		
	}
	/*construct a deck by taking a given number of cards from another deck
	*/
	public Deck(Deck from,int num) {
		
		numOfCards=num;
		cards=new Card[numOfCards];//initialize the cards array
		for(int i=0;i<num;i++)
			cards[i]=from.takeOne();
	}
	
/*construct a deck by taking all the cards from 2 given decks*/
	public Deck(Deck first,Deck second) {
		
		int firstLen=first.getNumCards();
		int secondLen=second.getNumCards();
		int i=0,cnt=0;
		cards=new Card[firstLen+secondLen];
		while(cnt<firstLen && cnt<secondLen)//while one of the dekcs still has cards 
		{
			cards[i]=first.takeOne();//take card from first
			cards[i+1]=second.takeOne();//take card from last
			i+=2;//index cnt
			cnt++;//loop cnt
		}
		/*2 whiles for our tail. if one of the decks still has cards one of the whiles will run and fill the array*/
		while(cnt<firstLen)
		{
			cards[i]=first.takeOne();
			i++;
			cnt++;
		}
		while(i<secondLen)
		{
			cards[i]=second.takeOne();
			i++;
			cnt++;
		}
		numOfCards=i;
	}
	/*take a card from deck*/
	public Card takeOne() {	
		if(numOfCards==0) return null;
		numOfCards--;
		return cards[numOfCards];
		
	}
	/*return the number of cards in deck*/
	public int getNumCards(){
		return numOfCards;
	}
	/*print the cards in the deck*/
	public String toString() {
		int i;
		String str="[";
		for( i=0;i<numOfCards-1;i++) {
			str+=cards[i].toString();
			str+=", ";
		}
		str+=cards[i].toString()+"]";
		return str;
	}
	/*sort the deck*/
	public void sort() {
		
		for (int i=numOfCards-1;i>0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				
				if(cards[j].compareTo(cards[j+1])>0)//if the current card is bigger from the next one, swap
				{
					Card temp=cards[j];
					cards[j]=cards[j+1];
					cards[j+1]=temp;
				}
			}
		}
		
		
	}
}

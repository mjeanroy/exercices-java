package exercices.deck;

public class Card implements Comparable<Card>{
	
	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	@Override
	public String toString() {
		return rank + " of " + suit;
	}

	@Override
	public int compareTo(Card c) {
		if(this.suit.compareTo(c.getSuit()) == 0){
			return this.rank.compareTo(c.getRank());
		}else{
			return this.suit.compareTo(c.getSuit());
		}
	}
	
	
	
}

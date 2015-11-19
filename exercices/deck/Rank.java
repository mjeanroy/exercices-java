package exercices.deck;

//enum Rank {SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE};

public enum Rank {
	
	SEVEN("SEVEN"),
	EIGHT("EIGHT"),
	NINE("NINE"),
	TEN("TEN"),
	JACK("JACK"),
	QUEEN("ACE"),
	KING("KING"),
	ACE("ACE");
	
	private String val;
	
	Rank(String val){
		this.val = val;
	}
	
	
	
}

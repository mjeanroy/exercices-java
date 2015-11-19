package exercices.deck;

import java.util.ArrayList;
import java.util.List;

public class DeckTools {
	public static List<Card> newDeck(){
		List<Card> deck = new ArrayList<>();
		
		for(Rank r : Rank.values()){
			for(Suit s : Suit.values()){
				deck.add(new Card(r, s));
			}
		}
		
		return deck;
	}
}

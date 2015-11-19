package exercices.deck;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainDeck {

	public static void main(String[] args) {
		List<Card> deck = DeckTools.newDeck();
		Collections.sort(deck);
		System.out.println(deck);
	}

}

import java.util.Collections;
import java.util.LinkedList;

public class Deck {
    LinkedList<Card> cards = new LinkedList<>();

    public void addDeckToCardsList() {
        for (Card.suitEnum suit : Card.suitEnum.values()) {
            for (int i = 2; i < 15; i++) {
                Card newCard = new Card(i,suit);
                cards.add(newCard);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

}
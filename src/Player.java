import java.util.ArrayList;

public class Player {
    String name;
    char position;
    ArrayList<Card> hand = new ArrayList<>();

    public void printHand() {
        for (Card card : this.hand) {
            card.printShortCard();
        }
    }

    public Player(String name, char position) {
        this.name = name;
        this.position = position;
    }
}

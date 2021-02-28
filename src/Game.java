import java.util.LinkedList;

public class Game {
    Deck deck = new Deck();
    LinkedList<Player> players = new LinkedList<>();
    int startingHandSize;
    int currentHandSize;

    public void dealCards() {
        for (Player player : players) {
            for (int j = 0; j < currentHandSize; j ++) {
                player.addCardToHand(deck.cards.poll());
            }
        }
    }

    public void sortHands() {
        for (Player player: players) {
            player.hand.sort();
        }
    }

    public void printHands() {
        for (Player player : players) {
            player.printHand();
        }
    }

    public Game(String player1Name, String player2Name, String player3Name, String player4Name, int startingHandSize) {
        players.add(new Player(player1Name, 'N'));
        players.add(new Player(player2Name, 'E'));
        players.add(new Player(player3Name, 'S'));
        players.add(new Player(player4Name, 'W'));
        this.startingHandSize = startingHandSize;
        this.currentHandSize = startingHandSize;
        deck.addDeckToCardsList();
        deck.shuffle();
        dealCards();
        sortHands();
        printHands();
    }
}

import java.util.LinkedList;

public class Game {
    Deck deck = new Deck();
    String player1Name;
    String player2Name;
    String player3Name;
    String player4Name;
    LinkedList<Player> players = new LinkedList<>();
    int startingHandSize;
    int currentHandSize;


    public void addPlayers() {
        players.add(new Player(player1Name, 'N'));
        players.add(new Player(player2Name, 'E'));
        players.add(new Player(player3Name, 'S'));
        players.add(new Player(player4Name, 'W'));
    }

    public void dealCards(Deck deck, int currentHandSize) {
        for (Player player : players) {
            for (int j = 0; j < currentHandSize; j ++) {
                player.hand.add(deck.cards.poll());
            }
        }
    }

    public void printHands() {
        for (Player player : players) {
            System.out.println(player.name + "'s hand");
            player.printHand();
        }
    }

    public Game(String player1Name, String player2Name, String player3Name, String player4Name, int startingHandSize) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
        this.player3Name = player3Name;
        this.player4Name = player4Name;
        this.startingHandSize = startingHandSize;
        this.currentHandSize = startingHandSize;
        addPlayers();
        deck.shuffle();
    }
}

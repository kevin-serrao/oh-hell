

public class Player {
    String name;
    char position;
    Hand hand = new Hand();

    public Player(String name, char position) {
        this.name = name;
        this.position = position;
    }

    public void printHand () {
        System.out.println(name + "'s hand");
        hand.printHand();
    }

    public void addCardToHand(Card card) {
        this.hand.cards.add(card);
    }
}

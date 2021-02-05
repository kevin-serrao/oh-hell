public class Card {
    int rank;
    public enum suitEnum {
        SPADES, HEARTS, CLUBS, DIAMONDS;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }
    suitEnum suit;

    public char suitToShort(suitEnum suit) {
        char shortSuit;
        shortSuit = '\0';
        switch (suit) {
            case SPADES -> shortSuit = 'S';
            case HEARTS -> shortSuit = 'H';
            case CLUBS -> shortSuit = 'C';
            case DIAMONDS -> shortSuit = 'D';
        }
        return shortSuit;
    }

    public void printShortCard() {
        if (rank == 14) {
            System.out.println("A-" + suitToShort(suit));
        } else if (rank == 13) {
            System.out.println("K-" + suitToShort(suit));
        } else if (rank == 12) {
            System.out.println("Q-" + suitToShort(suit));
        } else if (rank == 11) {
            System.out.println("J-" + suitToShort(suit));
        } else {
            System.out.println(rank + "-" + suitToShort(suit));
        }
    }


    public void printLongCard() {
        if (rank == 14) {
            System.out.println("Ace of " + suit);
        } else if (rank == 13) {
            System.out.println("King of " + suitToShort(suit));
        } else if (rank == 12) {
            System.out.println("Queen of " + suitToShort(suit));
        } else if (rank == 11) {
            System.out.println("Jack of " + suitToShort(suit));
        } else {
            System.out.println(rank + " of " + suit);
        }
    }

    public Card(int rank, suitEnum suit) {
        this.rank = rank;
        this.suit = suit;
    }
}

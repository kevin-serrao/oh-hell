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

    public Card(int rank, suitEnum suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public void printShortCard() {
        System.out.println(returnShortCard());
    }

    public String returnShortCard() {
        if (rank == 14) {
            return("A-" + suitToShort(suit));
        } else if (rank == 13) {
            return ("K-" + suitToShort(suit));
        } else if (rank == 12) {
            return ("Q-" + suitToShort(suit));
        } else if (rank == 11) {
            return ("J-" + suitToShort(suit));
        } else {
            return (rank + "-" + suitToShort(suit));
        }
    }

    public String suitToShort(suitEnum suit) {
        String shortSuit;
        shortSuit = "\0";
        switch (suit) {
            case SPADES -> shortSuit = "S";
            case HEARTS -> shortSuit = "H";
            case CLUBS -> shortSuit = "C";
            case DIAMONDS -> shortSuit = "D";
        }
        return shortSuit;
    }

    public void printLongCard() {
        System.out.println(returnLongCard());
    }

    public String returnLongCard() {
        if (rank == 14) {
            return ("Ace of " + suit);
        } else if (rank == 13) {
            return ("King of " + suit);
        } else if (rank == 12) {
            return ("Queen of " + suit);
        } else if (rank == 11) {
            return ("Jack of " + suit);
        } else {
            return (rank + " of " + suit);
        }
    }

}

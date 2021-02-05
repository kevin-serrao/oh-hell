public class Main {
    public static void main(String[] args) {
        Game newGame = new Game("Kevin", "James", "Tim", "Peter",12);
        newGame.dealCards(newGame.deck, newGame.currentHandSize);
        newGame.printHands();


    }
}

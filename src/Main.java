public class Main {
    public static void main(String[] args) {
        Game newGame = new Game("Kevin", "James", "Tim", "Peter",12);
        newGame.dealCards(newGame.deck, newGame.currentHandSize);
        for (int i = 0; i < newGame.players.size(); i++) {
            System.out.println(newGame.players.get(i).name + "'s hand");
            newGame.players.get(i).printHand();
        }

    }
}

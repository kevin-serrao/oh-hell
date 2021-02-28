import java.util.LinkedList;

public class Hand extends Deck{
    public void sort() {
        LinkedList<Card> sortedCards = new LinkedList<>();
        sortedCards.add(cards.poll());

        while (cards.size() > 0) {
            Card unsortedCard = cards.poll();
            int sortedCardsSize = sortedCards.size();

            for (Card currentSortedCard : sortedCards) {
                if (unsortedCard.suit == currentSortedCard.suit) {
                    if (unsortedCard.rank < currentSortedCard.rank) {
                        sortedCards.add(sortedCards.indexOf(currentSortedCard), unsortedCard);
                    } else {
                        if (sortedCards.indexOf(currentSortedCard) + 1 == sortedCards.size()) {
                            sortedCards.add(unsortedCard);
                        } else {
                            Card nextSortedCard = sortedCards.get(sortedCards.indexOf(currentSortedCard) + 1);
                            if (unsortedCard.suit != nextSortedCard.suit || unsortedCard.rank < nextSortedCard.rank) {
                                sortedCards.add(sortedCards.indexOf(nextSortedCard), unsortedCard);
                            } else {
                                continue;
                            }
                        }
                    }
                    break;
                }
            }

            if (sortedCardsSize != sortedCards.size()) {
                continue;
            }
            sortedCards.add(unsortedCard);
        }
        cards = sortedCards;
    }

    public void printHand() {
        for (Card card : cards) {
            System.out.println(card.returnShortCard());
        }
    }
}

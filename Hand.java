import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>(5);
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void removeCard(Card card) {
        this.cards.remove(card);
    }
    
    public int getSize() {
        return this.cards.size();
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public void getCardsInHand() {
        for (Card card : this.cards) {
            System.out.println(card.toString());
        }
    }
}

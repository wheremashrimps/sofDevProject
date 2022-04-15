import java.util.ArrayList;

public class DeckOfCards {
    
    private ArrayList<Card> deck;
    private ArrayList<Card> cardsRemoved;
    private int size = 52;

    public DeckOfCards(){

        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Rank r : Card.Rank.values()) {
                deck.add(new Card(s, r));
            }
        }
        shuffle();
    }
    public void removeCard(){
        cardsRemoved.add(deck.remove(0));
        size--;
    }

    public void shuffle(){
        for (int i = 0; i < size; i++) {
            int rand = (int) (Math.random() * size);
            Card temp = deck.get(i);
            deck.set(i, deck.get(rand));
            deck.set(rand, temp);
        }
    }

    public boolean isEmpty(){
        if (deck.size() == 0){
            return true;
        }
        return false;
    }
}


    

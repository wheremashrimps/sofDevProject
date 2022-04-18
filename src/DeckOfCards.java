package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
//@modified by Team Shrimps

public class DeckOfCards extends GroupOfCards {
    private ArrayList<Card> cards;
    protected int size;

    public DeckOfCards(int size) {
        super(size);
        this.size = 52;
        this.cards = new ArrayList<Card>();
        this.generateDeck();
        this.shuffle();
    }

    public void generateDeck() {
        for (Card.Suit c : Card.Suit.values()) {
            for (Card.Rank r : Card.Rank.values()) {
                cards.add(new Card(c, r));
            }
        }

    }

    @Override
    public ArrayList<Card> getCards() {
        return cards;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

}

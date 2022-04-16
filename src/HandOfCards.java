package ca.sheridancollege.project;

import java.util.ArrayList;
//@modified by Team Shrimps
public class HandOfCards extends GroupOfCards {

    private Player player;
    private int size;
    protected ArrayList<Card> hand;


    public HandOfCards(int size) {
        super(size);
        this.size = 0;
        this.cards = new ArrayList<Card>();
        this.player=player;
       
    }
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    @Override 
    public ArrayList<Card> getCards() {
        return cards;
    }

    /**
     * A method that will add a card to the hand of cards
     *
     * @param card the card to be added to the hand of cards
     */
   

    public void setPlayer(Player player) {
        this.player = player;
    }
    public Player getPlayer() {
        return player;
    }


    /**
     * @return the size of the group of cards
     */
    @Override 
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    @Override 
    public void setSize(int size) {
        this.size = size;
    }

}//end class
    


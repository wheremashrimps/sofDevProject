/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * //@modified by Team Shrimps
 */
public class Player {

    private String name; //the unique name for this player
    private GroupOfCards hand; //the hand of cards held by this player
    private int pairs;
    private GroupOfCards pairsHand;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        this.hand = new HandOfCards(0);
        this.pairs = 0;
        this.pairsHand = new HandOfCards(0);
    }
    public Player(String name, GroupOfCards hand) {
        this.name = name;
        this.hand = hand;
        this.pairs = 0;
    }


    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    public void drawHand(GroupOfCards deck) {
        for (int i = 0; i < 5; i++) {
            this.hand.cards.add(deck.cards.remove(0));
            deck.setSize(deck.cards.size());
        
        }
    }
    public void drawCard(GroupOfCards deck){
        if (deck.cards.size() > 0) {
            this.hand.cards.add(deck.cards.remove(0));
            deck.setSize(deck.cards.size());
        }
       
        
    }
    public void giveCard(Player nextPlayer, Card card){
        if(this.hand.cards.contains(card)){
            nextPlayer.hand.cards.add(this.hand.remove(card));
            this.hand.setSize(this.hand.cards.size());
            nextPlayer.hand.setSize(nextPlayer.hand.cards.size());
            this.pairs++;
            }
    }

    public void takeCard(Player nextPlayer, Card card){
        if (nextPlayer.hand.cards.size() > 0 && this.askCard(nextPlayer, card)){
            this.hand.cards.add(nextPlayer.hand.remove(card));
            nextPlayer.hand.setSize(nextPlayer.hand.cards.size());
            this.hand.setSize(this.hand.cards.size());
            this.pairs++;
        }
    }
    public void setPairs(int pairs){
        this.pairs = pairs;
    }
    public int getPairs(){
        return this.pairs;
    }
    public int checkPairs(){
        int pairs = 0;
        for (int i = 0; i < this.hand.cards.size(); i++) {
            for (int j = i+1; j < this.hand.cards.size(); j++) {
                if(this.hand.cards.get(i).getRank() == this.hand.cards.get(j).getRank()){
                    pairs++;
                    //remove pairs and add to pairsHand
                    this.pairsHand.cards.add(this.hand.cards.remove(i));
                    this.pairsHand.cards.add(this.hand.cards.remove(j-1));
                    this.hand.setSize(this.hand.cards.size());
                    this.pairsHand.setSize(this.pairsHand.cards.size());
                }
            }
        }
        return pairs;
    }
    public boolean askCard(Player nextPlayer, Card card){
        if(nextPlayer.hand.cards.contains(card)){
            return true;
        }
        return false;

    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }


}

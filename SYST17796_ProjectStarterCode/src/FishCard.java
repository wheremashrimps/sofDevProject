package ca.sheridancollege.project;

public class FishCard extends Card {

    public FishCard(Suit suit, Rank rank) {
        super(suit, rank);
       
    }

    @Override
    public String toString() {
       
        return this.getSuit() + " " + this.getRank();
    }
    
    
}

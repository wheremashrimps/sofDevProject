package ca.sheridancollege.project;
    public class DeckOfCards extends GroupOfCards {
        public DeckOfCards(int size) {
         super(size);  
         this.setSize(52);

      }

        private int handSize = 52;
        public FishCard[] cards = new FishCard[handSize];
     
        //A method which generate a deck of cards
     
        public void generateDeck ()
        {
           int countCards = 0;
     
           for (FishCard.Suit c : FishCard.Suit.values()) {
              for (FishCard.Rank r : FishCard.Rank.values()) {
                 cards[countCards] = (new FishCard(c, r));
                 countCards++;
              }
     
           }
     
     
        }
     
     }
    

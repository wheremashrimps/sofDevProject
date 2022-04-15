public class Start {
    public static void main(String[] args) {
        // Create a new player
        Player player = new Player("John");
        // Create a new card
        Card card = new Card(Card.Suit.HEARTS, Card.Rank.ACE);
        // Add the card to the player's hand
        player.addCard(card);
        // Print the player's hand
        player.getHand().getCardsInHand();
    }
}
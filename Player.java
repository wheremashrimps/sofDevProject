public class Player {
    
    private String name;
    private Hand hand;
    private int id;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        this.id = generateId();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void addCard(Card card) {
        this.hand.addCard(card);
    }

    public void removeCard(Card card) {
        this.hand.removeCard(card);
    }

    public int getId() {
        return id;
    }

    public int generateId() {
        this.id = (int) (Math.random() * 100);
        return this.id;
    }
}

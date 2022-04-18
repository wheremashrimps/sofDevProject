package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

public class GoFishGame extends Game {
    private static String name;// the title of the game
    private ArrayList<Player> players;// the players of the game
    private String winner = "";
    private int turn;// random int between 0 and the number of players
    public DeckOfCards deck;

    public GoFishGame(String name) {
        super(name);
        GoFishGame.name = name;
        this.players = new ArrayList<Player>();
        this.deck = new DeckOfCards(52);
        this.turn = (int) (Math.random() * players.size());

    }

    public GoFishGame(String name, ArrayList<Player> players) {
        super(name);
        GoFishGame.name = name;
        this.players = new ArrayList<Player>();
        this.setPlayers(players);
        this.deck = new DeckOfCards(52);
        this.turn = (int) (Math.random() * players.size());

    }

    public void changeTurn() {
        this.turn = (this.turn + 1) % this.players.size();
    }

    public int getTurn() {
        return this.turn;
    }

    public void checkWinner() {

        if (players.get(0).checkPairs() > players.get(1).checkPairs()
                && players.get(0).checkPairs() > players.get(2).checkPairs()
                && players.get(0).checkPairs() > players.get(3).checkPairs()) {

            this.winner = players.get(0).getName();
        } else if (players.get(1).checkPairs() > players.get(0).checkPairs()
                && players.get(1).checkPairs() > players.get(2).checkPairs()
                && players.get(1).checkPairs() > players.get(3).checkPairs()) {
            System.out.println("Player 2 wins!");
            this.winner = players.get(1).getName();
        } else if (players.get(2).checkPairs() > players.get(0).checkPairs()
                && players.get(2).checkPairs() > players.get(1).checkPairs()
                && players.get(2).checkPairs() > players.get(3).checkPairs()) {
            System.out.println("Player 3 wins!");
            this.winner = players.get(2).getName();
        } else if (players.get(3).checkPairs() > players.get(0).checkPairs()
                && players.get(3).checkPairs() > players.get(1).checkPairs()
                && players.get(3).checkPairs() > players.get(2).checkPairs()) {
            System.out.println("Player 4 wins!");
            this.winner = players.get(3).getName();
        } else {
            System.out.println("It's a tie!");
            this.winner = "TIE";
        }

    }

    public void populateGame() {
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < 4; i++) {
                System.out.println("Please enter the name of Player " + (i + 1));
                String name = input.nextLine();
                this.players.add(new Player(name));
                this.players.get(i).drawHand(deck);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public void declareWinner() {
        if (this.winner == "TIE") {
            System.out.println("It's a tie!");
        } else {
            System.out.println(this.winner + " wins!");
        }

    }

    @Override
    public void play() {
        System.out.println("Welcome to Go-Fish!");
        this.populateGame();
        System.out.println(this.players.size());

    }

}

package ca.sheridancollege.project;

import java.util.ArrayList;

public class GoFishGame extends Game {
    private static String name = "";//the title of the game
    private ArrayList<Player> players;// the players of the game
    private String winner="";
    private int turn = //random int between 0 and the number of players
            (int) (Math.random() * players.size());

    public GoFishGame(String name) {
        super(name);
        this.name = name;
        players = new ArrayList<Player>();

    
    }
    public GoFishGame(String nam, ArrayList<Player> players) {
        super(name);
        this.name = name;
        this.setPlayers(players);
      
    }

    public void changeTurn() {
        turn = (turn + 1) % players.size();
    }
    public int getTurn() {
        return turn;
    }

    public void checkWinner(){
        
        if (players.get(0).checkPairs() > players.get(1).checkPairs() && players.get(0).checkPairs() > players.get(2).checkPairs() && players.get(0).checkPairs() > players.get(3).checkPairs()){

           this.winner = players.get(0).getName();
        }
        else if (players.get(1).checkPairs() > players.get(0).checkPairs() && players.get(1).checkPairs() > players.get(2).checkPairs() && players.get(1).checkPairs() > players.get(3).checkPairs()){
            System.out.println("Player 2 wins!");
            this.winner = players.get(1).getName();
        }
        else if (players.get(2).checkPairs() > players.get(0).checkPairs() && players.get(2).checkPairs() > players.get(1).checkPairs() && players.get(2).checkPairs() > players.get(3).checkPairs()){
            System.out.println("Player 3 wins!");
            this.winner = players.get(2).getName();
        }
        else if (players.get(3).checkPairs() > players.get(0).checkPairs() && players.get(3).checkPairs() > players.get(1).checkPairs() && players.get(3).checkPairs() > players.get(2).checkPairs()){
            System.out.println("Player 4 wins!");
            this.winner = players.get(3).getName();
        }
        else{
            System.out.println("It's a tie!");
            this.winner = "TIE";
        }
    
    }

 
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    @Override
    public void declareWinner() {
        if (this.winner == "TIE"){
            System.out.println("It's a tie!");
        }
        else{
            System.out.println(this.winner + " wins!");
        }
        
    }
    
}

package u6pp;

import java.util.ArrayList;

public class Uno {
    private ArrayList<Player> players;
    private CardStack deck;
    private CardStack discard;
    private int currentPlayerIndex;
    private boolean reversed;
    
    // constructor 
    public Uno(ArrayList<Player> players, CardStack deck, CardStack discard, int startingPlayerIndex, boolean reversed) {
        this.players = players;
        this.deck = deck;
        this.discard = discard;
        this.currentPlayerIndex = startingPlayerIndex;
        this.reversed = reversed;
    }
    //  constructor but for the number of players added to a new array list
    public Uno(int numPlayers) {
        players = new ArrayList<Player>(numPlayers);
        for (int i = 0; i < numPlayers; i++) {
            players.add(new Player(null));
        }
    }
    // returns list of players
    public ArrayList<Player> getPlayers() {
        return players;
    }
    // returns the currect player
    public Player getCurrentPlayer() {
        return players.get(currentPlayerIndex);
    }
    // returns the next player 
    public Player getNextPlayer() {
        int nextPlayerIndex;
        if (reversed) {
            nextPlayerIndex = currentPlayerIndex - 1;
            if (nextPlayerIndex < 0) {
                nextPlayerIndex = players.size() - 1;
            }
        } else {
            nextPlayerIndex = currentPlayerIndex + 1;
            if (nextPlayerIndex >= players.size()) {
                nextPlayerIndex = 0;
            }
        }
        return players.get(nextPlayerIndex);
    }
    // returns the top card of the discard pile
    public Card getTopDiscard() {
        return discard.peek();
    }
    // returns the winner of the game 
    public Player getWinner() {
        for (Player player : players) {
            if (player.getHand().size() == 0) {
                return player;
            }
        }
        return null;
    }
    // i want to go to sleep like what even is this there are legit like 20 tests for this method bro like everything i add reverses a previous test i pass or makes my code worse bro like i just want to go to sleep or eat some good as food
    public boolean playCard(Card card, String color) {
        return false;
    }
}
package u6pp;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    // constructor
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    // getters 
    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
    // checks if the player has one card and says "has Uno lol you bots" if so 
    public void callUno() {
        if (hand.size() == 1) {
            System.out.println(name + "has Uno lol you bots ");
        }
    }
    // allows for players to draw cards when avaliable, if not, says "there are no more cards you bot stop trying to draw" then stops
    public void drawCards(CardStack stack, int numCards) {
        for (int i = 0; i < numCards; i++) {
            Card card = stack.pop();
            if (card == null) {
                System.out.println("there are no more cards you bot stop trying to draw");
                break;
            }
            hand.add(card);
        }
    }
}
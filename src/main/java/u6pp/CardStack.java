package u6pp;

import java.util.ArrayList;

import java.util.Random;

public class CardStack {
    private ArrayList<Card> stack;
    // constructor 
    public CardStack() {
        stack = new ArrayList<Card>();
    }

    public Card peek() {
        if (isEmpty() == true) {
            return null;
        } else {
            return stack.get(stack.size() - 1);
        }
    }
    // checks if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    // gets the size of the stack
    public int getSize() {
        return stack.size();
    }
    // adds a card to the top of the stack 
    public void push(Card card) {
        stack.add(card);
    }
    // removes and returns the top card from the stack
    public Card pop() {
        if (isEmpty() == true) {
            return null;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }
    // clears stack 
    public void clear() {
        stack.clear();
    }
    // basically adds all the cards from the other stack to the current stack in reverse making it one stack with the other stack added to the top 
    public void addAll(CardStack other) {
        Card[] cards = new Card[other.getSize()];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = other.pop();
        }
        for (int i = cards.length - 1; i >= 0; i--) {
            push(cards[i]);
        }
    }
    // generates a random number and swaps the card at the current postion with a random card from the unshulled cards in the stack using swap
    public void shuffle() {
        Random rand = new Random();
        for (int i = stack.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            swap(i, j);
        }
    }
    //helper method to swap the two cards at the same index's 
    private void swap(int i, int j) {
        Card temp = stack.get(i);
        stack.set(i, stack.get(j));
        stack.set(j, temp);
    }
}
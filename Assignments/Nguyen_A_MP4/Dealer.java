import java.util.*;

public class Dealer {
    //private attribute
    private Deck m_deck;

    //default constructor
    public Dealer() {
        m_deck = new Deck(); //makes 52 cards, from the default constructor we built
    }

    //deals method
     public LinkedList<Card> deals(int n) { //n represents amount of cards being dealt

        LinkedList<Card> dealtHand = new LinkedList<Card>(); //initialize empty linked list to populate cards with

        if (m_deck.size() == 0) { //if it is empty, return linked list with length 0
            return dealtHand; //since deck is empty, then we just return the empty linked list that we created
        }

        for (int i = 0; i < n; i++) { //deal n times - meaning deal n number of cards
            dealtHand.add(m_deck.deal()); //add the card dealt from the deal method in Deck.java to our empty linked list here
            if (m_deck.size() == 0) {
                return dealtHand;
            }
        }
        return dealtHand; //return linked list after dealing all cards
     }

    //size method
    public int size() {
        return m_deck.size();
    }

    //toString method
    public String toString() {
        return m_deck.toString();
    }

    //main test
    public static void main(String[] args) {
    Dealer dealer = new Dealer();

    System.out.println("Dealer size should be 52:");
    System.out.println(dealer.size());

    System.out.println("--------------------");

    LinkedList<Card> hand = dealer.deals(5);

    System.out.println("Dealt hand should have 5 cards:");
    System.out.println(hand);

    System.out.println("Hand size should be 5:");
    System.out.println(hand.size());

    System.out.println("Dealer size should now be 47:");
    System.out.println(dealer.size());

    System.out.println("--------------------");

    LinkedList<Card> restOfDeck = dealer.deals(100);

    System.out.println("Tried to deal 100 cards, but only the remaining 47 should come out:");
    System.out.println("Cards dealt: " + restOfDeck.size());

    System.out.println("Dealer size should now be 0:");
    System.out.println(dealer.size());

    System.out.println("--------------------");

    LinkedList<Card> emptyHand = dealer.deals(5);

    System.out.println("Dealing from empty deck should give size 0:");
    System.out.println(emptyHand.size());
}

}

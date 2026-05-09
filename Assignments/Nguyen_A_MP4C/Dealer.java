/*
Andy Nguyen
Worked in partnership with N/A
2493321
annguyen@chapman.edu
CPSC231-04
MP4C - Egyptian Rat Slap
Date completed: April 24, 2026
Uses a Deck object to deal random hands of cards and report how many cards remain.
*/

import java.util.*;

/**
 * Represents a dealer that owns a deck and deals cards from it.
 *
 * @author Andy Nguyen
 * @version 1.0
 */
public class Dealer {
    //private attribute
    private Deck m_deck;

    /**
     * Creates a dealer with a new full deck.
     */
    public Dealer() {
        m_deck = new Deck(); //makes 52 cards, from the default constructor we built
    }

    /**
     * Deals up to the requested number of cards from the deck.
     *
     * @param n the number of cards requested
     * @return a hand containing the dealt cards
     */
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

    /**
     * Returns the number of cards left in the dealer's deck.
     *
     * @return the deck size
     */
    public int size() {
        return m_deck.size();
    }

    /**
     * Returns the dealer's remaining deck as a String.
     *
     * @return a String representation of the dealer's deck
     */
    public String toString() {
        return m_deck.toString();
    }

}

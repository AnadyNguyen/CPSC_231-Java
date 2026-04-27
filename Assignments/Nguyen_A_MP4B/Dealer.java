/*
Andy Nguyen
CPSC231-04
annguyen@chapman.edu
2493321
April 24, 2026
MP4B - Uses a Deck object to deal random hands of cards and report how many cards remain.
*/

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

}

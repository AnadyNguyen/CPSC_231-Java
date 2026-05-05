/*
Andy Nguyen
CPSC231-04
annguyen@chapman.edu
2493321
April 24, 2026
Program behavior: Tests the Card, Deck, and Dealer classes by creating cards, decks, and dealt hands.
*/

import java.util.*;

public class TestCards {
    public static void main(String[] args) {
        // constructor
        Card initCard = new Card();
        System.out.println(initCard);
        
        System.out.println("--------------------");

        // copy constructor
        System.out.println("Copy constructor:");
        Card copyCard = new Card(initCard);
        System.out.print("Copy: ");
        System.out.println(copyCard);
        System.out.print("Init: ");
        System.out.println(initCard);
        System.out.println("Are they equal? " + initCard.equals(copyCard));

        System.out.println("--------------------");

        //overloaded constructor
        Card overloadedCard = new Card(7, Card.SPADES);
        Card faceCard = new Card(Card.QUEEN, Card.HEARTS);
        System.out.println("Overloaded constructor:");
        System.out.println(overloadedCard);
        System.out.println(faceCard + "\n");
        System.out.println("Are they equal? " + overloadedCard.equals(faceCard));

        System.out.println("--------------------");

        // getters/accesors
        System.out.println("Getters: \n");
        System.out.println(initCard.getRank());
        Card cardToGetRank = new Card(6, Card.CLUBS);
        Card cardToGetSuit = new Card(7, Card.DIAMONDS);
        System.out.println(cardToGetRank);
        System.out.println(cardToGetSuit);
        System.out.println("Rank: " + cardToGetRank.getRank());
        System.out.println("Suit: " + cardToGetSuit.getSuit() + "\n");
        System.out.println("Are they equal? " + cardToGetRank.equals(cardToGetSuit));

        System.out.println("--------------------");

        // setters/mutators
        System.out.println("Setters: \n");
        System.out.print("overloadedCard before: ");
        System.out.println(overloadedCard);
        overloadedCard.setRank(13);
        System.out.print("overloadedCard after: ");
        System.out.println(overloadedCard);
        System.out.print("initCard before: ");
        System.out.println(initCard);
        initCard.setSuit(3);
        System.out.print("initCard after: ");
        System.out.println(initCard);
        System.out.print("faceCard before: ");
        System.out.println(faceCard);
        faceCard.setRank(5);
        faceCard.setSuit(1);
        System.out.print("faceCard after: ");
        System.out.println(faceCard);

        System.out.println("--------------------");

        //equals method
        Card equalCard = new Card(Card.KING, Card.HEARTS);
        Card equalCard2 = new Card(Card.KING, Card.HEARTS);
        System.out.println("Equals method:");
        System.out.println(initCard + " equals " + equalCard + "? " + cardToGetRank.equals(equalCard));
        System.out.println(equalCard + " equals " + equalCard2 + "? " + equalCard.equals(equalCard2));

        System.out.println("--------------------");

        //Deck tests
        System.out.println("Deck tests:");
        Deck deck1 = new Deck();
        Deck deck2 = new Deck(deck1);

        System.out.println("deck1 size should be 52:");
        System.out.println(deck1.size());
        System.out.println("deck2 copy size should be 52:");
        System.out.println(deck2.size());

        Card dealtCard = deck1.deal();
        System.out.println("Random card dealt from deck1:");
        System.out.println(dealtCard);
        System.out.println("deck1 size should now be 51:");
        System.out.println(deck1.size());
        System.out.println("deck2 size should still be 52:");
        System.out.println(deck2.size());

        System.out.println("--------------------");

        //Dealer tests
        System.out.println("Dealer tests:");
        Dealer dealer = new Dealer();

        System.out.println("Dealer size should be 52:");
        System.out.println(dealer.size());

        LinkedList<Card> hand = dealer.deals(5);
        System.out.println("Dealt hand should have 5 cards:");
        System.out.println(hand);
        System.out.println("Hand size should be 5:");
        System.out.println(hand.size());
        System.out.println("Dealer size should now be 47:");
        System.out.println(dealer.size());

        LinkedList<Card> restOfDeck = dealer.deals(100);
        System.out.println("Tried to deal 100 cards, but only the remaining 47 should come out:");
        System.out.println("Cards dealt: " + restOfDeck.size());
        System.out.println("Dealer size should now be 0:");
        System.out.println(dealer.size());

        LinkedList<Card> emptyHand = dealer.deals(5);
        System.out.println("Dealing from empty deck should give size 0:");
        System.out.println(emptyHand.size());
    }
}

import java.util.*;

public class Deck {
    //the cards of this deck. in other words, the member variables of this class
    private LinkedList<Card> m_cards;

    //default constructor
    public Deck () { 
        m_cards = new LinkedList<Card>();

        for (int i = 0; i <= 3; i++) { //4 suits
            for (int j = 2; j <= 14; j++) { //13 ranks, 2 - 14: 2,3,4,5,6,7,8,9,10,11,12,13,14
                Card card = new Card(j, i); //for loop for each card
                m_cards.add(card); //add card to deck for each iteration
            }
        }
    } 
    //m_cards now has all 52 cards(in order)
    //now, we must copy all of those card into a new object, so changing the old one doesn't change this one

    //deep copy constructor
    public Deck(Deck initDeck){ //copyDeck is going to be a deep copy of m_cards
        m_cards = new LinkedList<Card>(); //a deck in this instance of this certain object(I think)

        for (Card card : initDeck.m_cards) { //for each card object in the initial Deck 
        // (have to use.m_cards method to get the instance of this certain object)

            //copy each card into a new deck
            Card copyCard = new Card(card); //use copy constructor from Card class, make a copy card

            //now add cards into deck each time
            m_cards.add(copyCard);
        }
    }

    //toString method 
    public String toString() {
        String deckOfCards = "";
        for (Card card : m_cards) {
            deckOfCards += card + "\n"; //newline so it's not jumbled up in an array
        }
        return deckOfCards;
    }

    //size method
    public int size() {
        return m_cards.size(); //return the member deck's size in this instance of the object
    }

    //deal method
    public Card deal() {
        Random random = new Random(); //random object
        Card randomDealtCard = null; //make a random card object

        int n = random.nextInt(m_cards.size()); //random index with the size of the deck

        randomDealtCard = m_cards.get(n); //get a random card from the random index
        m_cards.remove(n); //remove the random index in the linked list

        return randomDealtCard; //return the random card
    }


    public static void main(String[] args) { //test main
        Deck deck1 = new Deck();
        Deck deck2 = new Deck(deck1); //copy deck

        System.out.println(deck1.toString());
        System.out.println("New deck/ copy deck: ");
        System.out.println(deck2.toString());

    }
}

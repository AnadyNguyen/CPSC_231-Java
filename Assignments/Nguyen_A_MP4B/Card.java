/*
Andy Nguyen
CPSC231-04
annguyen@chapman.edu
2493321
April 16, 2026
MP4B - Defines a Card object with rank and suit values for use in card games.
*/

public class Card {
    //private member variables
    private int m_suit;  
    private int m_rank; //instance variable of each object
    
    //face cards
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;    

    //suits
    public static final int HEARTS = 0; // final means the value cannot be changed after initialization
    public static final int SPADES = 1;
    public static final int CLUBS = 2;
    public static final int DIAMONDS = 3;

    // constructor
    public Card () {
        m_rank = ACE; 
        m_suit = SPADES; 
    }

    // copy constructor
    public Card (Card copyCard) {
        m_rank = copyCard.m_rank;
        m_suit = copyCard.m_suit;
    }

    //overloaded constructor
    public Card (int rank, int suit) {
        m_rank = rank;
        m_suit = suit;
    }

    // getters/accesors
    public int getRank () {
        return m_rank;
    }

    public int getSuit () {
        return m_suit;
    }

    // setters/mutators
    public void setRank (int rank) { //take parameter from outside the object
        m_rank = rank;
    }

    public void setSuit (int suit) {
        m_suit = suit;
    }

    //seeing what card we have - not quite flipping it over yet
    public String toString () {
        String card = "";
        String currRank;
        String currSuit;

        //rank to string
        switch (m_rank) {
            case JACK:
                currRank = "Jack";
                break;
            case QUEEN:
                currRank = "Queen";
                break;
            case KING:
                currRank = "King";
                break;
            case ACE:
                currRank = "Ace";
                break;         
            default:
                currRank = Integer.toString(m_rank); //Integer wraps the primitive class, which allows us to convert it to a string in order to add it to String s
        }

        //suit to string
        switch (m_suit) {
            case HEARTS:
                currSuit = "Hearts";
                break;
            case SPADES:
                currSuit = "Spades";
                break;
            case CLUBS:
                currSuit = "Clubs";
                break;
            case DIAMONDS:
                currSuit = "Diamonds";
                break;     
            default:
                currSuit = "Unknown";       
        }
        card += currRank + " of " + currSuit; //full card: some rank of some suit
        return card;
    }

    //compare this curent card with other card
    public boolean equals (Card comparingCard) { 
        return (getRank() == comparingCard.getRank());
    }
}  

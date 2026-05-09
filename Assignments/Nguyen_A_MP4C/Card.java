/*
Andy Nguyen
Worked in partnership with N/A
2493321
annguyen@chapman.edu
CPSC231-04
MP4C - Egyptian Rat Slap
Date completed: April 16, 2026
Defines a Card object with rank and suit values for use in the ERS game.
*/

/**
 * Represents a single playing card with a rank and suit.
 *
 * @author Andy Nguyen
 * @version 1.0
 */
public class Card {
    //private member variables
    private int m_suit;  
    private int m_rank; //instance variable of each object
    
    //face cards
    /** Rank value for a Jack. */
    public static final int JACK = 11;
    /** Rank value for a Queen. */
    public static final int QUEEN = 12;
    /** Rank value for a King. */
    public static final int KING = 13;
    /** Rank value for an Ace. */
    public static final int ACE = 14;    

    //suits
    /** Suit value for Hearts. */
    public static final int HEARTS = 0; // final means the value cannot be changed after initialization
    /** Suit value for Spades. */
    public static final int SPADES = 1;
    /** Suit value for Clubs. */
    public static final int CLUBS = 2;
    /** Suit value for Diamonds. */
    public static final int DIAMONDS = 3;

    /**
     * Creates a default card, the Ace of Spades.
     */
    public Card () {
        m_rank = ACE; 
        m_suit = SPADES; 
    }

    /**
     * Creates a new card with the same rank and suit as another card.
     *
     * @param copyCard the card to copy
     */
    public Card (Card copyCard) {
        m_rank = copyCard.m_rank;
        m_suit = copyCard.m_suit;
    }

    /**
     * Creates a card with a specified rank and suit.
     *
     * @param rank the rank of the card
     * @param suit the suit of the card
     */
    public Card (int rank, int suit) {
        m_rank = rank;
        m_suit = suit;
    }

    /**
     * Returns this card's rank.
     *
     * @return the card rank
     */
    public int getRank () {
        return m_rank;
    }

    /**
     * Returns this card's suit.
     *
     * @return the card suit
     */
    public int getSuit () {
        return m_suit;
    }

    /**
     * Sets this card's rank.
     *
     * @param rank the new rank
     */
    public void setRank (int rank) { //take parameter from outside the object
        m_rank = rank;
    }

    /**
     * Sets this card's suit.
     *
     * @param suit the new suit
     */
    public void setSuit (int suit) {
        m_suit = suit;
    }

    /**
     * Returns this card as readable text.
     *
     * @return the rank and suit of the card
     */
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

    /**
     * Compares this card's rank with another card's rank.
     *
     * @param comparingCard the card to compare with this card
     * @return true if both cards have the same rank, false otherwise
     */
    public boolean equals (Card comparingCard) { 
        return (getRank() == comparingCard.getRank());
    }
}  

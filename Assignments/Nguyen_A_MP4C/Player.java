/*
Andy Nguyen
Worked in partnership with N/A
2493321
annguyen@chapman.edu
CPSC231-04
MP4C - Egyptian Rat Slap
Date completed: May 8, 2026
Stores one ERS player's number, hand, and assigned slap pattern.
*/

import java.util.*;

/**
 * Represents one player in the Egyptian Rat Slap game.
 *
 * @author Andy Nguyen
 * @version 1.0
 */
public class Player {
    //member vars
    private int playerNum = 0;
    private LinkedList<Card> hand = new LinkedList<>();
    private String pattern = "";

    /**
     * Creates a player with a player number, a hand of cards, and a slap pattern.
     *
     * @param playerNum the player's identifying number
     * @param playerHand the cards in the player's hand
     * @param patternToLookFor the pattern this player watches for
     */
    public Player(int playerNum, LinkedList<Card> playerHand, String patternToLookFor) {
        this.playerNum = playerNum;
        this.hand = playerHand;
        this.pattern = patternToLookFor;
    }

    /**
     * Removes and returns the card at the top of this player's hand.
     *
     * @return the card removed from position 0 of the hand
     */
    public Card playCard() {
        return this.hand.remove(0);
    }

    /**
     * Checks whether this player should slap the current pile based on their assigned pattern.
     *
     * @param pile the current center pile
     * @return true if this player's pattern is present, false otherwise
     */
    public boolean slaps(LinkedList<Card> pile) {
        //call game static methods to check for pattern
        switch (pattern) {
            case "doubles":
                return Game.doubles(pile);
            case "top bottom":
                return Game.topBottom(pile);
            case "sandwich":
                return Game.sandwich(pile);
            default:
                return false;
        }
    }

    /**
     * Returns this player's number.
     *
     * @return the player number
     */
    public int getPlayerNum() {
        return this.playerNum;
    }

    /**
     * Returns this player's hand.
     *
     * @return the player's hand of cards
     */
    public LinkedList<Card> getHand() {
        return this.hand;
    }

    /**
     * Returns the slap pattern assigned to this player.
     *
     * @return this player's slap pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * Returns a String containing this player's number, hand, and pattern.
     *
     * @return a formatted String describing this player
     */
    public String toString() {
        String s = "";
        s += "Player Number: " + this.playerNum + "\n";
        s += "Hand: " + this.hand + "\n";
        s += "Pattern: " + this.pattern;
        return s;
    }
}

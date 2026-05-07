import java.util.*;

public class Player {
    //member vars
    private int playerNum = 0;
    private LinkedList<Card> hand = new LinkedList<>();
    private String pattern = "";

    //default constructor
    public Player(int playerNum, LinkedList<Card> playerHand, String patternToLookFor) {
        this.playerNum = playerNum;
        this.hand = playerHand;
        this.pattern = patternToLookFor;
    }

    //play card method
    public Card playCard() {
        return this.hand.remove(0);
    }

    //slaps method
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

    //getters
    public int getPlayerNum() {
        return this.playerNum;
    }

    public LinkedList<Card> getHand() {
        return this.hand;
    }

    public String getPattern() {
        return this.pattern;
    }

    //toString method
    public String toString() {
        String s = "";
        s += "Player Number: " + this.playerNum + "\n";
        s += "Hand: " + this.hand + "\n";
        s += "Pattern: " + this.pattern;
        return s;
    }
}

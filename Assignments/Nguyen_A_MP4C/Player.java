import java.util.*;

public class Player {
    private int playerNum = 0;
    private LinkedList<Card> hand = new LinkedList<>();
    private String pattern = "";

    public Player(int playerNum, LinkedList<Card> playerHand, String patternToLookFor) {
        this.playerNum = playerNum;
        hand = playerHand;
        pattern = patternToLookFor;
    }

    public boolean slaps (LinkedList<Card> pile) {
        //call game static method to check for pattern
        if (pattern == pile) {
        //if pattern in play:
            return true;
        }

        //if not: 
        // return false;
    }

    public int getPlayerNum() {
        return this.playerNum;
    }

    public LinkedList<Card> getHand() {
        return this.hand;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String toString() {
        System.out.println();
    }
}

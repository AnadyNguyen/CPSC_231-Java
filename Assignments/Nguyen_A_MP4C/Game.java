/*
Andy Nguyen
Worked in partnership with N/A
2493321
annguyen@chapman.edu
CPSC231-04
MP4C - Egyptian Rat Slap
Date completed: May 8, 2026
Simulates a simplified Egyptian Rat Slap game with randomized player patterns.
*/

import java.util.*;

/**
 * Simulates a simplified game of Egyptian Rat Slap using players, a dealer, and a center pile.
 *
 * @author Andy Nguyen
 * @version 1.0
 */
public class Game {

    //private member vars
    private LinkedList<Player> players;
    private LinkedList<Card> pile;
    private Dealer dealer;
    private String[] patterns = {"doubles", "top bottom", "sandwich"};

    //random objects and pattern index to get pattern
    Random rand = new Random();
    int patternIndex;

    /**
     * Creates a default game with two players and deals the full deck evenly between them.
     */
    public Game() {
        //construct players, piles and dealers for the game
        this.players = new LinkedList<Player>();
        this.pile = new LinkedList<Card>();
        this.dealer = new Dealer();

        //deal to 2 people - default, and then randomizes each player's pattern
        for (int i = 1; i <= 2; i++) {
            patternIndex = rand.nextInt(3);
            this.players.add(new Player(i, dealer.deals(26), patterns[patternIndex]));
        }
    }

    /**
     * Creates a game with the given number of players and deals the full deck among them.
     *
     * @param numPlayers the number of players in the game
     */
    public Game(int numPlayers) {
        //same as default, construct stuff for game
        this.players = new LinkedList<Player>();
        this.pile = new LinkedList<Card>();
        this.dealer = new Dealer();

        //logic to deal cards evenly
        int individualHands = 52 / numPlayers;
        int extraCards = 52 % numPlayers;

        //deal to numPlayers, randomize each pattern
        for (int i = 1; i <= numPlayers; i++) {
            patternIndex = rand.nextInt(3);
            this.players.add(new Player(i, dealer.deals(individualHands), patterns[patternIndex]));
        }

        //deal extra card, probably to the first few people in players linked list
        for (int i = 0; i < extraCards; i++) {
            LinkedList<Card> extraCard = dealer.deals(1);
            players.get(i).getHand().add(extraCard.get(0));
        }
    }

    /**
     * Runs the Egyptian Rat Slap simulation until one player has all 52 cards.
     *
     * @return the player number of the winning player
     */
    public int play() {
        //player variables 
        Player playingPlayer = players.getFirst(); //first player that will play
        Player winningPlayer = getPlayerWithMostCards(); //set winningPlayer to whoever has most cards, even if it is outside the loop

        //initialize round to 1
        int round = 1; 

        //game loop while the player with the most cards doesn't have 52 cards yet
        while (winningPlayer.getHand().size() != 52) {
            //track winningPlayer inside loop
            winningPlayer = getPlayerWithMostCards();

            //if current player's hand has nothing, move on to next player
            if (playingPlayer.getHand().size() == 0) {
                playingPlayer = nextPlayer(playingPlayer);
            }

            //playingPlayer plays a card, and adds to the current LinkedList<Card> pile
            this.pile.add(playingPlayer.playCard());

            //if the pile's last card's rank is greater or equal to a Jack and its rank is also less than or equal to an Ace,
            if (this.pile.getLast().getRank() >= Card.JACK && this.pile.getLast().getRank() <= Card.ACE) {
                /*  
                cards needed to play kind of does nicely here,
                because all the face card's 2nd digit corresponds to the number of chances players get
                */
                int cardsNeeded = this.pile.getLast().getRank() - 10;

                //the next player is faceCarded, then needs to play however many cards on that specific face card
                Player faceCarded = nextPlayer(playingPlayer);
                boolean tenCanceled = false;

                //while cards needed to cancel out the face card is more than 0,
                while (cardsNeeded > 0) {

                    //if whoever got faceCarded's hand is empty, skip to next availible player with cards through the continue line
                    if (faceCarded.getHand().size() == 0) {
                        faceCarded = nextPlayer(faceCarded);
                        continue;
                    }

                    //faceCarded player plays card for each card they need
                    this.pile.add(faceCarded.playCard());

                    //if the faceCarded player plays a 10, it cancels the face card and normal play continues
                    if (this.pile.getLast().getRank() == 10) {
                        tenCanceled = true;
                        playingPlayer = nextPlayer(faceCarded);
                        break;
                    }

                    //block of code for if the faceCarded player plays a face card.
                    if (Card.JACK <= this.pile.getLast().getRank() && this.pile.getLast().getRank() <= Card.ACE) {
                        cardsNeeded = this.pile.getLast().getRank() - 10;
                        playingPlayer = faceCarded;
                        faceCarded = nextPlayer(faceCarded);
                    }

                    //finally, cards needed decreases and loops back
                    else {
                        cardsNeeded--;
                    }
                }

                if (!tenCanceled) {
                    //print out who won on the face card
                    printRoundHeader(round);
                    System.out.println("Player " + playingPlayer.getPlayerNum() + " won the pile on a face card!");
                    System.out.println("Pile: " + this.pile);

                    //remove all cards from pile and give it to playingPlayer who played face card
                    while (this.pile.size() > 0) {
                        playingPlayer.getHand().add(this.pile.removeFirst());
                    }

                    //print round status
                    printPlayersRemaining();
                    round++; //next round
                }
            }

            //block of code for not a face card
            else {

                //new linked list of players that can slap
                LinkedList<Player> canSlap = new LinkedList<Player>();

                //for each player in current player list: 
                for (Player p: players) {

                    //if the player's hand is not empty and it is the pattern they are looking for,
                    if (p.getHand().size() > 0 && p.slaps(this.pile)) {
                        //add player to canSlap list
                        canSlap.add(p);
                    }
                }

                //if there are players that can slap the current pile,
                if (canSlap.size() > 0) {
                    //randomize the slap winner if there are multiple
                    Player slapWinner = canSlap.get(rand.nextInt(canSlap.size()));
                    //and set the playing player to the slapWinner so that whoever slaps is playing the next card
                    playingPlayer = slapWinner;

                    //print round header and status on who slapped the pile
                    printRoundHeader(round);
                    System.out.println("Player " + playingPlayer.getPlayerNum() + " slapped the pile!");
                    System.out.println("Pile: " + this.pile);

                    //give the pile to whoever slapped, since slapWinner is playingPlayer now
                    while (this.pile.size() > 0) {
                        playingPlayer.getHand().add(this.pile.removeFirst());
                    }

                    //print player status
                    printPlayersRemaining();
                    round++;
                }
                else {
                    //move on to next player to play card
                    playingPlayer = nextPlayer(playingPlayer);
                }
            }
        }
        //outside while loop, so while run once the winningPlayer gets 52 cards, and then returns that player
        return winningPlayer.getPlayerNum();
    }

    /**
     * Finds the player who currently has the most cards.
     *
     * @return the player with the largest hand
     */
    private Player getPlayerWithMostCards() {
        Player leader = players.get(0);

        //simple update the max tracker
        for (Player p : players) {
            if (p.getHand().size() > leader.getHand().size()) {
                leader = p;
            }
        }
        return leader;
    }

    /**
     * Finds the next clockwise player who still has cards.
     *
     * @param currPlayer the player whose turn just occurred
     * @return the next player with at least one card
     */
    private Player nextPlayer(Player currPlayer) {
        //new player object to represent next player
        Player nextClockwisePlayer;

        //if the player is at the end of the linked list of players, go back to 0 index in the list
        if (players.indexOf(currPlayer) == players.size() - 1) {
            nextClockwisePlayer = players.get(0);
        }
        //else, move on to next player
        else {
            nextClockwisePlayer = players.get(players.indexOf(currPlayer) + 1);
        }

        //if the next player's hand is empty, recursively call nextPlayer method on the next player in clockwise order until it returns false
        if (nextClockwisePlayer.getHand().size() == 0) {
            return nextPlayer(nextClockwisePlayer);
        }
        //return at the end
        return nextClockwisePlayer;
    }

    /**
     * Prints a formatted round header.
     *
     * @param round the current round number
     */
    private void printRoundHeader(int round) {
        System.out.println("\n-----Round " + round + "-----\n");
    }

    /**
     * Prints every player who still has cards and their current hand.
     */
    private void printPlayersRemaining() {
        System.out.println("\nPlayers remaining and their hands: ");
        for (Player player : this.players) {
            if (player.getHand().size() > 0) {
                System.out.println(player + "\n");
            }
        }
    }

    /**
     * Returns the list of players in turn order.
     *
     * @return the list of players
     */
    public LinkedList<Player> getPlayers() {
        return this.players;
    }

    /**
     * Returns the current center pile.
     *
     * @return the pile of cards currently in play
     */
    public LinkedList<Card> getPile() {
        return this.pile;
    }

    /**
     * Returns the dealer used by this game.
     *
     * @return the game's dealer
     */
    public Dealer getDealer() {
        return this.dealer;
    }

    /**
     * Returns the valid slap patterns for this game.
     *
     * @return the array of valid pattern names
     */
    public String[] getPattern() {
        return this.patterns;
    }

    /**
     * Returns the valid slap patterns for this game.
     *
     * @return the array of valid pattern names
     */
    public String[] getPatterns() {
        return this.patterns;
    }

    /**
     * Checks whether the newest card in the pile matches the first card played in the pile.
     *
     * @param pile the current center pile
     * @return true if the top-bottom pattern is present, false otherwise
     */
    public static boolean topBottom(LinkedList<Card> pile) {
        if (pile.size() < 2) {
            return false;
        }
        return pile.getFirst().equals(pile.getLast());
    }

    /**
     * Checks whether the two newest cards in the pile have the same rank.
     *
     * @param pile the current center pile
     * @return true if the doubles pattern is present, false otherwise
     */
    public static boolean doubles(LinkedList<Card> pile) {
        if (pile.size() > 1) {
            return pile.getLast().equals(pile.get(pile.size() - 2));
        }
        return false;
    }

    /**
     * Checks whether the newest card matches the card two positions below it.
     *
     * @param pile the current center pile
     * @return true if the sandwich pattern is present, false otherwise
     */
    public static boolean sandwich(LinkedList<Card> pile) {
        if (pile.size() < 3) {
            return false;
        }
        return pile.getLast().equals(pile.get(pile.size() - 3));
    }
}

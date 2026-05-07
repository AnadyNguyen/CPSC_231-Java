import java.util.*; // Imports Java utility classes, including LinkedList and Random.

public class Game { // Defines the Game class, which stores the players, pile, dealer, and game logic.

    private LinkedList<Player> players; // Stores all Player objects in the game.
    private LinkedList<Card> pile; // Stores the cards currently in the middle pile.
    private Dealer dealer; // Stores the Dealer object that deals cards from a deck.
    private String[] patterns = {"doubles", "top bottom", "sandwich"}; // Stores the possible slap patterns a player can get.


    Random rand = new Random(); // Creates a Random object for choosing random pattern indexes.
    int patternIndex; // Stores the random index used to pick a pattern from the patterns array.
    //default Constructor
    public Game() { // Default constructor that creates a game with 2 players.
        this.players = new LinkedList<Player>(); // Initializes the players list so Player objects can be added.
        this.pile = new LinkedList<Card>(); // Initializes the pile as an empty list of cards.
        this.dealer = new Dealer(); // Creates a new Dealer object with a full deck.
        //deal cards to 2 players
        for (int i = 1; i <= 2; i++) { // Loops twice to create players 1 and 2.
            patternIndex = rand.nextInt(3); // Picks a random number from 0 to 2 for the pattern array.
            this.players.add(new Player(i, dealer.deals(26), patterns[patternIndex])); // Creates a player with 26 cards and a random pattern, then adds them to players.
        }
    }

    public Game(int numPlayers) { // Overloaded constructor that creates a game with numPlayers players.
        this.players = new LinkedList<Player>(); // Initializes the players list.
        this.pile = new LinkedList<Card>(); // Initializes the pile as an empty list.
        this.dealer = new Dealer(); // Creates a new Dealer with a full deck.

        //deal cards to num of players
        int individualHands = 52 / numPlayers; // Calculates how many cards each player gets evenly.
        int extraCards = 52 % numPlayers; // Calculates how many leftover cards remain after even dealing.

        for (int i = 1; i <= numPlayers; i++) { // Loops once for each player number.
            patternIndex = rand.nextInt(3); // Picks a random pattern index from 0 to 2.
            this.players.add(new Player(i, dealer.deals(individualHands), patterns[patternIndex])); // Creates the player with their hand and pattern, then adds them to the list.
        }

        for (int i = 0; i < extraCards; i++) { // Loops once for each leftover card.
            LinkedList<Card> extraCard = dealer.deals(1); // Deals one card and stores it in a one-card LinkedList.
            players.get(i).getHand().add(extraCard.get(0)); // Adds that one extra card to player i's hand.
        }
    }

    public int play() { // Starts the game and returns the winning player's number.
        Player playingPlayer = players.getFirst(); //whoever slapped pile or plays facecards and gets the cards
        Player winningPlayer = players.getFirst(); // Starts by assuming the first player in the list is winning.

        while (winningPlayer.getHand().size() != 52) { // Keeps looping until the tracked winning player has all 52 cards.

        //begin playing card
            winningPlayer = getPlayerWithMostCards(); // Updates winningPlayer to whichever player currently has the most cards.
            this.pile.add(playingPlayer.playCard()); //whoever is playing add card to pile

            //if face card is played
            if (this.pile.getLast().getRank() >= Card.JACK && this.pile.getLast().getRank() <= Card.ACE) {
                int cardsNeeded = this.pile.getLast().getRank() - 10; //since ace is 4, king is 3 and so forth, it corresponds with the 2nd digit of the rank so we can use .getRank()                
                Player faceCarded = nextPlayer(playingPlayer); //player who has to play on the face card
                int round = 1;

                //how many cards are played
                while (cardsNeeded > 0) { //while all cards that are needed to cover face card,

                    if (faceCarded.getHand().size() == 0) { //if the person that got face carded's hand size is 0,
                        break; //break
                    }

                    this.pile.add(faceCarded.playCard()); //face carded person plays card

                    if (this.pile.getLast().getRank() == 10) { //if 
                        playingPlayer = faceCarded;
                        break;
                    }

                    //if card played is 11/Jack or more
                    if (11 <= this.pile.getLast().getRank() && this.pile.getLast().getRank() <= Card.ACE) {
                        cardsNeeded = this.pile.getLast().getRank() - 10;
                        playingPlayer = faceCarded;
                        faceCarded = nextPlayer(faceCarded);
                    }
                    else {
                        cardsNeeded--;
                    }
                }

                System.out.println("Player " + playingPlayer.getPlayerNum() + " won the pile on a face card!");
                System.out.println("Pile: " + this.pile);

                while (this.pile.size() > 0) {
                    playingPlayer.getHand().add(this.pile.removeFirst());
                }


                printRoundStatus(round);
                round++;
            //number cards
            } else {
                LinkedList<Player> slappable = new LinkedList<Player>(); //all players that can slap for that pile
                
                for (Player p: players) {
                    if (p.getHand().size() > 0 && p.slaps(this.pile)) { //if hand is greater than 0 and slaps method on the pile returns true,
                        slaps.add(p); //add player
                    }
                }
                
            }


            /*
            rules:
            face cards
            slaps
            first slap for 2 more players - random
            */


        }
        return winningPlayer.getPlayerNum(); // Returns the player number of the tracked winner.
    }

    private Player getPlayerWithMostCards() { // Helper method that finds the player with the biggest hand.
        Player leader = players.get(0); // Starts by assuming the first player has the most cards.

        for (Player p : players) { // Loops through every player in the game.
            if (p.getHand().size() > leader.getHand().size()) { // Checks if this player has more cards than the current leader.
                leader = p; // Updates leader to this player because they have more cards.
            }
        }
        return leader; // Returns the player with the most cards.
    }

    //nextPlayer helper function to get next player
    private Player nextPlayer (Player currPlayer) {
        Player nextClockwisePlayer;
        if (players.indexOf(currPlayer) == players.size() - 1) {
            nextClockwisePlayer = players.get(0);
        } else {
            nextClockwisePlayer = players.get(players.indexOf(currPlayer) + 1);
        }
        return nextClockwisePlayer;
    }

    //print round header/counter plus line helper method
    private void printRoundStatus(int round) {
        System.out.println("\n-----Round " + round + "-----\n");
        for (Player player : this.players) {
            if (player.getHand().size() > 0) {
                System.out.println(player + "\n");
            }
        }
    }



    public LinkedList<Player> getPlayers() { // Getter method for the players list.
        return this.players; // Returns all players.
    }

    public LinkedList<Card> getPile() { // Getter method for the pile.
        return this.pile; // Returns the current pile.
    }

    public String[] getPattern() { // Getter method for the pattern array.
        return this.patterns; // Returns the available slap patterns.
    }



    public static boolean topBottom(LinkedList<Card> pile) { // Static method meant to check the top-bottom slap pattern.
            if (pile.size() < 2) {
                return false;
            }
            return pile.getFirst() == pile.getLast();

    }

    public static boolean doubles(LinkedList<Card> pile) { // Static method meant to check the doubles slap pattern.
        if (pile.size() > 1) {
            return pile.getLast().equals(pile.get(pile.size() - 2));
        }
        return false;
    }

    public static boolean sandwich(LinkedList<Card> pile) { // Static method meant to check the sandwich slap pattern.
        if (pile.size() < 3) {
            return false;
        }
            return pile.getLast().equals(pile.get(pile.size() - 3));
    }

}

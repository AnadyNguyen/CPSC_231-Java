/*
Andy Nguyen
Worked in partnership with N/A
2493321
annguyen@chapman.edu
CPSC231-04
MP4C - Egyptian Rat Slap
Date completed: May 8, 2026
Runs one simulated game and prints the winning player.
*/

/**
 * Runs one Egyptian Rat Slap simulation.
 *
 * @author Andy Nguyen
 * @version 1.0
 */
public class Driver{
    /**
     * Creates a Driver object.
     */
    public Driver() {
    }

    /**
     * Creates and plays one game, then prints the winning player.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args){
        Game g = new Game(3);
        System.out.println("\nPlayer " + g.play() + " wins!");
    }
}

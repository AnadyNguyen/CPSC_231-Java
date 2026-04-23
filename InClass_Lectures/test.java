import java.util.Scanner;
import java.util.Random;


public class test {
    public static void main(String[] args) {
        /* ---------------------------------------------------------------------
         * 2) DO-WHILE LOOP
         * ---------------------------------------------------------------------
         * Pattern (general shape):
         *
         *   do {
         *       // body of loop
         *       // update control variable(s)
         *   } while (condition);
         *
         * Use when: you want the body to run at least once before the condition is checked.
         *
         * Example: Roll a die until you get a 6.
         * You don’t know how many rolls it will take, but you’ll always roll at least once.
         */

        // TODO: generate a random number 1–6 repeatedly 
                // roll is your control variable, needs to be updated within the do portion of loop 
                // however, we can now also initialize it within the do

        
        Scanner scnr = new Scanner(System.in); // may need it below
        Random rand = new Random(); // will use below 
        System.out.println("\n[do-while] Roll a die until we get a 6:");
        int roll;
        do {
            roll = rand.nextInt(6) + 1;
            if (roll == 6) {
                System.out.println("Rolled a 6!");
                break;
            }
            System.out.println("Rolled a " + roll);
        } while (roll != 6);
    }
}
import java.util.Scanner;
import java.util.Random;

/**
 * Loops.java 
 * ------------------------------------------------------------------------
 * What you'll learn:
 *  1) while-loops for problems where the number of iterations is unknown
 *  2) do-while loops that always execute at least once
 *  3) for-loops for fixed-count iteration (classic indexing and countdown)
 *  4) [NEXT CLASS] for-each loops for clean iteration over collections/arrays
 */
public class Loops {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in); // may need it below
        Random rand = new Random(); // will use below 

       /* ---------------------------------------------------------------------
        * 1) WHILE LOOP
        * ---------------------------------------------------------------------
        * Pattern (general shape):
        *
        *   // initialize control variable(s)
        *   while (condition) {
        *       // body of loop
        *       // update control variable(s)
        *   }
        *
        * Use when: you don’t know in advance how many times the loop should run.
        *
        * Example: Keep asking the user to guess the number until they get it right.
        */
        System.out.println("\n[while] Guess the secret number (between 1 and 10):");
        // TODO: create a random integer between 1 and 10

        int secretNum = rand.nextInt(10) + 1;

        // ask the user for their first guess
        System.out.print("Enter your guess: ");
        // TODO: initialize control variable (user guess)

        int userGuess = 0;

        // keep track of number of guesses by user 
        int guessTries = 0;
        // TODO: start loop is checked condition is true
            // control variable: guess
            // condition: keep looping until they guess right
         
         while (userGuess != secretNum) {
            System.out.println("Wrong Number! Try again!");
            System.out.print("Enter your guess: ");
            userGuess = scnr.nextInt();
            guessTries += 1;
            if (userGuess == secretNum) {
                System.out.println("Correct! The secret number was " + secretNum + ".");
                System.out.println("It took you " + guessTries + " tries to guess the number correctly!");
                break;
            }
         }

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
        System.out.println("\n[do-while] Roll a die until we get a 6:");
        int roll;
        
            // TODO: generate a random number 1–6 repeatedly 
                // roll is your control variable, needs to be updated within the do portion of loop 
                // however, we can now also initialize it within the do
        do {
            roll = rand.nextInt(6) + 1;
            if (roll == 6) {
                System.out.println("Rolled a 6!");
                break;
            }
            System.out.println("Rolled a " + roll);
        } while (roll != 6);
            

        /* ---------------------------------------------------------------------
         * 3) FOR LOOP
         * ---------------------------------------------------------------------
         * Pattern (general shape):
         *
         *   for (initialize; condition; update) {
         *       // body of loop
         *   }
         *
         * Use when: you know in advance how many times you need to run.
         *
         * Example 1: iterate through a String and print the indices of vowels.
         */
        // Example 1: iterate through a String and print the indices of vowels.
        String s = "hello there how are you?";
        System.out.println("\n[for + switch] Indices of lowercase vowels:");
        // TODO: iterate through strings 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Vowel at index: " + i);
                    break;
        }
        }
            
            // TODO: check if each char in string is a vowel or not, one at a time
            
        

        /* ---------------------------------------------------------------------
         * 4) FOR-EACH LOOP (ENHANCED FOR LOOP)
         * ---------------------------------------------------------------------
         * Pattern (general shape):
         *
         *   for (Type element : collection) {
         *       // body of loop using "element"
         *   }
         *
         * Use when: you want to loop through every element in an array or collection,
         * and you don’t need the index. It’s simpler and more readable than a classic for.
         * WE WILL GO OVER THESE NEXT CLASS ONCE WE LEARN ABOUT ARRAYS! :) 
         */
    

        /* ---------------------------------------------------------------------
         * QUICK RECAP:
         *  - while-loop: unknown count; e.g., flip coins until first heads.
         *  - do-while: like while, but body runs at least once (e.g., roll until 6).
         *  - for-loop: known count; ideal for arrays/strings or fixed iterations.
         *  - for-each: simpler way to iterate through every element (no index needed).
         *  - switch inside a loop: handy for making decisions about each element.
         * ---------------------------------------------------------------------
         
        // scnr.close(); // good practice: close Scanner if you used it above

        */
      }
}
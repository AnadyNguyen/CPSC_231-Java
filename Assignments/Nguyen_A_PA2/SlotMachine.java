/*
Andy Nguyen
Worked in partnership with no one
2493321
annguyen@chapman.edu
CPSC231-04
MP2 : Spin and Win
*/

import java.util.Random;
import java.util.Scanner;
public class SlotMachine{
    public static void main (String[] args){
        //create scanner and random objects
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println();
        System.out.println("Welcome to Slots!");
        System.out.println("Each time you spin, it will cost 1 token.");
        System.out.println("Once you reach 0 tokens, the game ends.");
        int tokens = 10; //declare tokens
        System.out.println();
        System.out.println("You have " + tokens + " tokens.");
        System.out.print("Spin? (yes/no): ");
        String spin = sc.nextLine();
        String[] symbols = {"🍒", "💎", "🔔", "🟡", "💰", "⭐"};
        if (spin.equals("no")) {
                System.out.println("Sorry to hear that, bye.");
                sc.close();
                return;
            }
        while (!spin.equals("yes") && !spin.equals("no")) {
            System.out.println("Please type yes or no in all lowercase.");
            System.out.print("Spin? (yes/no): ");
            spin = sc.nextLine();
            if (spin.equals("no")) {
                System.out.println("Sorry to hear that, bye.");
                sc.close();
                return;
            }
        }
        while (tokens > 0) { //while loop for gameplay           
            tokens -= 1;
            System.out.println();
            System.out.println("You have " + tokens + " tokens.");
            System.out.println("Spinning...");
            //create empty array of slots
            String[] slots = new String [3];
            for (int i = 0; i < 3; i++) {
                slots[i] = symbols[rand.nextInt(symbols.length)];
            }
            System.out.println(slots[0] + " | " +  slots[1] + " | "  + slots[2]);
            if (slots[0].equals(slots[1]) && slots[1].equals(slots[2])) { //check if all 3 equal
                if (slots[0].equals(symbols[4])) {
                    System.out.println("JACKPOT! WE HAVE A WINNER! YOU WIN 20 TOKENS!!!");
                    tokens += 20;
                    System.out.println("Now you have " + tokens + " tokens.");
                }
                else {
                    tokens += 5;
                    System.out.println("Three of a kind! You win 5 tokens!");
                    System.out.println("Now you have " + tokens + " tokens.");
                }
            }
            else if (slots[0].equals(slots[1]) || slots[1].equals(slots[2]) || slots[0].equals(slots[2])) { //check if 2 equals
                tokens += 2;
                System.out.println("Two of a kind! You win 2 tokens!");
                System.out.println("Now you have " + tokens + " tokens.");
            }
            
            else { //else, lose the turn
                System.out.println("No matches! Sorry, you win 0 tokens");
                System.out.println("Now you have " + tokens + " tokens.");
            }
            if (tokens <= 0) {
                System.out.println("Sorry, you ran out of tokens.");
                break;
                }
            System.out.println();
            System.out.print("Spin again? (yes/no): "); //to go again
            String again = sc.nextLine();

            while (!again.equals("yes") && !again.equals("no")) {
                System.out.println();
                System.out.println("Please type yes or no in all lowercase.");
                System.out.println();
                System.out.print("Spin again? (yes/no): ");
                again = sc.nextLine();
            }
            if (again.equals("no")) {
                System.out.println("Thanks for playing!");
                System.out.println();
                break;
            }
        }
        sc.close();
    }
}
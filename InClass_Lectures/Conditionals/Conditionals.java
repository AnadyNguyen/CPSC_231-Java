import java.util.Scanner;

public class Conditionals { //make Conditionals class, class and file name always the same, why?
    public static void main(String[] args) { //main 

        //Conditionals (if statements)
        /*
        switch(controlVariable) {
            case x:
                // do this
                break;  //unless water fall effect
            case y:
                //do this
                break;
            case z:
                break;
            default: //optional
            }
        */

       // Prompt the user for their letter garde, then, using 1) a conditional and 2) switch statement,
       // give them feedback based on their grade

        // System.out.println("What's your name?");
        // Scanner sc = new Scanner(System.in);
        // String getName = sc.nextLine();
        // sc.close();
        // System.out.println("Welcome back, " + getName);

        System.out.print("What is your letter grade in this class? Please enter a capital letter: ");
        Scanner scr = new Scanner(System.in);
        String grade = scr.nextLine();
        grade = grade.toUpperCase();
     
        switch (grade) {
            case "A":
            case "A-":
                System.out.println("Great job!");
                break;
            case "B+":
            case "B":
            case "B-":
                System.out.println("Keep up the good work!");
                break;
            case "C+":
            case "C":
            case "C-":
                System.out.println("Be careful!");
                break;
            case "D+":
            case "D":
            case "D-":
                System.out.println("Lock in");
                break;
            case "F":
                System.out.println("GGs");
                break;
            default:
                System.out.println("Invalid letter grade");
            }
        scr.close();
            } 
        }
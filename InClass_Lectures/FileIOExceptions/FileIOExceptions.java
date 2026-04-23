import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.File;

class FileIOExceptions {
    public static void main (String [] args) {
        //Exception ex. 1

        // Scanner scnr = new Scanner(System.in);

        // System.out.prinln("Numerator: ");
        // int numerator = scnr.nextInt();
        // System.out.println("Denominator: ");
        // int denominator = scnr.nextInt();

        // int division;
        // try {
        //     division = numerator / denominator;
        // } catch (ArithmeticException e) {
        //     System.out.println("cannot divide by zero!");
        //     division = 0;
        // }
        // System.out.prinln("Division: " + division);

        // //Exception ex. 2

        // int[] numArray = {10,20,30,40,50};
        // System.out.print("Index: ");
        // int index = scnr.nextInt();
        // System.out.println("Value at index" + index + " is " + numArray[index]);
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Index out of bounds!")
        //     System.out.println("You tried to access index " + index + " but the last element of the array is at index " +)
        // }
        // }

        // WRITING TO A FILE
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("outputTest.txt"));
            pw.println("I'm writing text to a file");
            pw.println("Isn't this neat");
            pw.println("We are in the file");
            System.out.println("Done!");
            pw.close();
        } catch (IOException inputOutputException) {
            System.err.println("Couldn't output to file!");
            inputOutputException.printStackTrace();
        }

        //Appending to a file
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("appendOutputText.txt", true));
            pw.println("test append");
            pw.println("line 2, it might be hot");
            pw.close();
        } catch (IOException ioe) {
            System.err.println("Couldn't output to file!");
        }
        
        //reading from a file
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(new File("inputTest.txt")); //create scanner object, 
            // java will go out and look for a file called inputTest.txt. 
            // We will have to manually create the file then
            while(fileScanner.hasNext()) { //hasNext() returns boolean, check to see if something is availible
                String line = fileScanner.nextLine(); //becomes a string
                System.out.println("content from file: " + line);

            }
        } catch(FileNotFoundException fnfe) {
            System.err.println("file does not exist oop");
            fnfe.printStackTrace(); // good for debugging
        } finally {
            if(fileScanner != null)
                System.out.println("closing file");
                fileScanner.close();
        }
    }

    

}
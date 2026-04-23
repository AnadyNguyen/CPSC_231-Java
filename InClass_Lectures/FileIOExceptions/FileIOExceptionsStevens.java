import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class FileIOExceptions{
    public static void main(String[] args){
        //EXCEPTION EXAMPLE 1
        
        Scanner scnr = new Scanner(System.in);
        /*
        System.out.print("Numerator: ");
        int numerator = scnr.nextInt();
        System.out.print("Denominator: ");
        int denominator = scnr.nextInt();

        int division;
        try{
            division = numerator / denominator;
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero!");
            division = 0;
        }
        System.out.println("Division: " + division);
        */

       //EXCEPTION EXAMPLE 2
       /*
       int[] numArray = {10, 20, 30, 40, 50};
       System.out.print("Index: ");
       int index = scnr.nextInt();
       try{
        System.out.println("Value at index " + index + " is " + numArray[index]);
       }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Index out of bounds!");
        System.out.println("You tried to access index " + index  + " but the last element is the array is at index " + (numArray.length - 1));
       }
        */

       //FILES
       /*
        - Whenever we're working with files we must use a try-catch block to handle possible IOException
        - There are two modes for writing - write and append
            Write Mode:
                1. If the file does not exist, Java will create it and write the contents to it
                2. If the file does exist, Java with OVERWRITE the contents of the file with the new information
            Append Mode:
                1. If the file does not exist, Java will create it and write the contents to it
                2. If the file does exist, Java will write the new contents to the file after the existing contents
            Classes for writing: PrintWriter and FileWriter
        - Reading from a file
            - The file you want to read from MUST exist prior 
            - The file you are tring to read from does not exist, you will get a FileNotFoundException
            - Classes for reading: Scanner and File
       */

      // WRITING TO A FILE
      try{
        PrintWriter pw = new PrintWriter(new FileWriter("outputTest.txt"));
        pw.println("I'm writing text to a file");
        pw.println("Isn't this neat");
        pw.println("Programming is so cool");
        System.out.println("DONE!");
        pw.close();
      }catch(IOException ioe){
        System.err.println("Couldn't output to file!");
        ioe.printStackTrace();
      }

      // APPENDING TO A FILE
      try{
        PrintWriter pw = new PrintWriter(new FileWriter("anotherOutput.txt", true)); //add the true paramenter, allows you to append to a file
        pw.println("This is another test");
        pw.println("it's hot outside to today");
        pw.println("Dr. Stevens' is cool");
        pw.close();
      }catch(IOException ioe){
        System.err.println("Couldn't output to file!");
      }

      // READING FROM A FILE   
      Scanner fileScanner = null;
      try{
        fileScanner = new Scanner(new File("inputTest1.txt"));
        while(fileScanner.hasNext()){ //hasNext() returns a boolean
            String line = fileScanner.nextLine();
            System.out.println("Content from file: " + line);
        }
      }catch(FileNotFoundException fnfe){
        System.err.println("Oh no! Looks like that file does not exist");
        fnfe.printStackTrace();
      }finally{
        if(fileScanner != null){
            System.out.println("CLOSING FILE");
            fileScanner.close();
        }
      }
    }
}
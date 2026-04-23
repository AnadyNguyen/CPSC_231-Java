/*
    PRACTICE:
    1. Write a program that:
      - prompts the user for the number of integers they would like to enter
      - allocates an array of appropriate size
      - asks the user for values and stores them in the array
      - then prints all of the values inside of the array separated by a tab character
            * do this with a classic for loop and a for-each loop

    2. Write a program that:
        - allocates an array of size 10
        - populates the array with random integers between 0 and 100
        - prints all of the values inside of the array separated by a tab character
            * do this with a classic for loop and a for-each loop
        - sums all the values within the array and prints the sum
    */

import java.util.Scanner;
public class ArraysPractice{
  public static void main (String[] args){
    //1)
    Scanner sc = new Scanner(System.in);
    System.out.println("Please type the number of integers you want to enter: ");
    int size = sc.nextInt();
    int[] arr  = new int[size];

    for (int i = 0; i < size; i++) {
        System.out.println("Please enter your values for position " + i + ":");
        arr[i] = sc.nextInt();
    }
    System.out.println();
    for (int j: arr) {
        System.out.print(j + "\t");
    }
    System.out.println();

    
    


  } // close main method
} // close class



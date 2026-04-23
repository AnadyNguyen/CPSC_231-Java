import java.util.Scanner;

public class JavaBasics {
    // ONE required entry point for a standalone program
    public static void main (String[] args) {

        // System.out.println("Scanner Demo");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int numberRead = sc.nextInt();
        // System.out.println("Enter a decimal: ");
        // float decimalRead = sc.nextFloat();
        // sc.close();
        // System.out.println("Scanner read int: " + numberRead + " and flaot: " + decimalRead);

        System.out.println("What's your name?");
        Scanner sc = new Scanner(System.in);
        String getName = sc.nextLine();
        sc.close();
        System.out.println("Welcome back, " + getName);
        

        String s1 = "Hello";
        String s2 = new String("Hello");
        System.out.prinln("s1: " + s1 + "s2: " + s2);

        

        String a = "Java"; //string literal
        String b = "Java"; //string literal
        String c = new String("Java"); 


        //For objects == will check to see if the location in memory is the same
        System.out.println("a == b (same literal, likely the same reference): " + (a==b));
        System.out.println("a == c (diiferent objects): " + (a==c));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("a.equals(c): " + a.equals(c));
    }

}

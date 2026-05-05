import java.util.*;

public class Collections1{ //array larger strucutre holds individual smalle objects, so a colelction

    public static void main(String [] args)  {
        //Wrapper Classes
    /*
        //if  we want a primitive int to behave like a non primitive
        //wraps primitive and make it act like object
        //let us use primitive types as objects, (pass by referenced)
        -provide class type corresponding to teach primitve type
        - useful in ituations where you want to use a value of a primitve but need an object
        - int -> Integer
        - double -> Double
        - char -> Character
        all classes are capital - convention
    */

    int num = 5; //primitive type
    System.out.println("Primitive: " + num);
    // Integer numObject = num; //autoboxing (int -> Integer), we dont have to create secondary step
    // other way:
    Integer numObject = new Integer(num); //make Integer object
    //explicitly creating Integer Object from num(java bts)
    System.out.println("Wrapper object " + numObject);
    int numAgain = numObject;
    

    // ArrayList Intro
    // SYNTAX: ArrayList myList = new ArrayList(); //java will allow you to add all objects and primitive types to ArrayList, 
    // random things and no connecion
    // add card, student, int, etc.. to list
    // if we pull student out, GetCourse method
    // as we pull them out, we need to figure out what type of object they are in order to do actions
    // *student has no GetRank method, unlike cards
    // or ArrayList<DataType> myList = new ArrayList<>();
    // or ArrayList<DataType> myList = new ArrayList <DataType>();

    ArrayList<Integer> numbers = new ArrayList <>();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    System.out.println("ArrayList Contents: " + numbers); //ArrayList has a toString method, don't have to loop

    int firstItem = numbers.get(0); //get index 0
    numbers.set(1,25); // set index 1 to the value 25

    System.out.println(firstItem);
    System.out.println(numbers);

    //LinkedList: 
    LinkedList<String> names = new LinkedList<>(); //creating LinkedList of Strings
    names.add("Joe");
    names.add("Derek");
    names.add("Lezama");

        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        Random rand = new Random();

        long alSum = 0;
        long llSum = 0;

        // Fill both lists with 100,000 random integers
        for (int i = 0; i < 100000; i++) {
            int randNum = rand.nextInt(100000);
            al.add(randNum);
            ll.add(randNum);
        }

        // Time ArrayList
        long time1 = System.currentTimeMillis();
        for (int j = 0; j < 20000; j++) {
            int randIndex = rand.nextInt(100000);
            alSum += al.get(randIndex);
        }
        long time2 = System.currentTimeMillis();

        // Time LinkedList
        long time3 = System.currentTimeMillis();
        for (int j = 0; j < 20000; j++) {
            int randIndex = rand.nextInt(100000);
            llSum += ll.get(randIndex);
        }
        long time4 = System.currentTimeMillis();

        System.out.println("ArrayList sum: " + alSum);
        System.out.println("ArrayList time: " + (time2 - time1) + " ms");

        System.out.println("LinkedList sum: " + llSum);
        System.out.println("LinkedList time: " + (time4 - time3) + " ms");

    }
}
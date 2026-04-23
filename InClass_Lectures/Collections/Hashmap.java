import java.util.HashMap;

/*
method(s) that takes in a string and checks if all characters in string are unique. Use a HashMap.
 */


//String s = "hello"

public class Hashmap {
    public static HashMap<Character, Integer> numberOfTimesACharAppears(String str) { //return a hash map   
        HashMap<Character, Integer> frequencies = new HashMap<>(); 
        for(int i = 0; i < str.length(); ++i) { //iterate over string  
            Character letter = str.charAt(i); //get character at current index i, of the for loop
            if(frequencies.containsKey(letter)) { //is the character already a key in the hash map?
                frequencies.replace(letter, frequencies.get(letter) + 1); //add one to the count
            }
            else { // the letter wasn't already in the Hash Map
                frequencies.put(letter, 1);
            }
        }
        return frequencies;
    }

    public static Boolean uniqueLetters(String s) {
        HashMap<Character, Integer> frequencies = numberOfTimesACharAppears(s);
        for(Integer v: frequencies.values()) {
            if(v > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main (String [] args) {
        String s = "hello world this is andy";
        String s2 = "no";
        System.out.println(numberOfTimesACharAppears(s));
        System.out.println(uniqueLetters(s2));
        System.out.println(numberOfTimesACharAppears(s2));

    }
}

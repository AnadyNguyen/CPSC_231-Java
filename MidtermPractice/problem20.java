// 20. Write a method that:

// takes an array of integers

// returns the sum
public class problem20 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
    }
}


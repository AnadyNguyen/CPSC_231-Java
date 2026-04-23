import java.util.Random;
import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {
        /*
         * A 2-D array is like a grid or a table.
         * You need two indexes to access one single element:
         *   - the row index
         *   - the column index
         */

        // Part 1: Declare and create a 2-D array
        int arr[][] = new int[4][4];


        // Part 2: Fill the array with random numbers
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = rand.nextInt(100);
            }
        }
        
        // Part 3: Access a single element
        System.out.println(arr[1][2]);

        
        // Part 4: Print the entire array as a grid (traverse row by row)
        System.out.println("The 2-D array looks like this:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
         

        // Part 5: Traverse column by column
        System.out.println("Column by Column: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        /*
        Part 6: Activity! Save the sum of each row of the matrix 
        into a one dimensional array, then print the 1d array 
         If the 2-D array looks like this:
            4       7       5       4
            7       3       4       2
            9       8       9       2
            7       2       7       3
            2       2       6       0
        
         Then, rowSums = [20, 16, 28, 19, 10]
         */
        
        System.out.println("Adding the rows:");
        int rowSums[] = new int[4];
         for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 4; j++) {
                total += arr[i][j];
            }
            rowSums[i] = total;
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(rowSums[i] + " ");
            System.out.println
        }

        // Part 7: Activity! how would you edit your code from part 6 to print the sum of each column of the array?

    }
}
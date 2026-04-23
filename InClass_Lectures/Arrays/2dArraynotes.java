/*
syntax
dateType[][]myarray = new dataType[numRows][numCol];
(int, char, float, etc...)
*/

char[][] charArray = new char[5][3];

/*
5 rows, 3 columns
[][][]
[][][]
[][][]
[][][]
[][][]


Arrays stored in memory are slighlty different
reference to the location of memory where thing is stored

*A 2D array is stored as an array of arrays
reference to an array

1D array with 4 rows - points to beginning of array, (lives at this address)
[0] [][]
- reference to another array
[1] [][]
- reference to another array
[2] [][]
- reference to another array
[3] [][]
- reference to another array

s.o.p(charArray)
-give location of the start of the array

charArray[3][0] = 'A'

s.o.p(charArray.length); -> 4 rows

could use 2 for each loops, but date types have to match
*/
for(int r = 0; r < intArray.length; r++) {
    for (int c = 0; c < intArray[0].length; c++) { //until this one completely iterates, the top one doesn't get touched
        intArray[r][c] = r * c;
    }
}

/*
    0     1     2
0: [0]   [0]   [0]

1: [0]   [1]   [2]    

2: [0]   [2]   [4]

3: [0]   [3]   [6]

*/
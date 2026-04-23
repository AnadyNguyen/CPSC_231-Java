/*4 different ways to increment
i = i + 1, i += 1, ++i, i++
int i = 0;
while (i < 5) {
    System.out.print("iteration: " +  i);
    i = i + 1, i += 1, ++i, i++; // so it doesn't become infinite loop
    }


do-while: // execute at least once, then checks condition if false
//condition is checked after code runs

do {
    //code to be repeated
    } while (condition);

int = 0;
do {
    System.out.print("Iteration: " + i);
    i++;
    } while (i < 5);  //this does the exact same thing as the previous while loop


Loop control statements:
break - terminate loop immediately
if we use variable flags, we can print out variable name to see weird behavior
continue - end current itertaion, then continue next iteration

Python:
    for c in s:   s = "hello"
        print c

    output:
        h
        e  
        l
        l
        o

For loop in Java/C++:

for (initialization; condition; update)

initialization: a variable intialized at the start (only executed once)
condition: loop continues running as long as the condition is true
update: after each iteration, value is update (i.e. - increment or decrement)


*/

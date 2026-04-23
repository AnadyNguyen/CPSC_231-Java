# MP Assignment #4A – Card Class

##  Description  
This program implements a **Card** class in Java using object-oriented programming principles. The class represents a standard playing card and is designed to be reusable for future card game implementations. The implementation is in the TestCards class, where multiple Card objects were made.

Each card consists of:
- A **rank** (2–10, Jack, Queen, King, Ace). 
- A **suit** (Hearts, Spades, Clubs, Diamonds).

- Face cards are also represented with numbers 11,12,13,14. However, you can also use the .NAMEOFFACECARD method to set it to a parameter
- The suits are represented by integers 0,1,2,3. Similarly with rank, you can use a .NAMEOFSUIT method to assign the suit as a parameter.
- However, these two are not to be confused with the setter and getter methods

The program demonstrates:
- Encapsulation through private member variables  
- Constructors (default, overloaded, copy)  
- Accessors (getters) and mutators (setters)  
- Custom string representation using `toString()`  
- Object comparison using an `equals()` method  

---

## Identifying Information  
* Name: Andy Nguyen  
* Student ID: 2493321  
* Email: annguyen@chapman.edu  
* Course: CPSC231 - 04 SP26  
* Assignment: MP #4 - Card Class and TestCard File


## Features  
- Default constructor creates **Ace of Spades**  
- Overloaded constructor allows creation of any card with multiple parameters
- Copy constructor duplicates an existing card  
- Constants ensure consistent representation of ranks and suits  
- `toString()` returns readable output (e.g., `"Queen of Hearts"`)  
- `equals()` compares two cards based on rank  

---

##  Source Files  
- `Card.java` 
- Card.class
- `TestCards.java`  
- TestCards.class
- `README.md`  

---

##  Known Issues / Limitations  
- No validation for invalid rank or suit values (e.g., rank > 14 or suit < 0)  
- `equals()` compares only rank, not suit (as specified in assignment)  
- Program assumes valid input when creating cards 
- Can't input a String as a parameter and would have to use a method instead to get the Suit and Face Card Rank
- No joker for games with jokers :(

---

##  References  
- Student.java class from in class lectures and practice
- GeeksforGeeks – Java Classes & Objects: https://www.geeksforgeeks.org/java-classes-and-objects/  
- GeeksforGeeks - Copy Constructor: https://www.geeksforgeeks.org/java/copy-constructor-in-java/
- GeeksforGeeks – Switch Statement: https://www.geeksforgeeks.org/java-switch-statement/  
- Oracle Java Documentation – `toString()` method  
- ChatGPT – https://chatgpt.com/share/69e1d4a8-210c-83e8-afb5-495b32c60143
- YouTube - https://www.youtube.com/watch?v=Af3s3KsxStY (OOP Basics)
- Titus Messersmith for formatting my TestCards file with the ("-------------") newline print

---

##  Build Instructions  
javac Card.java
javac TestCards.java
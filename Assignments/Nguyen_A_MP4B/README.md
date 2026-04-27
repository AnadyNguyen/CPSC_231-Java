# MP Assignment #4B - Deck and Dealer Classes

## Description
This program builds on the `Card` class from MP4A by adding a `Deck` class and a `Dealer` class. These classes create and manage a standard deck of 52 playing cards using Java object-oriented programming and `LinkedList<Card>`.

The program demonstrates:
- Reusing the existing `Card` class
- Creating a full deck of 52 cards
- Making a deep copy of a deck
- Dealing random cards from a deck
- Using a `Dealer` class to manage a deck during gameplay
- Returning a hand of cards as a `LinkedList<Card>`

---

## Identifying Information
* Name: Andy Nguyen
* Student ID: 2493321
* Email: annguyen@chapman.edu
* Course: CPSC231 - 04 SP26
* Assignment: MP #4B - Deck and Dealer Classes

---

## Features
- `Card` represents one playing card with a rank and suit
- `Deck` creates a full 52-card deck
- `Deck` has a copy constructor that creates a deep copy of another deck
- `Deck.size()` returns the number of cards currently in the deck
- `Deck.deal()` removes and returns a random card from the deck
- `Dealer` stores one `Deck` object
- `Dealer.deals(int n)` returns a `LinkedList<Card>` containing up to `n` randomly dealt cards
- `Dealer.deals(int n)` returns an empty linked list if the deck is empty
- `Dealer.size()` returns the number of cards left in the dealer's deck
- `Dealer.toString()` returns the current deck as a string

---

## Source Files
- `Card.java`
- `Deck.java`
- `Dealer.java`
- `TestCards.java`
- `README.md`

---

## Known Issues / Limitations
- No validation for invalid card rank or suit values
- `Card.equals()` compares only rank, not suit
- `Deck.deal()` assumes the deck has at least one card before it is called
- `TestCards.java` contains all the tests for the Card, Deck, and Dealer classes

---

## References
- Stack Overflow - Deep copy a LinkedList contained within an object: https://stackoverflow.com/questions/74256440/
- GeeksforGeeks - Deep Copy in Java: https://www.geeksforgeeks.org/java/deep-copy-in-java/
- GeeksforGeeks - Copy Constructor in Java: https://www.geeksforgeeks.org/java/copy-constructor-in-java/
- Stack Overflow - Java LinkedList add method: https://stackoverflow.com/questions/8885428/java-linked-list-add-method
- OnlineGDB: https://www.onlinegdb.com/online_c++_compiler#
- GeeksforGeeks - LinkedList in Java: https://www.geeksforgeeks.org/java/linked-list-in-java/
deep-copy-a-linkedlist-contained-within-an-object
- Medium - Copy Constructors in Java, Deep vs Shallow Copy: https://medium.com/@harshavardhan.katkam/copy-constructors-in-java-deep-vs-shallow-copy-89aa0bd3a77d
- GeeksforGeeks - Collections shuffle method in Java: https://www.geeksforgeeks.org/java/collections-shuffle-method-in-java-with-examples/
- ChatGPT/Codex - Used for help understanding `Deck.deal()`, `Dealer.deals(int n)`, help with TestCards.java for all the test cases, and README formatting.
- Derek Vo Van - helped with deal method for both Deck and Dealer
- Titus Messersmith - enhancing for loops to make code clearer and easier`

---

## Build Instructions
To compile:

```bash
javac Card.java Deck.java Dealer.java TestCards.java
or javac *.java
```

To run the tests:

```bash
java TestCards
```

# MP4C - Egyptian Rat Slap

## Identifying Information
* Full name: Andy Nguyen  
* Student ID: 2493321  
* Chapman email: annguyen@chapman.edu  
* Course number and section: CPSC 231-04  
* Assignment: MP4C - Egyptian Rat Slap

## Source Files
- Card.java  
- Deck.java  
- Dealer.java  
- Driver.java  
- Game.java  
- Player.java  
- README.md

## Known Issues
No known compile or runtime errors. Added a rule so a card of Rank 10 cancels the face card and play resumes.

## Description
* The game is a simulation and uses random choices for card dealing, player slap * patterns, and ties between multiple players who can slap.

## References

* Ethan Yoo - helped with logic for face card conditionals, gameplay flow, and dealing cards evenly to players
* Derek Vo Van - helped with nextPlayer method.
* https://codegym.cc/groups/posts/string-array-in-java - used to review Java String array syntax.

Generative AI tool: ChatGPT/Codex was used for debugging help, explaining Java syntax, and adding Javadoc/header comments. Prompts included questions about `nextPlayer`, slap handling, face-card logic, `LinkedList` methods, and Javadoc comments. Guidance was incorporated into the structure of `Game.java`, comments/Javadocs, and README cleanup.


## Running Instructions
To compile:

```bash
javac *.java
```

To run:

```bash
java Driver
```

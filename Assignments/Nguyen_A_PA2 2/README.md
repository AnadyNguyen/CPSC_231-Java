## MP Assignment #2 - Spin and Win

# Description
This program simulates a slot machine style game. The player starts with 10 tokens,
and each spin costs 1 token. On each spin, three random symbols are selected from
an array and displayed.

If the symbols match in certain ways, the player earns additional tokens:
- Three matching symbols → +5 tokens
- Two matching symbols → +2 tokens
- No match → 0 tokens

After each spin the program displays the symbols and the updated token count.
The user is then asked if they want to spin again. The game ends when the user
chooses to stop or runs out of tokens.

A bonus feature was implemented where three matching 💰 symbols trigger a
jackpot worth 20 tokens.


## Identifying Information
* Name: Andy Nguyen
* Student ID: 2493321
* Email: annguyen@chapman.edu
* Course: CPSC231 - 04 SP26
* Assignment: MP #2 - Spin and Win
* Known limitations - Have to type exactly lowercase yes/no


## Source Files
* SlotMachine.java
* SlotMachine.class
* README.md


## References
* w3schools: https://www.w3schools.com/java/java_howto_random_number.asp
* Geeks for Geeks: https://www.geeksforgeeks.org/java/switch-statement-in-java/
* Geeks for Geeks: https://www.geeksforgeeks.org/java/arrays-in-java/
* ChatGPT : https://chatgpt.com/share/69a9f60e-3f18-800d-8577-cdb42524f06f - link to chat with all the prompts


## Known Errors
* None currently known.


## Build Instructions
* touch  SlotMachine.java (can't compile most times without this, I don't know why)
* javac SlotMachine.java


## Execution Instructions
* java Slot Machine
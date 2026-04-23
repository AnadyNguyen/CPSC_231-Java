## MP Assignment #3 - Grid-Based Fire Risk Analyzer

# Description  
This program takes input from a file and analyzes a region for wildfire risk. The file includes the number of rows and columns, and then a grid of risky locations.

Each character represents a zone:
- `H` → High risk  
- `M` → Medium risk  
- `L` → Low risk  
- `.` → Unmonitored/unknown  

The program stores the data in a 2D array and performs the following analysis:
- Counts the total number of zones in each risk category for each row
- Counts the number of high-risk zones in each row
- Determines which row contains the highest number of high-risk zones  

The results are written to an output file called `risk_report.txt`, which includes:
- The formatted grid  
- Category totals  
- High-risk counts per row  
- The row with the most high-risk zones  

---

## Identifying Information  
* Name: Andy Nguyen  
* Student ID: 2493321  
* Email: annguyen@chapman.edu  
* Course: CPSC231 - 04 SP26  
* Assignment: MP #3 - Grid-Based Fire Risk Analyzer  

---

## Source Files  
* fireAssesser.java  
* fireAssesser.class  
* fire_risk.txt  
* risk_report.txt  
* README.md  

---

## References  
* Geeks for Geeks: https://www.geeksforgeeks.org/java-arrays/ — used for reviewing 2D arrays  
* Geeks for Geeks: https://www.geeksforgeeks.org/file-handling-in-java/ — used for file input/output  
* w3schools: https://www.w3schools.com/java/java_files_read.asp - used for creating read
* ChatGPT — https://chatgpt.com/share/69cf2411-020c-83e8-b404-a8cf8f57924c - used to understand file handling, 2D arrays, and debugging logic 
* ChatGPT - making this markdown colorful

---

## Known Errors  
* Program assumes correctly formatted input file (no validation for malformed input)  
* File output did not write to a new file automatically when I deleted the file
* Have to declare variables outside try blocks - don't know if this is limitation or better.

---

## Build Instructions  
```bash
touc fireAssesser.java
javac fireAssesser.java
```

---

## Execution Instructions  
```bash
java fireAssesser
```

---

## Notes  
* Input file must be named `fire_risk.txt` and be located in the same directory as the program  
* Output file `risk_report.txt` will be generated in the same directory (will not create a new one if file has been deleted) 

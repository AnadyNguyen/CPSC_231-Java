/*
Andy Nguyen
2493321
annguyen@chapman.edu
CPSC231-04
MP3 : Grid-Based Fire Risk Analyzer - analyzes a grid with different areas with differing fire risks
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
//import everything

public class fireAssesser {
    public static void main (String[] args) {
        Scanner fileScanner = null;
        int high = 0;
        int medium = 0;
        int low = 0;
        int unknown = 0;
        int rows = 0;
        int cols = 0;
        char [][]region = null;
        int [] highPerRow = null;
        int maxRow = 0;
        
        try {
            fileScanner = new Scanner(new File("fire_risk.txt")); 
            System.out.println("Opened files"); //print open file AFTER opening file

            //scan size of region, 1st 2 lines
            rows = fileScanner.nextInt();
            cols = fileScanner.nextInt();

            highPerRow = new int [rows];
            //region rows
            region = new char[rows][cols];

            String line = "";
            while (fileScanner.hasNext()) {
                for (int i = 0; i < rows; i++) {
                    line = fileScanner.next();
                    for (int j = 0; j < cols; j++) {
                        region[i][j] = line.charAt(j);
                    }
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    char c = region[i][j];
                    if (c == 'H') {
                            high++;
                            highPerRow[i]++;
                        } else if (c == 'M') {
                            medium++;
                        } else if (c == 'L') {
                            low++;
                        } else if (c == '.') {
                            unknown++;
                        }
                }
            }
            maxRow = 0;
            for (int i = 1; i < rows; i++) {
                if (highPerRow[i] > highPerRow[maxRow]) { //find max in highPerRow array
                    maxRow = i;
                }
            }
        } catch(FileNotFoundException fnfe){
            System.err.println("File not found.");
            fnfe.printStackTrace();
        } finally{
        if (fileScanner != null) {
            System.out.println("CLOSING FILE");
            fileScanner.close();
        }
      }


    //creating PrintWriter
        try{
            PrintWriter pw = new PrintWriter(new FileWriter("risk_report.txt"));
            pw.println("=== Wild Fire Report ===");
            pw.println("Grid Size:" + rows + " x " + cols);

            pw.println();
            pw.println("Full Grid: ");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    pw.print(region[i][j] + " ");
                }
                pw.println();
            }

            pw.println();

            pw.println("Category Totals: ");
            pw.println("High (H): " + high);
            pw.println("Medium (M): " + medium);
            pw.println("Low (L): " + low);
            pw.println("Unknown (.): " + unknown);

            pw.println();

            pw.println("High-Risk Zones Per Row:");
            for (int i = 0; i < rows; i++) {
                pw.println("Row " + (i + 1) + ": " + highPerRow[i]);
            }
            pw.println();

            pw.println("Row with MOST High-Risk Zones: Row " 
                + (maxRow + 1) + " (" + highPerRow[maxRow] + " H zones)");

            pw.close();
        } catch(IOException ioe){
            System.err.println("Couldn't output to file!");
            ioe.printStackTrace();
        }
    }
}
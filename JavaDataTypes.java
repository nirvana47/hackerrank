import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while(testCases > 0) {
            try {
                long n = scanner.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");   
                }
            }
            catch (InputMismatchException e) {
                String str = scanner.next();
                System.out.println(str + " can't be fitted anywhere.");
                
                // Throwable cause = e.getCause();
                // String causeString = cause.toString();
                // System.out.println(causeString + " can't be fitted anywhere.");
            }
            testCases -= 1;
            
            // int n = scanner.nextInt();

            // try {
            //     long n = scanner.nextLong();
            //     // Long.parseLong(input);
            // } catch (NumberFormatException e) {
            //     // System.out.println(n + " can't be fitted anywhere.");
            //     System.out.println(" can't be fitted anywhere.");
            //     testCases -= 1;
            //     continue;
            // }
            
            // long n = Long.parseLong(i)
        }
        
        scanner.close();
    }
}

// Byte.parseByte(input): Converts a string representation of a byte to a byte value.
// Short.parseShort(input): Converts a string representation of a short to a short value.
// Integer.parseInt(input): Converts a string representation of an int to an int value.
// Long.parseLong(input): Converts a string representation of a long to a long value.
// Float.parseFloat(input): Converts a string representation of a float to a float value.
// Double.parseDouble(input): Converts a string representation of a double to a double value.

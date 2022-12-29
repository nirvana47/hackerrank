import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int numOfLines = 0;
        
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            numOfLines += 1;
            sb.append(numOfLines);
            sb.append(" ");
            sb.append(line);
            sb.append("\n");
        }
        
        String output = sb.toString();
        System.out.print(output);
        
        scanner.close();
    }
}

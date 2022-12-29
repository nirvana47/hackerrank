import java.util.Scanner;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < 3; i++) {
        //     System.out.pr42intln(scanner.nextInt());
        // }
        // scanner.close();

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int N = Integer.parseInt(bufferedReader.readLine().trim());
        // System.out.println("N: " + N);

        // bufferedReader.close();

        Scanner scanner = new Scanner(System.in);
        int intInput = scanner.nextInt();
        double doubleInput = scanner.nextDouble();
        String stringInput = scanner.nextLine();
        // String s1,s2,s3 = "";
        
        System.out.println("String: " + stringInput);
        System.out.println("Double: " + doubleInput);
        System.out.println("Int: " + intInput);
        
        scanner.close();
    }

    public void outputFormatting() {
        // System.out.println("================================");
        Scanner scanner = new Scanner(System.in);
        int n1, n2, n3;
        String s1, s2, s3 = "";
        s1 = scanner.next();
        n1 = scanner.nextInt();
        // s2 = scanner.next();
        s2 = scanner.next();
        n2 = scanner.nextInt();
        // s3 = scanner.next();
        s3 = scanner.next();
        n3 = scanner.nextInt();
        scanner.close();
        
        System.out.println("================================");
        PrintStream out = System.out;
        out.printf("%-15s%03d\n", s1, n1);
        out.printf("%-15s%03d\n", s2, n2);
        out.printf("%-15s%03d\n", s3, n3);
        System.out.println("================================");
    }
}

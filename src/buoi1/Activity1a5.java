package buoi1;

import java.util.Scanner;

public class Activity1a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number entered by user (n): ");
        int a = scanner.nextInt();
        int b = a * 10 + a ;
        int c = b * 10 + a ;
        int sum = a + b + c ;
        System.out.println("Result of operation: n + nn + nnn = " + sum);

    }

}

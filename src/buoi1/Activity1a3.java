package buoi1;

import java.util.Scanner;

public class Activity1a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number: ");
        int a = scanner.nextInt();
        System.out.print("Second number: ");
        int b = scanner.nextInt();
        long sum = a + b ;
        int effect = a - b ;
        long product = a * b ;
        int quotient = a / b ;
        int mod = a % b ;
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + effect);
        System.out.println("a * b = " + product);
        System.out.println("a / b = " + quotient);
        System.out.println("a mod b = " + mod);


    }
}

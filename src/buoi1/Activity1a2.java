package buoi1;

import java.util.Scanner;

public class Activity1a2 {
    public static void main(String[] args) {
        System.out.println("Mời nhập vào:");
        System.out.print("số a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("số b: ");
        int b = scanner.nextInt();
        long sum = (a + b);
        long product = (a * b);
        System.out.println("sum a + b = " + sum);
        System.out.println("product a * b = " + product);

    }
}

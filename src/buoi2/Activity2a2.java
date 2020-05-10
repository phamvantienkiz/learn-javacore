package buoi2;

import java.util.Scanner;

public class Activity2a2 {
    public static void main(String[] args) {
        System.out.print("Fibonacci lenght: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Fibonacci lenght phai lon hon 0, moi nhap lai ");
        } else if (n == 1) {
            System.out.println("0 ");
        } else if (n == 2) {
            System.out.println("0 1 ");
        } else if (n == 3) {
            System.out.println("0 1 1 ");
        }
        if (n > 3) {
            System.out.print("0 1 1 ");
            for (int i = 3; i < n; i++) {
                System.out.print(fibonacci(i) + " ");

            }
        }
    }

    public static int fibonacci(int x) {
        if (x < 0) {
            return -1;
        } else if (x == 0 || x == 1) {
            return x;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
}
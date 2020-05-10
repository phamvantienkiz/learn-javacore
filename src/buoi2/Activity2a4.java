package buoi2;

import java.util.Scanner;

public class Activity2a4 {
    public static void main(String[] args) {
        System.out.println("Nhap do cao cua tam giac: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int r = 1; r <= n; r++) {
            for (int sp = n - r + 1; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            for (int c = r - 1; c >= 1; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



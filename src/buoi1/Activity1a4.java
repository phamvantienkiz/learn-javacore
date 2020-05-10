package buoi1;

import java.util.Scanner;

public class Activity1a4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A number: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            //kt gia tri - dieu kien - tang giam bien
            int product = a * i;
            System.out.println(a + "x" + i + "=" + product);
        }
    }
}

package buoi2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Activity2a3 {
    public static void main(String[] args) {
        System.out.print("Number entered by user; ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 1 ; i <= a ; i++) {
            sum += i ;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double average = (((double)sum) / a) ;
        System.out.println("The sum of 1 to " +a+" is: " + sum);
        System.out.println("The average is: " + average);
    }
}

package buoi6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity7a1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        System.out.print("So phan tu cua list: ");
        int n = scanner.nextInt();
        System.out.println();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu "+(i+1)+" ");
            String data = scanner.nextLine();

            list.add(data);

        }
        scanner.nextLine();
        System.out.println(list);
        System.out.print("Location Muon them data; ");
        int location = scanner.nextInt();
        System.out.println();
        System.out.print("Data: ");
        String dataPlus = scanner.nextLine();
        scanner.nextLine();
        System.out.println();
        list.add((location-1),dataPlus);
        System.out.println("List after ");
        System.out.println(list);

    }
}

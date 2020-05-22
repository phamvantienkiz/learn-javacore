package buoi3;

import java.util.Scanner;

public class Activity3a5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        System.out.println();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }*/
                 //0   1  2  3    4  5  6  7  8  9  10
        int a[] = {49, 1, 2, 200, 2, 3, 4, 5, 8, 9, 10};
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int p = a[i];
                    a[i] = a[j];
                    a[j] = p;
                }
            }
        }
        /*System.out.print("Mang giam dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();*/
        int x=0;
        int k=0;
        int compare=0;
        int max=0;
        int vtdau=0;
        int vtcuoi=0;
        for (int i = 0; i < n - 1; i++) {
            /*for (int j = i + 1; j < n; j++) {*/
                if ((a[i] +1) == a[i+1]) {
                    x = i;
                } else {
                    k = i+1;
                    compare = k - x;

                    if (max < compare) {
                        max = compare;
                        vtdau = x;
                        vtcuoi = k;
                    }
                }
            }
        /*}*/
        for (int i = vtdau; i < vtcuoi; i++) {
            System.out.print(a[i]+" ");
        }

    }
}

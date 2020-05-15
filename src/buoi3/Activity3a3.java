package buoi3;

import java.util.Scanner;

public class Activity3a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        System.out.println();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]= ");
            a[i] = scanner.nextInt();
        }
        //0 1 2  3  4 5 6 7  8  9
        /*int a[] = {3, 5, 2, -14, 6, 9, 1, 7, -2, 11};
        int n = a.length;*/
        //trung binh cong cac so le o vi tri chan
        int sum = 0;
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (a[i] % 2 != 0) {
                    sum = sum + a[i];
                    d = d + 1;
                }
            }
        }
        double average = (((double) sum) / d);
        System.out.println("Trung binh cong cac so le o vi tri chan la: " + average);

        //tim so lon nhat trong mang vua nhap
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("So lon nhat trong mang vua nhap la: " + max);

        //Tìm vị trí số nhỏ nhất trong mảng
        int min = a[0];
        int v = 0;
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
                v = i;
            }
        }
        System.out.println("Vị trí các số nhỏ nhất trong mảng la: " + v + " ");

        //Đếm các số chính phương có trong mảng
        int d1 = 0;
        for (int i = 0; i < n; i++) {
            if (checkscp(a[i])) {
                d1 = d1 + 1;
            }
        }
        System.out.println("Số luong cac so chính phương có trong mảng la: " + d1);

        //Hiện thị các số nguyên tố có trong mảng lên màn hình
        System.out.print("Cac so ngto co trong mang la: ");
        for (int i = 0; i < n; i++) {
            if (checksnt(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();

        //Thay thế các phần tử âm có trong mảng bằng giá trị 0
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                a[i] = 0;
            }
        }
        System.out.print("Mang after: ");
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();

        //Xóa các phần tử âm có trong mảng
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                for (int k = i; k < n - 1; k++) {
                    a[k] = a[k + 1];
                }
                n = n - 1;
            }
        }
        System.out.print("Mang sau khi xoa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //Sắp xếp mảng đã nhập theo thứ tự giảm dần
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int p = a[i];
                    a[i] = a[j];
                    a[j] = p;
                }
            }
        }
        System.out.print("Mang giam dan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();


    }

    //hàm kt số chính phương em xem trên google =)) may cai ham nay giong het pascal
    public static boolean checkscp(int n) {
        int temp = (int) Math.sqrt(n); //can bat 2
        if (temp * temp == n) {
            return true;
        } else {
            return false;
        }
    }

    //ham kt so ngto em cx xem tren google =))
    public static boolean checksnt(int n) {
        if (n < 2) {
            return false;
        }
        //check UCLN cua n
        int z = (int) Math.sqrt(n);
        for (int i = 2; i <= z; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

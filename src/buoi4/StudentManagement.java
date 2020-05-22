package buoi4;

import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        //tong so sinh vien
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tong so sinh vien: ");
        int n = scanner.nextInt();
        //danh sach studnet
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Students[" + i + "]= ");
            students[i] = new Student(scanner.nextLine(), (int) scanner.nextFloat());
        }

        //dem so sinh vien do
        int d = 0;
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (students[i].getGpa() > 1.5) {
                ++d;
            } else {
                ++t;
            }
        }
        System.out.println("Tong so sinh vien do la: " + d);
        System.out.println("Tong so sinh vien truoc la: " + t);
    }
}



package buoi4;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tong so Svien: ");
        int n = scanner.nextInt();
        System.out.println();
        Student[] student = new Student[n];

        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Sinh vien "+ (i+1) + " Ten: ");
            String name = scanner.nextLine();
            System.out.print("   -   Diem GPA: ");
            float gpa = scanner.nextFloat();
            System.out.println();
            scanner.nextLine();
            student[i] = new Student(name, gpa);
        }

        StudentManagement studentManagement = new StudentManagement(student);

        System.out.println("Tong so sinh vien do la: "+ studentManagement.demSVDo());
        System.out.println("Tong so sinh vien truoc la: "+ studentManagement.demSVTruoc());
        System.out.print("Sinh vien co GPA cao nhat la: ");
        studentManagement.svGPAmax();
        System.out.print("Sinh vien co GPA thap nhat la: ");
        studentManagement.svGPAmin();
        /*Student sinhVien1 = new Student();

        sinhVien1.name = "Nguyen Van A";
        sinhVien1.diem = 3.5f;
        sinhVien1.age = 18;
        sinhVien1.mssv = "SV1";

        System.out.println("Diem trc: "+ sinhVien1.diem);
        sinhVien1.congDiem(2.0f);*/

       /* Student sinhVien1 =new Student("Nguyen Van A", 20);
        Student [] sinhviens = new Student[3];
        sinhviens[0] = sinhVien1;
        sinhviens[1] = new Student("Nguyen Van B", 23);
        sinhviens[2] = new Student("Nguyen Van C", 26);
*/
        /*Student temp;
        for (int i = 0; i < sinhviens.length; i++) {
            for (int j = i+1; j < sinhviens.length; j++) {
                if (sinhviens[i].getAge() < sinhviens[j].getAge()) {
                    temp = sinhviens[i];
                    sinhviens[i] = sinhviens[j];
                    sinhviens[j] = temp;
                }
            }
        }
        for (Student a :sinhviens) {
            System.out.println(a.getName() + "-"+ a.getAge());
        }*/


    }
}

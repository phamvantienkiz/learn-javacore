package buoi4;

import java.util.Scanner;

public class Student {
    private String name;
    private float gpa;
   /* private int age;
    private float diem;
    private String mssv;
    private String genter;*/

    public Student(String name, int age) {
        this.name = name;
        this.gpa = gpa;
        //this.age = age;

    }

    public Student() {

    }

    public Student(String nextLine) {
    }

    public Student(float nextFloat) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() { return gpa; }

    public void setGpa(int gpa) { this.gpa = gpa; }

    /*public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void congDiem(float diemCong) {
        diem = diem + diemCong;
    }
*/

}

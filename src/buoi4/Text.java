package buoi4;

public class Text {
    public static void main(String[] args) {

        /*Student sinhVien1 = new Student();

        sinhVien1.name = "Nguyen Van A";
        sinhVien1.diem = 3.5f;
        sinhVien1.age = 18;
        sinhVien1.mssv = "SV1";

        System.out.println("Diem trc: "+ sinhVien1.diem);
        sinhVien1.congDiem(2.0f);*/

        Student sinhVien1 =new Student("Nguyen Van A", 20);
        Student [] sinhviens = new Student[3];
        sinhviens[0] = sinhVien1;
        sinhviens[1] = new Student("Nguyen Van B", 23);
        sinhviens[2] = new Student("Nguyen Van C", 26);

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

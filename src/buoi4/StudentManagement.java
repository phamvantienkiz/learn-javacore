package buoi4;

import java.util.Arrays;

public class StudentManagement {
    private int totalStudent;
    private Student[] student;

    public StudentManagement(Student[] student) {
        this.student = student;
        this.totalStudent = this.student.length;
    }

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentManagement{" +
                "student=" + Arrays.toString(student) +
                '}';
    }

    public int demSVDo() {
        int d = 0;
        for (int i = 0; i < totalStudent; i++) {
            if (student[i].checkgpa() == true) {
                d = d + 1;
            } else {
                d = d + 0;
            }
        }
        int demSVDo = d;
        return demSVDo;
    }

    public int demSVTruoc() {
        int t = 0;
        for (int i = 0; i < totalStudent; i++) {
            if (student[i].checkgpa() == false) {
                t = t + 1;
            } else {
                t = t + 0;
            }
        }
        int demSVTruoc = t;
        return demSVTruoc;
    }

    public Student svGPAmax() { //tra ra thong tin, thay void bang student
        float max = 0;
        Student svGPAmax = null;
        for (int i = 0; i < totalStudent; i++) {
            if (student[i].getGpa() > max) {
                max = student[i].getGpa() ;
                svGPAmax = student[i] ;
            }
        }
        return svGPAmax;
    }

    public Student svGPAmin() {
        float min = 0;
        Student svGPAmin = null;
        for (int i = 0; i < totalStudent; i++) {
            if (student[i].getGpa() > min) {
                min = student[i].getGpa() ;
                svGPAmin = student[i] ;
            }
        }
        return svGPAmin;
    }


}



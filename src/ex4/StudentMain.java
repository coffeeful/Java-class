package ex4;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        //기본생성자로 student1 객체 생성
        Student student1 = new Student();
        student1.studentName = "학생1 ";
        student1.studentNuber = "20231211";
        student1.studentMajor = "디지털사이언스과";


        //매개변수 있는 생성자로 studen2 객체 생성
        Student student2 = new Student("학생2", "20231211", "디지털사이언스과");

    }
}

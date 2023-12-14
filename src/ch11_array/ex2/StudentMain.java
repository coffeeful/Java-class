package ch11_array.ex2;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        // Studednt 클래스 객체를 담기 위한 List
        //studentList

        List<Student> studentList = new ArrayList<>();
        // studentList.add(12); // X
        String studedntName = "학생1";
        //studentList.add(studedntName); // X
        // Student 객체
        Student student1 = new Student(1L, "학생1", "2023", "컴퓨터학과", " 010-1234-5678");
        Student student2 = new Student(2L, "학생2", "1214", "3조과", " 010-4321-8765");
        // studentList 추가
        studentList.add(student1);
        studentList.add(student2);


        System.out.println("studentList = " + studentList.get(0));
        System.out.println("studentList = " + studentList.get(1));

      Student a = studentList.get(0);
        System.out.println("a = " + a);
        System.out.println(a.getStudentName());

        // 1번 인덱스에 담긴 객체의 학과만 출력
        System.out.println(studentList.get(1).getStudedntMajor());

        // 반복문
        for (int i= 0; i < studentList.size(); i++) {
            System.out.println("studentList = " + studentList.get(i));
            //학생의 이름만 따로 출력
            System.out.println("studentList = " + studentList.get(i).getStudentName());

        }

        // for each

        for( Student stu: studentList) {
            System.out.println("stu = " + stu);
            // 이름만
            System.out.println("studedntName = " + stu.getStudentName());
        }

    }
}

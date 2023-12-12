package ch10_class.ex9;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        //  기본생성자로 Student 클래스 객체 만들고 setter를 이용하여 필드값 채우기
        Student student = new Student();
        student.setStudentName("이름");
        student.setStudentNumber("123456");
        student.setStudentMajor("컴퓨터학과");
        student.setStudentMobile("010-1234-5678");

        //  모든 필드를 매개변수로 하는 생성자로 Student 클래스 객체 만들기
        Student student1 = new Student("이름","123456","컴퓨터학과","010-1234-5678");


        // 각각의 객체에서 print 메서드 호출하여 필드값 출력
        String print = student.print();
        System.out.println(print);


    }


    }


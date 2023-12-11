package ex4;

public class Student {
    // 이름(studentName), 학번(studentNuber), 학과(studentMajor), 필드

    //기본생성자

    // 이름, 학번 , 학과를 매개변수로 하는 생성자

    String studentName;
    String studentNuber;
    String studentMajor;
    public Student(){
    }

    public Student(String StudentName, String studentNuber, String studentMajor) {
            System.out.println("StudentName = " + StudentName + ", studentNuber = " + studentNuber + ", studentMajor = " + studentMajor);
            //전달 받은 매개변수 값을 필드에 담기
            this.studentName = studentName;
            this.studentNuber = studentNuber;
            this.studentMajor = studentMajor;

    }
}


package ch10_class.ex3;



public class Student {

    //필드선언
    String studentName;
    String studentMajor;
    String studentMobile;

    // 기본생성자
    public Student() {
        System.out.println("Student 기본생성자");
        // 기본생성자만 정의하면 주석처리 및 선언하지않아도 사용 가능
    }
//    // 매개변수가 있는 생성자
    public Student(String studentName){
        System.out.println("name을 매개변수로 하는 생성자");
        System.out.println("studentName = " + studentName);
    // 매개변수가 있는 생성자만 정의하려면 기본 생성자를 사용할 수 없음
    // 추가적으로 기본생성자를 선언해야 함.
    }
    // 매개변수가 2개 있는 생성자
    public Student(String studentName, String studentMajor) {
        System.out.println("studentName = " + studentName + ", studentMajor = " + studentMajor);
    }

    //이름, 학과, 전화번호를 매개변수로 하는 생성자
    public Student(String studentName, String studentMajor, String studentMobile){
        System.out.println("studentName = " + studentName + ", studentMajor = " + studentMajor + ", studentMobile = " + studentMobile);

    }
}

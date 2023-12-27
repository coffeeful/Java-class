package ch12_classes.ex01;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    /**
     * method name: method1
     * parameter : x
     * return : x
     */
    StudentRepository studentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);
    public void method1() {
        System.out.println("StudentService.method1");
        // Repository의 method1을 호출
        studentRepository.method1();
    }

    public void method2() {
        System.out.println("StudentService.method2");
        String str1 = "집에 가고 싶다 격하게";
        studentRepository.method2(str1);

    }

    /**
     * StudentDTO 객체를 생성하고
     * Repository의 method3
     */
    public void method3() {
        System.out.println("StudentService.method3");
        StudentDTO studentDTO = new StudentDTO("학생1","20231215","학과1","010-1111-2222");

        boolean result =studentRepository.method3(studentDTO);
        if(result){
            System.out.println("학생등록 성공");
        }else {
            System.out.println("학생등록 실패");
        }
    }

    /**
     * Repository로 부터 List를 리턴 받아 for문으로 출력
     */
    public void  method4(){
        List<StudentDTO> studentDTOList=  studentRepository.method4();
        for (StudentDTO studentDTO: studentDTOList ){
            System.out.println("studentDTO = " + studentDTO);

        }
    }
    /**
     * 조회할 id를 입력받고
     * id를 repository로 전달하고
     * repository로 부터 id에 해당하는 학생정보를 리턴받고
     * 학생 정보를 출력
     */
public void method5(){
    System.out.println("조회할 id: ");
    Long id = scanner.nextLong();
    StudentDTO studentDTO = studentRepository.method5(id);
    if (studentDTO != null){
        //조회결과 있음
    System.out.println("studentDTO = " + studentDTO);
    }else {
        //조회결과 없음
        System.out.println("요청하신 정보를 찾을 수 없습니다.");
    }

}
}
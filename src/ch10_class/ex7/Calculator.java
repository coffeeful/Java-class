package ch10_class.ex7;

import java.util.Scanner;

public class Calculator {
    /**
     * 덧셈 메서드
     * method name: sum
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 합을 출력
     */
    public void sum(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);

        int sum = a + b;
        System.out.println(sum);
    }

    /**
     * 뺄셈 메서드
     * method name: sub
     * parameter: int 타입 2개
     * return: x
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 차를 출력
     */
    public void sub(int a, int b) {
        System.out.println("a = " + a + ", b = " + b);

        int sub = a - b;
        System.out.println(sub);
    }

    /**
     * 곱셈 메서드
     * method name: mul
     * parameter: int 타입 2개
     * return: int 타입
     * 실행내용
     * - 매개변수로 전달 받은 2개 값의 곱 결과를 리턴
     */
public int mul(int num1, int num2) {
    System.out.println("num1 = " + num1 + ", num2 = " + num2);

    int result1 = num1;
    int result2 = num2;


    return num1*num2;
}

    /**
     * 나눗셈 메서드
     * method name: div
     * parameter: 없음
     * return: int 타입
     * 실행내용
     *  - 스캐너로 나눗셈에 필요한 정수 2개를 입력받음
     *  - 나눗셈 결과를 리턴
     */
public int div(){
    Scanner scanner= new Scanner(System.in);
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();
    int div = num1 / num2;
    return div;


}
}



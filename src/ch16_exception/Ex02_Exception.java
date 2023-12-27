package ch16_exception;

import java.util.ArrayList;
import java.util.List;

public class Ex02_Exception {
    public static void main(String[] args) {
        // 아래 코드 실행시 발생하는 예외를 확인하고 예외발생시 0으로 나눌 수 없습니다! 가 출력되도록

        List<String> stringList = new ArrayList<>();

        try {
            System.out.println(10/0);
        }catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다!");
            e.printStackTrace();
        }
        System.out.println("프로그램 끝!");
    }
}

package ch09_ArrayBasic;

import java.util.Scanner;

public class Ex03_ArrayBasic {
    public static void main(String[] args) {

        /**
         * 크기가 3인 정수형 배열을 선언하고
         * 실행 했을 때 스캐너로 정수값을 입력받아 배열에 저장
         * 배열에 저장된 값의 총합, 평균 계산
         */
        int[] numbers1 = new int[3];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i=0; i <numbers1.length; i++){
            numbers1[i] = scanner.nextInt();
           sum = sum + numbers1[i];

        }
        int average =0;
         average = sum / numbers1.length;
        System.out.println("정수값의 총합은 :" + sum + "  평균은 : " + average + " 입니다.");

    }
}

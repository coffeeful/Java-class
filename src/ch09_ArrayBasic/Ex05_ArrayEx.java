package ch09_ArrayBasic;

import java.util.Scanner;

public class Ex05_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값 중에서 가장 큰 값을 출력
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("배열 입력: ");

        int max = 0;
        int[] Array = new int[5];

        for (int i =0; i < Array.length; i++) {

            Array[i] = scanner.nextInt();
                if (max < Array[i]) {
                    max = Array[i];

                }


        } System.out.println("가장 큰 값은 " + max + " 입니다.");
        }
    }

package ch09_ArrayBasic;

import java.util.Scanner;

public class Ex07_ArrayEx {
    public static void main(String[] args) {

        /**
         * 스캐너로 입력 받은 숫자의 크기를 갖는 배열을 만들어 봅시다.
         * 예를 들어 5를 입력하면
         * 크기가 5인 배열이 만들어져야 함.
         */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] num = null;
        num = new int[size];

        System.out.println("크기 = " + num.length);
    }
}

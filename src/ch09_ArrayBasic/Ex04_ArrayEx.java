package ch09_ArrayBasic;

import java.util.Scanner;

public class Ex04_ArrayEx {
    public static void main(String[] args) {

        int num[]= { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
        /**
         * 위와 같은 배열이 있을 때 1~10 사이의 숫자 중에서 하나를
         * 입력했을 때 그 숫자가 몇 번 인덱스에 있는지 출력
         */
        Scanner scanner = new Scanner(System.in);
//        System.out.println("숫자 : ");
//        int input = scanner.nextInt();
//
//        for(int i =0; i< num.length; i++){
//            if(input==num[i]){
//                System.out.println(input +"은(는) " + i + " 번 인덱스에 있습니다.");
//            }
//        }

        /**
         * 거스름돈 계산하기
         * 필요한 거스름돈을 입력했을 때 각 동전별로 몇 개가 필요한지 계산
         * 예)
         * 170 이라고 입력하면
         * 100원 1개 50원 1개 10원 2개
         * 780원 이라고 입력하면
         * 500원 1개 100원 2개 50원 1개 10원 3개
         *
         */

        int[] coin = {500, 100, 50, 10};

        System.out.print("거스름돈 입력: " );
        int change =0; //거스름돈
        int count = 0;
        change = scanner.nextInt();

        for (int i =0; i <coin.length; i++){    //거스름돈/동전 = 몫(갯수)
            count =  change / coin[i];
            System.out.println(coin[i]+ " 원 동전: " + count + " 개");
            // 나머지를 다음번 계산에 활용
            change = change % coin[i];
        }

    }
}

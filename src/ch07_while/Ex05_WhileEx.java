package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         *  random() 메서드를 이용해서 1~100 사이의 숫자를 하나 만들고
         *  반복문 안에서 해당 숫자를 맞출 때까지 계속 숫자를 입력받도록 하고
         *  숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int answer = (num = (int) (Math.random() * 100) + 1);
        int count = 0;
        boolean run = true;




        while (run) {
            num = (int) (Math.random() * 100) + 1;
            System.out.print("1부터 100까지의 숫자를 입력하세요 :  ");
            num = scanner.nextInt();
            if(answer>num){
                System.out.println("더 큰 수를 입력하세요.");
            } else if (answer<num) {
                System.out.println("더 작은 수를 입력하세요.");




            } else {

                System.out.println("맞췄습니다!");
                run = false;


               // break;
            }
            count++;





        }
        System.out.println("시도 횟수는 "  +count + "회 입니다");

    }

}

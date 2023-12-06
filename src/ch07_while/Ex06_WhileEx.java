package ch07_while;

import java.util.Scanner;

public class Ex06_WhileEx {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 0을 입력하세요 : ");
        int num= 0;
        boolean run = true;
        int sum = 0;

        while (run){
           int i = scanner.nextInt();
            if(i==0){
                run = false;
                System.out.println("입력한 숫자는  " + num + " 개 입니다");
                System.out.println("평균은  " + (sum / num) + "  입니다");
            }else{

                sum += i; // sum == sum + i;
                num++;
            }

        }



    }
}

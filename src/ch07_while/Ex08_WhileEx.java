package ch07_while;

import java.util.Scanner;

public class Ex08_WhileEx {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean run = true;
        int seclect = 0; //번호선택
        int deposit = 0; //예금
        int balance = 0; //잔고
        int withdraw = 0; //출금
        while (run){
            System.out.println("=========================================");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
            System.out.println("=========================================");
            seclect = scanner.nextInt();

            if (seclect==1){
                System.out.print("예금액 :  ");

                deposit = scanner.nextInt();
                balance += deposit; //잔고

                System.out.println("현재 잔액은 :  " + balance + " 원 입니다." );

            } if (seclect==2) {
                System.out.print("출금액 :  ");
                withdraw = scanner.nextInt();
                balance += withdraw;

                System.out.println("현재 잔액은 :  " + balance + " 원 입니다.");
            }else if (balance < withdraw) {
                    deposit = scanner.nextInt();
                    balance -= deposit; //잔고
                    System.out.println("잔고가 부족합니다. ");{
                }

            } else if (seclect==3) {

                System.out.println("현재 잔액은 :  " + balance + " 원 입니다." );
            }else{
                run= false;
                System.out.println("종료합니다.");
            }

        }
    }
}
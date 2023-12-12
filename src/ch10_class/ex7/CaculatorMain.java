package ch10_class.ex7;

import javax.swing.*;
import java.util.Scanner;

public class CaculatorMain {
    public static void main(String[] args) {
        /**
         * 실행하면 반복문으로 메뉴를 출력
         * 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈
         * 각 번호를 선택하면 Calculator 클래스에 있는 해당 메서드를 호출하여 결과를 출력함
         */
        Scanner scanner= new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean run = true;
        int select =0;

        while (run) {
            System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 5. 종료");
            select = scanner.nextInt();

            if (select == 1) {
                System.out.print("숫자 입력: ");
                int result1 = scanner.nextInt();
                int result2 = scanner.nextInt();
                calculator.sum(result1, result2);


            } else if (select== 2) {
                System.out.print("숫자 입력: ");
                int result3 = scanner.nextInt();
                int result4 = scanner.nextInt();
                calculator.sub(result3,result4);

            } else if (select== 3) {
                System.out.print("숫자 입력: ");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int mul =calculator.mul(num1,num2);
                System.out.println(mul);

            } else if (select==4) {
                System.out.print("숫자 입력: ");
                int div = calculator.div();
                System.out.println(calculator.div());
            } else if (select==5) {
                run = false;

            }
        }


    }
    }


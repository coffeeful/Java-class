package ch07_while;

public class Ex02_WhileEx {
    public static void main(String[] args) {
        /**
         * while 문으로 1부터 10 까지의 합계 출력
         * 출력
         * 1+2+3+4+5+6+7+8+9+10=55
         */

        int A = 1;
        int sum = 0;
        while (A <= 10) {
            System.out.print(A);
        sum += A;
        if(A <10) {
            System.out.print("+");
        }else {
            System.out.print("=");
        }

            A++;
        }
        System.out.print(sum);
    }
}

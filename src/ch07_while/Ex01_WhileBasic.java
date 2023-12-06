package ch07_while;

public class Ex01_WhileBasic {

    public static void main(String[] args) {

        // 1 ~3 까지 출력
        for (int i=1; i <= 3; i++) {
            System.out.println("1 = " + i);
        }
        int i =1;
        while (i <= 3) {
            System.out.println("i = " + i);
            i++;
        }
        int j = 10;
        do {   //조건을 따지기 전에 한번은 실행함.
            System.out.println("j = " + j);
            j++;
        } while (j <= 3);
        System.out.println("do while 종료 후 J = " + j);

        // 무한반복
        int k = 1;
        while (true) {
            System.out.println("무한반복~~" + k);
            k++;
            if(k == 3) {
                break;
            }
            System.out.println("break 다음 문장");
        }

        int l = 1;
        boolean run = true;
        while (run) {
            System.out.println("l = " + l);
            l++;
            if (l == 3) {
                run = false;
            }
            System.out.println("run=false 다음 문장");
        }
    }
}

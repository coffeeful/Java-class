package baekJoon.practices;

import java.util.Scanner;

public class Main_2752 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int[] up = {num1, num2, num3};

        System.out.println("가장 작은수: " + up[0]);
        System.out.println("그 다음수: " + up[1]);
        System.out.println("가장 큰 수: " + up[2]);






    }
}

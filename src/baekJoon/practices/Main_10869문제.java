package baekJoon.practices;

import java.util.Scanner;

public class Main_10869문제 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int num1 = i, num2 = j;

        i = (num1 + num2);
        System.out.println(i);

        i = (num1 - num2);
        System.out.println(i);

        i = (num1 * num2);
        System.out.println(i);

        i = (num1 / num2);
        System.out.println(i);

        i = (num1 % num2);
        System.out.println(i);

    }
}

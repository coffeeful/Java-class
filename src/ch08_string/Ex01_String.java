package ch08_string;

import java.util.Scanner;

public class Ex01_String {
    public static void main(String[] args) {
//        String str1 = "안녕";
//        String str2 = "안녕";
//        String str3 = new String("안녕");
//        // str1, str2 같은지
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//        System.out.println(str1.equals(str3)); // 참조형에서만 .equals()를 사용해서 같은지 비교
//
        System.out.println("메시지를 입력하세요. ");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요. ");
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        String word1 = "";

        String word2 = "종료";

        while (run) {
            System.out.print(">");
            word1 = scanner.nextLine();
            if  (word1.equals(word2)) {

                System.out.println();
                run= false;




            } else if (word1 !=word2) {


                System.out.println(word1);


            }
        }
    }
}










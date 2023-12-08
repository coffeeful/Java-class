package ch09_ArrayBasic;

import java.util.Scanner;

public class Ex08_ArrayEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean run = true;
        int seclect = 0; //번호 선택
        int number = 0;  //학생수 입력
        int scoreinput = 0; //점수 입력
        int[] scorelist = null; //점수목록
        double analysis = 0; //분석

        while (run) {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("1.학생수 입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
                    System.out.println("-------------------------------------------------------");
                    System.out.print("선택 > ");
            seclect = scanner.nextInt();
            if(seclect==1){
                    System.out.print("학생 수 > ");
                number = scanner.nextInt();
                scorelist = new int[number];
            }if(seclect==2){

                 for(int i=1; i < number; i++){
                 scoreinput = scanner.nextInt(number);
                     System.out.println(number + "번 학생 점수: ");
                 }



            }
        }
    }
}
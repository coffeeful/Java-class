package ch09_ArrayBasic;

import java.util.Scanner;

public class Ex08_ArrayEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //스캐너 객체를 선언한다

        boolean run = true;
        //boolean 타입의 run 변수를 선언해서 true를 대입한다
        int select = 0; //번호 선택
        //int 타입의 select 변수를 선언해서 0을 대입한다
        int number = 0;  //학생수 입력
        int[] scorelist = null; //점수목록
        // 배열 이름만 지정하고 배열이 아직 아님
        double analysis = 0; //분석
        //double 타입의 analysis 변수를 선언해서 0을 대입한다.

        while (run) {
                    System.out.println("-------------------------------------------------------");
                    System.out.println("1.학생수 입력 | 2.점수입력 | 3.점수목록 | 4.분석 | 5.종료");
                    System.out.println("-------------------------------------------------------");
                    System.out.print("선택 > ");
            select = scanner.nextInt();
            // 전역변수이긴 하지만 while문이 실행될 때 마다 다시 선언되어 배열로 활용 불가
            if(select ==1){
                // 학생수 입력 받고 해당 수 크기를 갖는 배열로 선언
                    System.out.print("학생 수 > ");
                number = scanner.nextInt();
                // 입력받은 학생수만큼의 크기를 갖는 배열 객체로 선언(new)
                scorelist = new int[number];
                //지역변수로 선언하면 else if 에서는 사용 불가
            }else if(select ==2){
                //배열에 점수 데이터 저장
                 for(int i=0; i < scorelist.length; i++){
                     System.out.print(i + 1 + "번 학생 점수: ");
                     scorelist[i] = scanner.nextInt();
             }
            } else if (select ==3) {
                //저장된 데이터 출력
                for (int i =0; i < scorelist.length; i++){
                    System.out.println((i + 1) + "번 학생 점수: " + scorelist);
                }
            }
        }
    }
}
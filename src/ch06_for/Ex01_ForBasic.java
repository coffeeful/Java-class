package ch06_for;

public class Ex01_ForBasic {
    public static void main(String[] args) {
        //0 ~ 3 출력
        for (int i= 0; i < 4; i++) {
            System.out.println("i = " + i);
        }
        //0 ~ 4 출력
        for (int i =0; i<= 4; i++){
            System.out.println("i = " + i);
        }

            //반복변수 초기값이 조건을 만족하지 않는다면
        for (int i = 10; i<=4; i++) {
            System.out.println("보이나요?");
            System.out.println("i = " + i);
        }
                //i는 for문 내에서 선안된 지역변수이기 때문에 for문을 벗어나면 사용불가
        //system.out.pribtln(i);

            // 반복문 종료 후에도 반복변수를 사용하려면
        int j = 0;
        for (j = 0; j < 3; j++) {
                System.out.println("j = " + j);
        }
        System.out.println("반복문 종료 후 j=" + j);

        // 반복문 for : 조건이 참인 동안 반복실행
        // for(초기문; 조건문; 증감문){
        //      실행문;
        // }
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
    }
}





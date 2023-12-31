package ch09_ArrayBasic;

public class Ex01_ArrayBasic {
    public static void main(String[] args) {
        // 크기가 5인 정수형배열 nubers1
        int[] numbers1 = new int[5];
        System.out.println("numbers1[0] = " + numbers1[0]);
        numbers1[0]= 100;
        System.out.println("numbers1[0] = " + numbers1[0]);
        //배열의 크기 확인
        System.out.println(numbers1.length);
        System.out.println("numbers1[0] = " + numbers1[5]); // 0부터 시작이기 때문에 0~4 까지만 존재

        // 크기가 3인 String 배열 strings1
        String[] strings1 = new String[3];
        System.out.println("strings1[0] = " + strings1[0]);

        // 크기가 10인 실수형배열 doubles1
        double[] doubles = new double[10];
        System.out.println("doubles[0] = " + doubles[0]);

        // 정수형배열 numbers2 이름만 선언하고 다음 줄에 크기 8을 지정하여 배열 선언
        int[] numbers2 = null;
        numbers2 = new int[8];
        System.out.println("numbers2[0] = " + numbers2[0]);


        //10, 20, 30, 40이 들어있는 numbers3 배열 선언
        int[] nunbers3 = {10, 20, 30, 40};

        //"가", "나", "다", "라"가 들어있는 strings2 배열 선언
        String[] strings2 = {"가", "나", "다", "라"};

        // 배열 : 동일한 타입의 여러개의 값을 넣어줄 때 사용
        // 1, 2, 3, 4, 5
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        int[] nums = {1,2,3,4,5};
        // 인덱스 : 0부터 시작
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }


    }
}

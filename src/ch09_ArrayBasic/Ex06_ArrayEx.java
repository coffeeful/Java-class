package ch09_ArrayBasic;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        System.out.println("정렬 전: 3, 2, 1, 5, 4");
        int[] num = {3, 2, 1, 5, 4};

        for (int i = 0; i < num.length-1; i++) {
            for (int k = i+ 1; k < num.length; k++) {
                if (num[k] < num[i]) {
                    int temp = num[i];
                    num[i] = num[k];
                    num[k] = temp;
                }
            }
        }
                System.out.println("오름차순으로 배열 ");
            for (int i = 0; i < num.length - 1; i++) {
                System.out.print(num[i]+", ");
        }
        System.out.println(num[num.length- 1]);




        // temp
        int a = 10;
        int b = 20;
        a = b; // a = 20
        b = a; // b = 20

        int temp = a; // temp = 10
        a = b; // a = 20
        b = temp; // b = 10

    }




}
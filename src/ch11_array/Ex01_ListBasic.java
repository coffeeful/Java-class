package ch11_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_ListBasic {
    public static void main(String[] args) {
        //정수를 담는 intList 선언
        List<Integer> intList = new ArrayList<>();  //이 방법을 하는게 제일 추천
        //ArrayList<Integer> intList2 = new ArrayList<>();
        //List<Integer> intList3 = new List<>();

        //10 이라는 데이터 추가
        System.out.println(intList.add(10));
        System.out.println("intList.size() = " + intList.size());
        intList.add(10000);  // add로 추가 할수록 인덱스에 데이터가 순서대로 추가됨
        // 1번 인덱스에 999를 추가
        intList.add(1, 999);
        System.out.println("intList.size() = " + intList.size());
        // 0번 인덱스에 담긴 데이터 출력
        System.out.println("intList.get(0) = " + intList.get(0));
        System.out.println("intList.get(1) = " + intList.get(1));
        System.out.println("intList.get(2) = " + intList.get(2));
         //remove()
        intList.remove(1);
        System.out.println("intList.get(0) = " + intList.get(0));
        System.out.println("intList.get(1) = " + intList.get(1));
    //System.out.println("intList.get(2) = " + intList.get(2));
        // remove(index: 1); 를 지우면 2번 인덱스가 1번으로 당겨지고, 2번인덱스는 비워져있는상태인데
        // 출력을 하게 되면 범위를 벗어나서 에러가 뜬다.


        //String을 담는 strList 선언
        List<String> strList = new ArrayList<>();
        strList.add("안녕");
        strList.add(1, "hello");
        System.out.println("strList.get(0) =" + strList.get(0));
        System.out.println("strList.get(0) =" + strList.get(1));
        String str1 = strList.get(1);
        System.out.println("str1 = " + str1);

        //for each
        for (Integer a: intList) {     
            System.out.println("a = " + a); //많이쓰는 방식
        }
        
        intList.forEach(a -> {
                    System.out.println("a = " + a);
                }); // 이렇게도 문법 작성 가능. 스프링에서 많이 활용

        // for문을 이용하여 intList 에 담긴 데이터를 모두 출력

        for (int i = 1; i < intList.size(); i++) {
            System.out.println("intList = " + intList.get(i));

        }
            // for문을 이용하여 strList 에 담긴 데이터를 모두 출력
            for (int j = 1; j < strList.size(); j++) {
                System.out.println("strList = " + strList.get(j));
                
                // for each
                
            for (String p: strList){
                System.out.println("strList = " + strList);
            }

            }

    }
}

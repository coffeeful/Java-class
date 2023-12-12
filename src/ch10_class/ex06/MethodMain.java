package ch10_class.ex06;

public class MethodMain {
    public static void main(String[] args) {
    MethodEx methodEx = new MethodEx(); //method는 무조건 같은 타입으로 입력
        System.out.println("호출 전");
        // method1 호출
        methodEx.method1();
        System.out.println("호출 후");
        //method2 호출
        methodEx.method2("10 ");
        String str1 = "오늘은 화요일 ";
        methodEx.method2(str1); //직접 변수에 매개변수를 대입해서 사용 가능
        // method3 호출
       String result = methodEx.method3();
        System.out.println("result = " + result);
        System.out.println(methodEx.method3());
        //method4 호출 후 결과값 출력
    int Sum = methodEx.method4();
        System.out.println("Sum = " + Sum);
        System.out.println(methodEx.method4());

        //method5 호출
        String result2 = methodEx.method5("안녕", 1000);
        System.out.println("result2 = " + result2);

        int result3 = methodEx.method6(20,40);
        System.out.println("result3 = " + result3);
    }
}

package ch10_class.ex06;

public class MethodEx {

    public MethodEx(){

    }

    public MethodEx(String a){

    }

    //매개변수 x, 리턴 x
    public  void method1(){
        System.out.println("MethodEx.method1");
    }

    //매개변수 o, 리턴 x
    public void  method2(String param1){ //매개변수만 있을때는 void 형식
        System.out.println("param1 = " + param1);
        String str2 = "집에 가고 싶다";
        System.out.println(param1 + str2);
    }

    //매개변수 x, 리턴 o
    //리턴 String
    public String method3(){ //리턴만 있을때는 타입형으로 입력
        System.out.println("MethodEx.method3");
      //  return "부르셨나요?";
        String returnValue = "부르셨나요?";
        return returnValue;
    }
    // 리턴 int
    public int method4(){
        int num1= 10;
        int num2= 20;
        return num1 + num2;
    }

    // 매개변수 o, 리턴 o
    public String method5(String param1, int param2){ //매개변수가 있을때는 void 형식이지만 리턴도 같이 있음으로 타입형으로 입력

        System.out.println("param1 = " + param1 + ", param2 = " + param2);
        String result = "전달받은 값은 " + param1 +"과 " + param2 + " 입니다.";
        return result;
    }

    public int method6(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}

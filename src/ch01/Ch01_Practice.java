package ch01;

public class Ch01_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자 
		/**
		 * num1, num2 두개의 정수형 변수를 선언하고 값은 마음대로
		 * 두 변수의 +, -, /, % 연산결과를 print() 를 활용하여 출력해봅시다
		 * 출력방법
		 * System.out.println(num1 + num2)
		 */
		
		int num1 = 7, num2 =10;
		System.out.println(num1+ num2);
		System.out.println(num1- num2);
		System.out.println(num1* num2);
		System.out.println(num1/ num2);
		System.out.println(num1% num2);
		System.out.println("덧셈결과 :" + num1 + num2);
		System.out.println("덧셈결과 :" +(num1+ num2));
		
		int result = 0;
		int sumResult = num1 + num2;
		System.out.println(sumResult);
		int subResult = num1 - num2;
		System.out.println(subResult);
		int mulResult = num1 * num2;
		System.out.println(mulResult);
		int divResult = num1 / num2;
		System.out.println(divResult);
		int remainResult = num1 % num2;
		System.out.println(remainResult);
		
		

		
		
		
		

	}

}
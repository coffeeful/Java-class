package ch02;

public class Ch05_Practice {

	public static void main(String[] args) {
	
		//증감연산자
		int num1 =10, num2 = 0, num3 =0;
		System.out.println("num1 :" + num1 + " num2 :" + num2 +" num3 :" + num3);
		num2 = ++num1; // ++num: num 이 가지고 있는 값()에 1을 더해서 만든 뒤 계산에 활용함..
		System.out.println("num1 :" + num1 + " num2 :" + num2 +" num3 :" + num3);
		num2 = ++num1;
		num3 = num1++; // num++: num이 가지고 있는 값()을 계산에 활용하고 계산이 끝나면 num 값을 저장함.
		System.out.println("num1 :" + num1 + " num2 :" + num2 +" num3 :" + num3);
		
		int result1 = (num1++ + ++num2);
		System.out.println("num1 :" + num1 + " num2 :" + num2 +" num3 :" + num3);
		System.out.println(result1);
		
		
	}

}

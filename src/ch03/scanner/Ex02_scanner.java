package ch03.scanner;

import java.util.Scanner;

public class Ex02_scanner {

	public static void main(String[] args) {
		/**
		 * 정수 2개를 각각 스캐너로 num1, nu2에 입력 받아서 입력받은 수의 합을 출력하세요.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
//				int num1 = scanner.nextInt();
//				int num2 = scanner.nextInt();
//				int num3= (num1 + num2);
//				
//					
//		System.out.println( num1 + "과(와)" +  num2 +  "의 합은" +  num3  + "입니다");
	
		System.out.println("num1의 값:  "); int num1 = scanner.nextInt();
		System.out.println("num2의 값:  "); int num2 = scanner.nextInt();
		
	
		
		int sub = (num1 - num2);
		System.out.println(num1 + " 과(와)  " +  num2 + " 의 빼기는 " + sub + "입니다");

		
}

	
}
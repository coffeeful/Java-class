package ch04_if;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력 받아서
		 * 3의 배수인지, 5의 배수인지 또는 3과 5의 공배수 인지 아무것도 아닌지를 출력
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		int Number = scanner.nextInt();
		
		if(Number% 3 ==0){
			System.out.println("3의 배수");
		}else if(Number% 5 ==0){
			System.out.println("5의 배수");
		}else if(Number% 3==0 && Number%5 ==0) {
			System.out.println("3, 5의 공배수");
		}else {
			System.out.println("3,의 5의 배수가 아닙니다");	
		}
	}
}

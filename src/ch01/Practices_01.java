package ch01;

import java.util.Scanner;

public class Practices_01 {

	public static void main(String[] args) {
//		 본인의 이름(name), 나이(age), 키(height), 주소(address), 전화번호 (mobile)
//		를 입력할 수 있는 변수를 각각 선언해봅시다.
//		 변수 선언
//		 String; // x 타입만 주면 안됨
//		 name = "이름"; // x 변수이름만 주면 안됨
		
				String name = "이성현";
				int age = 32;
				double height = 182.7;
				String address = " 인천 부평구";
				String mobile = "010-1234-5678";

				//변수값을 출력

				System.out.println("저의 이름은 : " + name +  " 입니다.");
				System.out.println("저의 나이는 : " + age +  " 입니다.");
				System.out.println("저의 키는 : " + height +  " 입니다.");
				System.out.println("저의 사는곳은 : " + address +  " 입니다.");
				System.out.println("저의 핸드폰 번호는 : "+ mobile +  " 입니다.");


		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello World!");


	}

}

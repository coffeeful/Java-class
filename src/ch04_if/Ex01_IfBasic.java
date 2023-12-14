package ch04_if;

public class Ex01_IfBasic {

	public static void main(String[] args) {
		// if문
		
		System.out.println("if문 전");
		boolean cond = false;
		
		if(!cond) {
			System.out.println("조건을 만족하면 내가 보임");
		}
		System.out.println("if문 후");
		
		//if lese
		System.out.println("if else문 전");
		if (cond) {
			System.out.println("조건 만족");
			
		}else {
			System.out.println("조건 만족하지 않음");
			
		}
			System.out.println("if else문 후");
			
			int num1 =10, num2 =10;
			if (num1 < num2) { 
				System.out.println("num2가 크다");
			}else { //num1 >= num2
				System.out.println("num1이 num2보다 크거나 같다");
			}
			//if else if
			if (num1 > num2) {
				System.out.println("num1이 크다");
			} else if ( num1 < num2) {
				System.out.println("num2가 크다");
			} else if ( num1 == num2) {
				System.out.println("둘이 같다");
			} else {
				System.out.println("비교 불가");
			}
			
			
			
			
			// 조건문 if : 조건문이 참일 때만 실행
			// if(조건문){
			// 		실행문;
			//	}
			// else : 앞에 조건들이 모두 false일 때 실행
			int a = 10;
			if(a>=10){
				System.out.println("a가 10보다 크거나 같습니다");
			}else{
				System.out.println("a가 10보다 작습니다");
			}

			// else if : 바로 앞에 있는 조건이 false일 때만 실행
			// 크다, 같다, 작다
			if(a>10){
				System.out.println("크다");
			}else if(a==10){
				System.out.println("같다");
			}else{
				System.out.println("작다");
			}

			if(a>10){
				System.out.println("크다");
			}
			if(a==10){
				System.out.println("같다");
			}
			if(a<10){
				System.out.println("작다");
			}
		}
	}

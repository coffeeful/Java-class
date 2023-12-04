package ch04_if;

import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
		/**
		 *  중첩 if문을 적용한 학점 출력
		 *  100점을 초과하거나 0점 미만의 점수를 입력하면 ' 입력범위를 초과하였습니다.' 출력
		 *  0~100 점 사이의 값을 입력했다면 앞의 예제에서 했던 학점 출력을 진행함.
		 *  단, 각 조건마다 학점값을 출력하는 것이 아니라 학점 출력을 위한 print 문장은 한번만 사용
		 */
		
		int javaScore = 100;
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("점수를 입력하세요: ");
		 javaScore = scanner.nextInt();
		 String score= ("");
		 if(javaScore >100 || javaScore <0 ) {
			 System.out.println("입력범위를 초과하였습니다.");
		 }else {
			 //String score= ("");
			 if(javaScore >= 90) {
				  score= ("A");
			 }else if(javaScore >= 80) {
				 score= ("B");
			}else if(javaScore >= 70) {
				score= ("C");
			 }else if(javaScore >= 60) {
				 score= ("D");
			 }else {
				 score= ("F");
			}
			//System.out.print(score);
		 }
		 System.out.print(score);
		 
		 
	}
	

	}



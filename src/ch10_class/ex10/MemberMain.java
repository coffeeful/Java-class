package ch10_class.ex10;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
            /**
             * 메뉴
             * 1. 회원가입(기본생성자이용)
             *      회원가입 정보는 스캐너로 받음.
             * 2. 로그인
             * 3. 종료
             */


        Scanner scanner = new Scanner(System.in);


        //기본생성자

        Member member = new Member();
        member.setMemberName("이름");
        member.setMemberEmail("dltjdgus03@gmail.com");
        member.setMemberPassword("123456");
        member.setMemberMobile("010-1234-5678");




           int select = 0;
           boolean run = true;



       while (run){
           System.out.println("1. 회원가입 2. 로그인 3. 종료 ");
            select = scanner.nextInt();
           if(select==1){
               System.out.println("회원가입을 시작합니다.");
               System.out.print("이름을 입력하세요 : ");
               String memberName = scanner.next();
               System.out.print("비밀번호를 입력하세요 : ");
               String memberPassword = scanner.next();
               System.out.print("이메일을 입력하세요 : ");
               String memberEmail = scanner.next();
               System.out.print("전화번호를 입력하세요 : ");
               String memMobile = scanner.next();
               System.out.println("회원가입이 완료 되었습니다!");

              member.setMemberEmail(memberEmail);
              member.setMemberPassword(memberPassword);
              member.setMemberName(memberName);
              member.setMemberMobile(memMobile);

           } else if (select==2) {

               System.out.println("로그인을 하세요");
               System.out.print("이메일을 입력하세요 : ");
               String memberEmail = scanner.next();
               System.out.print("비밀번호를 입력하세요: ");
               String memberPassword = scanner.next();

              boolean result = member.memberLogin(memberEmail,memberPassword);
              if (result){
                  System.out.println("로그인에 성공하였습니다. ");
              } else {
                  System.out.println("로그인에 실패하였습니다. ");
              }
           }else if(select==3){
               System.out.println("종료합니다.");
               run = false;

           }
       }
    }
}

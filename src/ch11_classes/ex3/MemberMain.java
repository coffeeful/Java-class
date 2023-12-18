package ch11_classes.ex3;

import ch10_class.ex10.Member;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        // memberService 클래스 객체 선언
        MemberService memberService = new MemberService();

        //기본생성자
        Member member = new Member();
        member.setMemberName("이름");
        member.setMemberEmail("dltjdgus03@gmail.com");
        member.setMemberPassword("123456");
        member.setMemberMobile("010-1234-5678");

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.회원목록 | 3.로그인 | 4.정보수정 | 5.회원탈퇴 | 6.로그아웃 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                // 호출하는 문장 작성
                memberService.save();
            } else if (selectNo == 2) {
                // 호출하는 문장 작성
                memberService.findAll();
            } else if (selectNo == 3) {
                // 호출하는 문장 작성
                memberService.login();
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

                } else if (selectNo == 4) {
                    memberService.update();


                } else if (selectNo == 5) {
                    memberService.delete();
                
                } else if (selectNo == 6) {
                    memberService.logout();
                } else if (selectNo == 0) {
                    run = false;

            }
        }

    }
}
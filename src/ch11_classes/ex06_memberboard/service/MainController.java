package ch11_classes.ex06_memberboard.service;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        // memberService, boardService 클래스 객체 선언
        MemberService memberService = new MemberService();
        BoardService boardService = new BoardService();


        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.게시판메뉴 | 0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                // 호출하는 문장 작성
                memberService.save();
            } else if (selectNo == 2) {
                // 호출하는 문장 작성
                memberService.login();
            } else if (selectNo == 3) {
                // 호출하는 문장 작성
                memberService.findAll();
            } else if (selectNo == 4) {
                memberService.update();
            } else if (selectNo == 5) {
                memberService.delete();
            } else if (selectNo == 6) {
                memberService.logout();
            } else if (selectNo == 7) {

            } else if (selectNo == 0) {
                run = false;
            }
        }

    }


}

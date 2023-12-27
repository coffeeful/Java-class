package miniProject.service;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    MemberService memberService = new MemberService();
    PetService petService = new PetService();
        boolean run = true;
        int selectNo = 0;
        while (run) {
            System.out.println("========================================================================================");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.냥이메뉴 | 0.종료");
            System.out.println("========================================================================================");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                MemberService.save();
            } else if (selectNo == 2) {
                MemberService.login();
            } else if (selectNo == 3) {
                MemberService.findAll();
            } else if (selectNo == 4) {
                MemberService.update();
            } else if (selectNo == 5) {
                MemberService.delete();
            } else if (selectNo == 6) {
                MemberService.logout();
            } else if (selectNo == 7) {
                PetService.menu();
            } else if (selectNo == 0) {
                run = false;
            }
            System.out.println("====== 회원관리 ======");
        }

    }
}

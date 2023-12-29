package miniProject.service;


import miniProject.common.CommonVariables;

import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    MemberService memberService = new MemberService();
    BoardService boardService = new BoardService();
        boolean run = true;
        int selectNo = 0;
        while (run) {
            System.out.println("========================================================================================");
            System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.회원수정 | 5.회원탈퇴 | 6.로그아웃 | 7.냥이메뉴 | 0.종료");
            System.out.println("========================================================================================");
            System.out.print("선택> ");
            selectNo = scanner.nextInt();
            if (selectNo == 1) {
                memberService.save();
            } else if (selectNo == 2) {
                memberService.login();
            } else if (selectNo == 3) {
                memberService.findAll();
            } else if (selectNo == 4) {
                memberService.update();
            } else if (selectNo == 5) {
                memberService.delete();
            } else if (selectNo == 6) {
                memberService.logout();
            } else if (selectNo == 7) {
              boolean catRun = true;
              while (catRun) {
                  if (CommonVariables.loginEmail != null) {
                      System.out.println("=============== 냥이 다이어리 ===============");
                      System.out.println("-----------------------------------------------------------------------------------------------");
                      System.out.println("1.우리냥이 프로필 | 2. 냥이 일기 | 3. 일기 모아보기  | 4. 냥이 일기조회 | 5. 냥이 일기수정 | 6. 냥이 일기삭제 | 0. 메인메뉴" );
                      System.out.println("-----------------------------------------------------------------------------------------------");
                      System.out.print("선택> ");
                      selectNo = scanner.nextInt();
                      if (selectNo == 1) {
                          BoardService.save();
                      } else if (selectNo == 2) {
                          BoardService.diary();
                      } else if (selectNo == 3) {
                          BoardService.findAll();
                      } else if (selectNo == 4) {
                          BoardService.findById();
                      } else if (selectNo == 5) {
                          BoardService.update();
                      } else if (selectNo == 6) {
                          BoardService.delete();
                      } else if (selectNo == 0) {
                          catRun = false;
                      }else {
                          System.out.println("다시입력");
                      }
                      System.out.println();
                  } else {
                      System.out.println("회원전용 메뉴입니다.");
                      catRun = false;
                  }
              }
            } else if (selectNo == 0) {
                run = false;
            }
            System.out.println("====== 회원관리 ======");
        }

    }
}

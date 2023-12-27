package ch12_classes.ex04;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int selectNo = 0;
        // boardService 클래스 객체 선언
        BoardService boardService = new BoardService();

        while (run) {
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 |  0.종료");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = scan.nextInt();
            if (selectNo == 1) {
                // 호출하는 문장 작성
                boardService.save();
            } else if (selectNo == 2) {
                // 호출하는 문장 작성
                boardService.findAll();
            } else if (selectNo == 3) {
                // 호출하는 문장 작성
                boardService.findById();
            } else if (selectNo == 4) {
                // 호출하는 문장 작성
                boardService.update();
            } else if (selectNo == 5) {
                // 호출하는 문장 작성
                boardService.delete();
            } else if (selectNo == 6) {
                // 호출하는 문장 작성
                boardService.search();
            } else if (selectNo == 0) {
                run = false;


            }
        }
    }
}
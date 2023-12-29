package miniProject.service;



import miniProject.common.CommonVariables;
import miniProject.dto.BoardDTO;

import miniProject.dto.CommentDTO;
import miniProject.repository.BoardRepository;
import miniProject.repository.CommentRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    static Scanner scanner = new Scanner(System.in);
    static BoardRepository boardRepository = new BoardRepository();
    static CommentRepository commentRepository = new CommentRepository();

    public static void save() {
        System.out.println("우리냥이 프로필");
        System.out.print("종류: ");
        String catBreed = scanner.next();
        System.out.print("이름: ");
        String catName = scanner.next();
        System.out.print("나이: ");
        String catAge = scanner.next();
        System.out.print("성별: ");
        String catSex = scanner.next();
        BoardDTO boardDTO = new BoardDTO(catBreed, catName, catAge, catSex,"","","");
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("냥이 프로필 작성완료!");
        }else {
            System.out.println("냥이 프로필 작성실패!");
        }
    }

    public static void diary(){
        System.out.println("냥이 일기");
        System.out.print("제목: ");
        String catTitle = scanner.next();
        System.out.print("내용: ");
        String catContents = scanner.next();
        BoardDTO boardDTO = new BoardDTO(CommonVariables.loginEmail, catTitle, catContents);
        boolean result = boardRepository.diary(boardDTO);
        if (result){
            System.out.println("작성 완료!");
        }else {
            System.out.println("작성 실패!");
        }
    }
    public static void findAll(){
        List<BoardDTO> boardDTOList = boardRepository.findAll();
        listPrint(boardDTOList);
    }
    private static void listPrint(List<BoardDTO> boardDTOList){
       for (BoardDTO boardDTO: boardDTOList) {
           System.out.println(boardDTO.getCatTitle() + "\t" + boardDTO.getCatContents() + "\t" );
       }
    }
    public static void findById() {
        System.out.print("조회 일기 id: ");
        Long id = scanner.nextLong();
        boolean result = true;
        if (result){
            BoardDTO boardDTO = boardRepository.findById(id);
            List<CommentDTO> commentDTOList = commentRepository.findAll(id);
            System.out.println("boardDTO = " + boardDTO);
            System.out.println("======== 댓글 ========");
            if (commentDTOList.size() >0) {
                for (CommentDTO commentDTO: commentDTOList) {
                    System.out.println("작성댓글 = " + commentDTO);
                }
            }else {
            System.out.println("작성된 댓글이 없습니다.");
            }System.out.println("댓글을 작성하시려면 1번을 입력해주세요.");
            System.out.println("메인메뉴로 돌아가려면 2번을 입력해주세요.");
            System.out.print("입력> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.print("댓글 내용: ");
                String commentContents = scanner.next();
                String commentWriter = "작성자 id: ";
                CommentDTO commentDTO = new CommentDTO(id, commentWriter, commentContents);
                boolean commentResult = commentRepository.save(commentDTO);
                if (commentResult) {
                    System.out.println("댓글작성 성공");
                } else {
                    System.out.println("댓글작성 실패");
                }
            } else if (selectNo == 2) {
                System.out.println("메인 메뉴로 돌아갑니다.");
            }
        } else {
            System.out.println("요청하신 게시글은 존재하지 않습니다!");
        }
        }

    public static void update() {
        System.out.print("수정 id: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null&& CommonVariables.loginEmail.equals(boardDTO.getCatWirther())) {
            System.out.print("수정 제목: ");
            String catTitle = scanner.next();
            System.out.print("수정 내용: ");
            String catContents = scanner.next();
            boolean result = boardRepository.update(id, catTitle, catContents);
            if (result) {
                System.out.println("수정 완료!");
            } else {
                System.out.println("수정 실패!");
            }
        } else if (!CommonVariables.loginEmail.equals(boardDTO.getCatWirther())){
            System.out.println("작성자만 수정 가능합니다.");
        } else if (boardDTO ==null) {
            System.out.println("요청하신 일기는 존재하지 않습니다!");
        }
    }
    public static void delete() {
        System.out.print("삭제할 id: ");
        Long id = scanner.nextLong();
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null){
            boolean result = boardRepository.delete(id);
            if (result) {
                System.out.println("삭제 완료!");
            }else {
                System.out.println("삭제 실패!");
            }
        }
    }
}

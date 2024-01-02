package miniProject.service;



import miniProject.common.CommonVariables;
import miniProject.dto.BoardDTO;

import miniProject.dto.CommentDTO;
import miniProject.repository.BoardRepository;
import miniProject.repository.CommentRepository;

import java.util.List;
import java.util.Scanner;

import static miniProject.repository.BoardRepository.canModifyBoard;

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
        System.out.print("조회할 일기의 id를 입력하세요: ");
        Long id = scanner.nextLong();

        // 해당 id에 해당하는 게시글 조회
        BoardDTO boardDTO = boardRepository.findById(id);

        if (boardDTO != null) {
            // 조회된 게시글이 있는 경우
            System.out.println("boardDTO = " + boardDTO);

            // 해당 id에 해당하는 댓글 목록 조회
            List<CommentDTO> commentDTOList = commentRepository.findAll(id);
            System.out.println("======== 댓글 ========");

            if (!commentDTOList.isEmpty()) {
                // 댓글이 있는 경우 출력
                for (CommentDTO commentDTO : commentDTOList) {
                    System.out.println("작성댓글 = " + commentDTO);
                }
            } else {
                // 댓글이 없는 경우 메시지 출력
                System.out.println("작성된 댓글이 없습니다.");
            }

            // 댓글을 작성할지 메인 메뉴로 돌아갈지 선택
            System.out.println("댓글을 작성하시려면 1번을 입력해주세요.");
            System.out.println("메인메뉴로 돌아가려면 2번을 입력해주세요.");
            System.out.print("입력> ");
            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                // 댓글 작성
                System.out.print("댓글 내용: ");
                String commentContents = scanner.next();
                String commentWriter = "작성자 id: ";  // 실제 사용자 정보에 따라 동적으로 설정
                CommentDTO commentDTO = new CommentDTO(id, commentWriter, commentContents);
                boolean commentResult = commentRepository.save(commentDTO);

                if (commentResult) {
                    System.out.println("댓글 작성 성공");
                } else {
                    System.out.println("댓글 작성 실패");
                }
            } else if (selectNo == 2) {
                // 메인 메뉴로 돌아가기
                System.out.println("메인 메뉴로 돌아갑니다.");
            } else {
                // 잘못된 선택일 경우 메시지 출력
                System.out.println("잘못된 선택입니다.");
            }
        } else {
            // 해당 id에 해당하는 게시글이 없는 경우
            System.out.println("요청하신 일기는 존재하지 않습니다!");
        }
    }

    public static void update() {
        System.out.print("수정할 일기의 id를 입력하세요: ");
        Long id = scanner.nextLong();

        // 입력한 id에 해당하는 게시글을 데이터베이스에서 조회
        BoardDTO boardDTO = boardRepository.findById(id);

        if (canModifyBoard(boardDTO)) {
            System.out.print("수정 제목: ");
            String catTitle = scanner.next();
            System.out.print("수정 내용: ");
            String catContents = scanner.next();

            // 게시글을 수정하고 그 결과에 따라 메시지 출력
            if (boardRepository.update(id, catTitle, catContents)) {
                System.out.println("수정 완료!");
            } else {
                System.out.println("수정 실패!");
            }
        }
    }

    // 게시글 수정 권한이 있는지 확인하는 메서드
    private static boolean canModifyBoard(BoardDTO boardDTO) {
        if (boardDTO == null) {
            // 조회된 게시글이 존재하지 않는 경우
            System.out.println("요청하신 일기는 존재하지 않습니다!");
            return false;
        }

        if (!CommonVariables.loginEmail.equals(boardDTO.getCatWirther())) {
            // 로그인한 사용자가 해당 게시글의 작성자가 아닌 경우
            System.out.println("작성자만 수정 가능합니다.");
            return false;
        }

        return true;
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

package ch11_classes.ex06_memberboard.service;

import ch11_classes.ex06_memberboard.common.CommonVariables;
import ch11_classes.ex06_memberboard.dto.BoardDTO;
import ch11_classes.ex06_memberboard.repository.BoardRepository;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    Scanner scanner = new Scanner(System.in);
    BoardRepository boardRepository = new BoardRepository();

    public void menu() {
        boolean run = true;
        int selectNo = 0;
        if (CommonVariables.loginEmail != null) {
            while (run) {

                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println("1.글작성 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.검색 | 99.sample | 0.메인메뉴");
                System.out.println("-----------------------------------------------------------------------------------------");
                System.out.print("선택> ");
                selectNo = scanner.nextInt();
                if (selectNo == 1) {
                    System.out.print("글 제목: ");
                    String boardTitle = scanner.next();
                    String boardWriter = CommonVariables.loginEmail;
                    System.out.print("작성자: " + boardWriter + "   " + "내용: ");

                    String boardContents = scanner.next();
                    BoardDTO boardDTO = new BoardDTO(boardTitle, boardWriter, boardContents);
                    boolean result = boardRepository.write(boardDTO);
                    if (result) {
                        System.out.println("글등록 성공!");
                    } else {
                        System.out.println("글등록 실패!");
                    }
                } else if (selectNo == 2) {
                    List<BoardDTO> boardDTOList = boardRepository.findAll();
                    listprint(boardDTOList);
                } else if (selectNo == 3) {
                    System.out.print("글조회 id: ");
                    Long id = scanner.nextLong();
                    BoardDTO boardDTO = boardRepository.findById(id);
                    if (boardDTO != null) {
                        boardDTO.plusHits();
                        System.out.println("boardDTO = " + boardDTO);
                    } else {
                        System.out.println("해당하는 글의 정보를 찾을수 없습니다.");
                    }
                } else if (selectNo == 4) {
                    System.out.print("수정할 id: ");
                    Long id = scanner.nextLong();
                    if (CommonVariables.loginEmail != null && id.equals(boardRepository.findById(id).getId())) {
                        System.out.print("수정 제목: ");
                        String boardTitle = scanner.next();
                        System.out.print("수정 내용: ");
                        String boardContents = scanner.next();
                        boolean result = boardRepository.update(id, boardTitle, boardContents);
                        if (result) {
                            System.out.println("글 수정 성공!");
                        } else {
                            System.out.println("본인 글이 아니면 수정 할 수 없습니다.");
                        }
                    }
                } else if (selectNo == 5) {
                    System.out.print("삭제할 id: ");
                    Long id = scanner.nextLong();
                    int sel = 0;
                    String boardWriter = CommonVariables.loginEmail;
                    if (boardWriter != null) {
                        System.out.println("정말 삭제 하시겠습니까?");
                        System.out.println("1.예  |  2.아니오");
                        sel = scanner.nextInt();
                        if (sel == 1) {
                            System.out.println("삭제되었습니다.");
                            boardRepository.delete(id);
                        } else if (sel == 2) {
                            System.out.println("메인메뉴로 돌아갑니다.");
                        }
                        }
                    } else if (selectNo == 6) {
                    System.out.print("검색어: ");
                    String bookTitle = scanner.next();
                    List<BoardDTO> boardDTOList = boardRepository.search(bookTitle);
                    if (boardDTOList.size() > 0) {
                        System.out.println("검색 결과");
                        listprint(boardDTOList);
                    }else {
                        System.out.println("검색 결과가 없습니다!");
                    }
                    } else if (selectNo == 7) {

                    } else if (selectNo == 0) {
                        run = false;
                    } else {
                        System.out.println("로그인을 먼저 해주세요!");
                    }
                        System.out.println("====== 게시판 ======");
                }
            }
        }
        private void listprint (List < BoardDTO > boardDTOList) {
            for (BoardDTO boardDTO : boardDTOList) {
                System.out.println("글번호: " + boardDTO.getId() + "\t" + "글제목: " + boardDTO.getBoardTitle() + "\t" + "글내용: "
                        + boardDTO.getBoardContents() +
                        "\t" + "조회수: " + boardDTO.getBoardHits() + "\t" + "날짜,시간: " + boardDTO.getCreatedAt());
            }

        }
    }

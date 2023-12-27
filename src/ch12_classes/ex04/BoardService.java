package ch12_classes.ex04;

import java.util.List;
import java.util.Scanner;

public class BoardService {
    BoardRepository boardRepository = new BoardRepository();
    Scanner scanner = new Scanner(System.in);

    /**
     * - 글작성
     * - 제목(boardTitle), 작성자(boardWriter), 내용(boardContents), 비밀번호(boardPass)입력 받음
     * - 비밀번호는 글수정, 삭제 시 활용
     * - 글번호(id)는 자동으로 증가
     * - 글목록
     * - 전체 글목록 출력
     * - 목록 출력시 글번호, 제목, 작성자, 조회수 값만 출력됨
     * - 글조회
     * - 목록에서 게시글 번호를 입력하면 해당 글의 상세 내용을 보여줌
     * - 상세 내용 출력 이전에 해당 게시글의 조회수 값을 1 증가시켜줘야 함.
     * - 글수정
     * - 수정할 글번호를 입력 받고 비밀번호도 입력 받아서 비밀번호가 일치하면 수정할 제목, 내용을 입력받고 수정 처리.
     * - 비밀번호가 틀리면 틀렸다는 메시지 출력
     * - 글삭제
     * - 수정할 글번호를 입력 받고 비밀번호도 입력 받아서 비밀번호가 일치하면 글삭제 처리
     * - 비밀번호가 틀리면 틀렸다는 메시지 출력
     * - 검색
     * - 제목으로만 검색가능
     * - 입력한 검색어가 포함된 결과를 목록으로 출력
     *
     * Refactoring(리펙터링)
     */

    public void save() {

        System.out.print("제목을 입력해주세요: ");
        String boardTite = scanner.next();
        System.out.print("작성자를 입력해주세요: ");
        String boardWriter = scanner.next();
        System.out.print("내용을 입력해주세요: ");
        String boardContents = scanner.next();
        System.out.print("비밀번호를 입력해주세요: ");
        String boardPass = scanner.next();

        BoardDTO boardDTO = new BoardDTO(boardTite, boardWriter, boardContents, boardPass);
        boolean result = boardRepository.save(boardDTO);
        if (result) {
            System.out.println("글등록 성공!");
        } else {
            System.out.println("글등록 실패!");
        }
    }

    public void findAll() {
        List<BoardDTO> boardDTOList = boardRepository.findAll();
      listprint(boardDTOList);
    }

    public void findById() {
        System.out.print("글조회 id: ");
        Long id = scanner.nextLong();
        //1. 조회수를 1 증가

        //2. 상세내용 가져옴
        BoardDTO boardDTO = boardRepository.findById(id);
        if (boardDTO != null) {
            System.out.println("boardDTO = " + boardDTO);
            boardDTO.setBoardHits();

        } else {
            System.out.println("해당하는 글의 정보를 찾을수 없습니다.");
        }
    }

    public void update() {
        System.out.print("수정할 id: ");
        Long id = scanner.nextLong();
        System.out.print("비밀번호 입력: ");
        String boardPass = scanner.next();
        BoardDTO boardDTO = boardRepository.findById(id);

        if (!boardDTO.getBoardPass().equals(boardPass)) {
            System.out.println("비밀번호가 일치하지 않습니다");
        } else {
            if (boardDTO != null) {


                if (boardPass.equals(boardDTO.getBoardPass())) {
                    System.out.print("새로운 제목: ");
                    String boardTitle = scanner.next();
                    System.out.print("새로운 내용: ");
                    String boardContents = scanner.next();
                    boolean updateResult = boardRepository.update(id, boardTitle, boardContents);

                    if (updateResult) {
                        System.out.println("수정 성공!");
                    } else {
                        System.out.println("수정 실패");
                    }

                } else {
                    System.out.println("해당하는 글의 정보를 찾을수 없습니다.");
                }
            }
        }
    }
        public void delete () {
            System.out.print("삭제할 id: ");
            Long id = scanner.nextLong();
            System.out.print("비밀번호: ");
            String boardPass = scanner.next();
            BoardDTO boardDTO = boardRepository.findById(id);
                if (boardDTO != null) {
                    if (boardPass.equals(boardDTO.getBoardPass())) {
                        boolean reslut = boardRepository.delete(id);
                        if (reslut) {
                            System.out.println("삭제 성공");
                        } else {
                            System.out.println("삭제 실패");
                        }
                    } else {
                        System.out.println("비밀번호가 일치하지 않습니다.");
                    }
                }else{
                    System.out.println("해당 게시글이 존재하지않습니다.");
                }
            }
        public void search () {
            System.out.print("검색어: ");
            String bookTitle = scanner.next();
            List<BoardDTO> boardDTOList = boardRepository.search(bookTitle);
            if (boardDTOList.size() > 0) {
                System.out.println("검색 결과");
                //출력 전용 메서드로 검색결과 리스트를 넘겨줌
                listprint(boardDTOList);
            } else {
                System.out.println("검색 결과가 없습니다!");
        }
    }
    //목록 출력 전용 메서드
    // findAA, search 메서드로 부터 list 데이터를 전달 받아서 출력을 하는 메서드
    private void listprint(List<BoardDTO>boardDTOList){
        for (BoardDTO boardDTO : boardDTOList) {
            System.out.println("글번호: " +boardDTO.getId()+ "\t" + "글제목: " + boardDTO.getBoardTitle()+ "\t" + "글내용: "
                    + boardDTO.getBoardContents()+
                    "\t" + "조회수: " + boardDTO.getBoardHits() +"\t" + "날짜,시간: " + boardDTO.getCreatedAt());
        }
    }
}

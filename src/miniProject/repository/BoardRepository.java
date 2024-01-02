package miniProject.repository;

import miniProject.dto.BoardDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardRepository {
    private static List<BoardDTO> boardDTOList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public boolean save(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public List<BoardDTO> findAll() {
        return boardDTOList;
    }

    public boolean diary(BoardDTO boardDTO) {
        return boardDTOList.add(boardDTO);
    }

    public BoardDTO findById(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                return boardDTOList.get(i);
            }
        }
        return null;
    }

    public boolean update(Long id, String catTitle, String catContents) {
        for (BoardDTO boardDTO : boardDTOList) {
            if (id.equals(boardDTO.getId())) {
                boardDTO.setCatTitle(catTitle);
                boardDTO.setCatContents(catContents);
                return true;
            }
        }
        return false;
    }

    public boolean delete(Long id) {
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())) {
                boardDTOList.remove(i);
                return true;
            }
        }
        return false;
    }

    public static boolean canModifyBoard(BoardDTO boardDTO, String catWirther) {
        // 게시글이 존재하지 않거나 현재 로그인한 사용자가 해당 게시글의 작성자인 경우에만 수정 가능
        return boardDTO != null && catWirther.equals(boardDTO.getCatWirther());
    }
}


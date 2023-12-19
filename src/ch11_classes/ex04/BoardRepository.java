package ch11_classes.ex04;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {

    public static List<BoardDTO> boardDTOList =new ArrayList<>();
    public  boolean save(BoardDTO boardDTO){
        boolean result = boardDTOList.add(boardDTO);
        return result;
    }

    public  List<BoardDTO> findAll(){
        return boardDTOList;
    }

    public BoardDTO findById(Long id){
        BoardDTO boardDTO = null;
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())){
                boardDTO =boardDTOList.get(i);

            }

        }   return boardDTO;

    }

    public boolean update(Long id, String boardTitle, String boardContents){
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (id.equals(boardDTOList.get(i).getId())){
               boardDTOList.get(i).setBoardTitle(boardTitle);
               boardDTOList.get(i).setBoardContents(boardContents);
               return true;

            }
        }       return false;
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
    public List<BoardDTO> search(String bookTitle){
        List<BoardDTO> boardDTOS = new ArrayList<>();
        for (int i = 0; i < boardDTOList.size(); i++) {
            if (boardDTOList.get(i).getBoardTitle().contains(bookTitle)){
                BoardDTO boardDTO = boardDTOList.get(i);
                boardDTOS.add(boardDTOList.get(i));
            }
        }
            return boardDTOS;
    }

}

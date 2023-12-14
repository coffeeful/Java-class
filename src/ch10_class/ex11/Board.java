package ch10_class.ex11;

/**
 게시글 클래스
 필드
 글번호(id) - Long 타입
 제목(boardTitle)
 작성자(boardWriter)
 내용(boardContents)
 조회수(boardHits)
 필드에 대한 getter/setter
 생성자 2가지
 toString method
 글조회 method
 name: findById
 parameter: id
 return: x
 실행내용
 main으로부터 글번호를 전달받고 글번호가 일치하면 해당 게시글의 내용을
 print로 출력해준다.
 단 출력하기 전에 조회수 값을 1 증가 시켜야 한다.
 */

public class Board {

    private Long id; //클래스타입의 Long을 사용해서 null 값으로 준다
    private String boardTitle;
    private String boardWirter;
    private String boardContents;
    private int boardHits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBoardTitle() {
        return boardTitle;
    }

    public void setBoardTitle(String boardTitle) {
        this.boardTitle = boardTitle;
    }

    public String getBoardWirter() {
        return boardWirter;
    }

    public void setBoardWirter(String boardWirter) {
        this.boardWirter = boardWirter;
    }

    public String getBoardContents() {
        return boardContents;
    }

    public void setBoardContents(String boardContents) {
        this.boardContents = boardContents;
    }

    public int getBoardHits() {
        return boardHits;
    }

    public void setBoardHits(int boardHits) {
        this.boardHits = boardHits;
    }

    //기본생성자
public Board(){

}


// hits는 기본값을 0으로 하면 되기때문에 생성자에서 제외
public Board(Long id, String boardTitle, String boardWriter, String boardContents){
        this.id = id;
        this.boardTitle = boardTitle;
        this.boardWirter = boardWriter;
        this.boardContents = boardContents;
}





@Override //이렇게 작성된 toString 메서드는 Board
    //클래스의 객체를 문자열로 표현할 때 해당 객체의 필드들의 값을 포함하는 형태로 문자열을 반환
    //예를 들어, System.out.println(Board)를 호출하면
// Board 객체의 toString 메서드가 호출되어 해당 객체의 정보를 출력
public String toString() {
    return "Board{" +
            "id=" + id +
            ", boardTitle='" + boardTitle + '\'' +
            ", boardWirter='" + boardWirter + '\'' +
            ", boardContents='" + boardContents + '\'' +
            ", boardHits=" + boardHits +
            '}';
    }
public void findByid(Long searchId) {
    if (this.id.equals(searchId)) {
        this.boardHits++;
        System.out.println("글번호: " + this.id);
        System.out.println("제목: " + this.boardTitle);
        System.out.println("작성자: " + this.boardWirter);
        System.out.println("내용: " + this.boardContents);
        System.out.println("조회수: " + this.boardHits);
    } else {
        System.out.println("없는 글번호 입니다. ");
    }


}
}



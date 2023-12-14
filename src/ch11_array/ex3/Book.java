package ch11_array.ex3;

public class Book {
    /**
     책 클래스
     필드
     책관리번호(id) - Long 타입
     책제목(bookTitle)
     저자(bookAuthor)
     가격(bookPrice)
     출판사(bookPublisher)
     필드에 대한 getter/setter
     생성자 2가지
     toString method
     */

    private Long id;
    private String booktitle;
    private String bookAuthor;
    private int bookPrice;
    private String bookPublisher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    private static Long idvalue = 1L;
    // static 은 값을 유지할수 있는 장점이 있다.
    //다만 static 영역은 메모리가 작아서 무분별하게 사용하면 안된다.

   public Book(){
       this.id = idvalue++; // ++이 뒤에 붙어있으면 값을 넘기고 거기에 1을 더한다

   }
   public Book(String booktitle, String bookAuthor, int bookPrice, String bookPublisher){
        this.id = idvalue++;
        this.booktitle = booktitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.bookPublisher = bookPublisher;

   }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", booktitle='" + booktitle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPrice=" + bookPrice +
                ", bookPublisher='" + bookPublisher + '\'' +
                '}';
    }
}


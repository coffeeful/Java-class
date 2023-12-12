package ch10_class.ex8;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
       // book.bookTitle = "책 제목1";

        book.setBookTitle("책 제목1"); //둘중 원하는 방식 한가지로 출력
        String tilte =book.getBookTitle();
        System.out.println("tilte = " + tilte);

        System.out.println(book.getBookTitle());

        book.setBookAuthor("저자1");
        System.out.println(book.getBookAuthor());


    }
}

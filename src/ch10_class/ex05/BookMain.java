package ch10_class.ex05;

import java.util.Arrays;

public class BookMain {
    public static void main(String[] args) {
        // 기본생성자로 객체 만들고 필드값 채우기
        Book book = new Book();
        book.bookTitle = "제목: ";
        book.bookAuthor = "저자: ";
        book.bookPublisher = "출판사: ";
        book.isbn = "고유번호: ";
        book.bookPrice = 0;
        //매개변수 2개 있는 생성자로 객체 만들고 필드값 채우기
        Book book1 = new Book("노는게 제일좋아", "이성현");
        book1.bookPublisher = "워후워어";
        book1.isbn = "585858";
        book1.bookPrice = 50000;

        // 모든 매개변수 있는 생성자로 객체 만들고 필드값 채우기
        Book book2 = new Book("노는게 제일좋아", "이성현", "인천일보", "isbn", 500);

    }
}
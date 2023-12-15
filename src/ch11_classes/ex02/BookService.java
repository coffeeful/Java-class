package ch11_classes.ex02;

import java.util.List;
import java.util.Scanner;

public class BookService {
    BookRepository bookRepository = new BookRepository();
    Scanner scanner = new  Scanner(System.in);

    /**
     * 도서등록 메서드
     * name: save
     * parameter: x
     * return: x
     * 실행내용
     *      스캐너로 도서명, 저자, 가격, 출판사정보를 입력받고
     *      BookDTO 객체에 담아서 Repository로 전달하여 저장이 되도록 함
     *      등록 여부를 출력한다.(등록성공 or 등록실패)
     */

public void save(){


    System.out.print("도서명을 입력해주세요: ");
    String bookName = scanner.next();
    System.out.print("저자를 입력해주세요: ");
    String bookAuthor = scanner.next();
    System.out.print("가격을 입력하세요: ");
    int bookPrice = scanner.nextInt();
    System.out.print("출판사를 입력하세요: ");
    String bookPublisher = scanner.next();

    BookDTO bookDTO = new BookDTO(bookName, bookAuthor, bookPrice, bookPublisher);
    boolean result = bookRepository.save(bookDTO); //객체이름으로 해야한다. 클래스 이름 X
    if(result){
        System.out.println("도서등록 성공");
    }else {
        System.out.println("도서등록 실패");
    }



}
    /**
     * 도서목록 메서드
     * name: findAll
     * parameter: x
     * return: x
     * 실행내용
     *      Repository로 부터 목록을 리턴 받아서 목록에 있는 모든 정보를 출력
     */

    public  void findAll(){
        List<BookDTO> bookDTOList = bookRepository.findAll();
        for (BookDTO bookDTO: bookDTOList){
            System.out.println("bookDTO = " + bookDTO);
        }

    }

    /**
     * 도서조회 메서드
     * name: findById
     * parameter: x
     * return: x
     * 실행내용
     *      id를 입력받고 Repository로 부터 id에 해당 하는 도서 정보를 출력
     *      없으면 없다고 출력
     */
    public void findById(){
        System.out.print("도서조회 id: ");
        Long id = scanner.nextLong();
        BookDTO bookDTO = bookRepository.findById(id);
        if ( bookDTO != null){
            System.out.println("bookDTO = " + bookDTO);
        }else {
            System.out.println("해당하는 도서 정보를 찾을수 없습니다.");
        }


    }

    /**
     * 도서조회 메서드
     * name: findByTitle
     * parameter: x
     * return: x
     * 실행내용
     *      도서제목을 입력받고 Repository로 부터 해당 하는 도서 정보를 출력(제목이 정확히 일치하는 것만)
     *      없으면 없다고 출력
     */
    public void findByTitle(){
        System.out.println("도서조회 제목: ");
        String bookTitle = scanner.next();
        BookDTO bookDTO = bookRepository.findByTitle(bookTitle);
    }
    public void search(){
        System.out.println("검색어: ");
        String bookTitle = scanner.next();
        List<BookDTO> bookDTOList = bookRepository.search(bookTitle);
        if (bookDTOList.size() > 0) {
            for (BookDTO bookDTO: bookDTOList) {
                System.out.println("bookDTO = " + bookDTO);
            }
        } else{
            System.out.println("검색 결과가 없습니다!");
            // bookDTOList.size() == 0 -> 결과가 없다.
        }
    }
}

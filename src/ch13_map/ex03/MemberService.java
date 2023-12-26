package ch13_map.ex03;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();
    Map<String, MemberDTO> memberDTOMap = new HashMap<>();
    public void save() {
        // 중복체크 결과를 담을 변수
        boolean checkResult = false;
        checkResult = memberRepository.emailCheck(memberEmail);
        System.out.println("회원가입을 시작합니다.");
        do {
            System.out.print("이메일을 입력하세요 : ");
            memberEmail = scanner.next();
            // checkResult가 true  -> 사용가능(반복문 종료), checkResult가 false -> 사용불가( 다시 이메일 입력)
            checkResult = memberRepository.emailCheck(memberEmail);
            if (checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            }else {
                System.out.println("이미 사용중인 이메일 입니다. 다른 이메일을 입력해주세요.");
            }
        }while (!checkResult); // checkResult 값이 false라면 계속 반복되도록

        System.out.print("비밀번호를 입력하세요 : ");
        String memberPassword = scanner.next();
        System.out.print("이름을 입력하세요 : ");
        String memberName = scanner.next();
        System.out.print("전화번호를 입력하세요 : ");
        String memMobile = scanner.next();
        System.out.println("회원가입이 완료 되었습니다!");
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPassword, memberName, memMobile);
        boolean result = memberRepository.save(memberDTO);
        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }
    public void findAll() {
        Map<String, MemberDTO> memberDTOMap = memberRepository.findAll();
        for (String i: memberDTOMap.keySet()) {
            System.out.println(memberDTOMap.get(i));
        }

    }
    public void findById() {
        System.out.println("회원 id: ");
        Long id = scanner.nextLong();
        MemberDTO memberDTO = memberRepository.findById(id);
        if (memberDTO != null) {
            System.out.println("memberDTO = " + memberDTO);
        }else {
            System.out.println("조회결과가 없습니다!");
        }
    }
public void login() {
    System.out.print("이메일: ");
    String memberEmail = scanner.next();
    System.out.print("비밀번호: ");
    String memberPassword = scanner.next();
    MemberDTO loginResult = memberDTOMap.get(memberEmail);

}


}

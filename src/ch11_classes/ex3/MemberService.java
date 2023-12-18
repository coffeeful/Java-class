package ch11_classes.ex3;

import java.util.List;
import java.util.Scanner;

public class MemberService {
    Scanner scanner = new Scanner(System.in);
    MemberRepository memberRepository = new MemberRepository();
    public static String loginEmail = null;
    public void member() {

    }

    public void save() {
        // 중복체크 결과를 담을 변수
        boolean checkResult = false;
        String memberEmail = null;
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

    /**
     * 회원목록 메서드
     * name : findAll
     * parameter : x
     * return : x
     */
    public void findAll() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for (MemberDTO memberDTO : memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }

    public void login() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        MemberDTO loginResult = memberRepository.login(memberEmail, memberPassword);
        if (loginResult != null) {
            System.out.println("로그인 성공");
            System.out.println(memberEmail + "님 환영합니다 !");
            loginEmail = memberEmail;
        } else {
            System.out.println("이메일 또는 비밀번호가 틀립니다!");
        }
    }

    public void update() {
        if (loginEmail != null) {
            System.out.print("수정할 전화번호: ");
            String mobile = scanner.next();
            boolean result = memberRepository.update(loginEmail, mobile);
            if (result) {
                System.out.println("회원정보가 수정되었습니다");
            } else {
                System.out.println("수정 실패!");
            }
        } else {
            System.out.println("로그인 해주세요!");
        }
    }

    public void delete() {
        if (loginEmail != null) {
            System.out.println("정말 탈퇴하시겠습니까?");
            System.out.print("비밀번호: ");
            String memberPassword = scanner.next();
            MemberDTO memberDTO = memberRepository.login(loginEmail, memberPassword);
                if (memberDTO != null) {
                    boolean result = memberRepository.delete(loginEmail);
                    if (result) {
                        System.out.println("회원탈퇴가 정상적으로 처리되었습니다! 그동안 감사했습니다");
                    } else {
                        System.out.println("탈퇴가 처리되지 않았습니다! 다시 시도해주시길 바랍니다.");
                    }
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다! 전단계로 돌아갑니다.");
                }
            }else{
                System.out.println("로그인 해주세요!");
            }
        }

    public void logout() {
        loginEmail = null;
        System.out.println("로그아웃 되었습니다");
    }
}

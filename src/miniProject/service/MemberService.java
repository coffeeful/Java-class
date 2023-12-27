package miniProject.service;


import miniProject.common.CommonVariables;
import miniProject.dto.MemberDTO;
import miniProject.dto.PetDTO;
import miniProject.repository.MemberRepository;


import java.util.List;
import java.util.Scanner;

public class MemberService {

    static Scanner scanner = new Scanner(System.in);
   static MemberRepository memberRepository = new MemberRepository();

    public static void save() {
        boolean checkResult = false;
        String memberEmail = null;
        do {
            System.out.print("이메일: ");
            memberEmail = scanner.next();
            checkResult = memberRepository.emailCheck(memberEmail);
            if (checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            } else {
                System.out.println("이미 사용 중인 이메일 입니다. 다른 이메일을 입력해주세요.");
            }
        } while (!checkResult);

        System.out.println("이메일: ");
        String memberEmial = scanner.next();
        System.out.print("비밀번호: ");
        String memberPass = scanner.next();
        System.out.print("이름: ");
        String memberName = scanner.next();
        System.out.print("전화번호: ");
        String memberMobile = scanner.next();
        System.out.println("고양이 종류: ");
        String catBreed = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmial, memberPass,memberName, memberMobile);
        PetDTO petDTO = new PetDTO(catBreed);
        memberDTO.setMemberEmail(petDTO.toString());
        boolean result = memberRepository.save(memberDTO);
        if (result) {
            System.out.println("회원가입 성공!");
        } else {
            System.out.println("회원가입 실패!");
        }
    }

    public static void login() {
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPassword = scanner.next();
        MemberDTO loginResult = memberRepository.login(memberEmail, memberPassword);
        if (loginResult != null) {
            System.out.println("로그인 성공");
            System.out.println(memberEmail + "님 환영합니다!");
            CommonVariables.loginEmail = memberEmail;
        } else {
            System.out.println("이메일 또는 비밀번호가 틀립니다!");
        }
    }

    public static void findAll() {
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for (MemberDTO memberDTO: memberDTOList) {
            System.out.println("memberDTO = " + memberDTO);
        }
    }

    public static void update() {
        if (CommonVariables.loginEmail != null) {
            System.out.print("수정할 전화번호: ");
            String mobile = scanner.next();
            boolean result = memberRepository.update(CommonVariables.loginEmail, mobile);
            if (result) {
                System.out.println("회원정보가 수정되었습니다.");
            } else {
                System.out.println("수정 실패!");
            }
        } else {
            System.out.println("로그인 해주세요!");
        }
    }

    public static void delete() {
        if (CommonVariables.loginEmail != null) {
            System.out.println("정말 탈퇴하실건가요?");
            System.out.print("비밀번호: ");
            String memberPassword = scanner.next();
            MemberDTO memberDTO = memberRepository.login(CommonVariables.loginEmail, memberPassword);
            if (memberDTO != null) {
                boolean result = memberRepository.delete(CommonVariables.loginEmail);
                if (result) {
                    System.out.println("회원탈퇴를 완료했습니다! ");
                } else {
                    System.out.println("탈퇴가 실패했습니다! 다시 시도해주시길바랍니다!");
                }
            } else {
                System.out.println("비밀번호가 일치하지 않습니다! 전 단계로 돌아갑니다!");
            }
        } else {
            System.out.println("로그인 해주세요!");
        }
    }

    public static void logout() {
        CommonVariables.loginEmail = null;
        System.out.println("로그아웃 되었습니다");
    }
}

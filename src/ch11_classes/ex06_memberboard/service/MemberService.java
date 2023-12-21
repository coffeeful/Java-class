package ch11_classes.ex06_memberboard.service;

import ch11_classes.ex06_memberboard.common.CommonVariables;
import ch11_classes.ex06_memberboard.dto.MemberDTO;
import ch11_classes.ex06_memberboard.repository.MemberRepository;

import java.util.List;
import java.util.Scanner;
public class MemberService {

Scanner scanner = new Scanner(System.in);
MemberRepository memberRepository = new MemberRepository();

    public void save() {
        // 중복체크 결과를 담을 변수
        boolean checkResult = false;
        String memberEmail = null;
        do {
            System.out.print("이메일: ");
            memberEmail = scanner.next();
            // checkResult가 true => 사용가능(반복문 종료), checkResult가 false => 사용불가(다시 이메일입력)
            checkResult = memberRepository.emailCheck(memberEmail);
            if (checkResult) {
                System.out.println("사용 가능한 이메일 입니다.");
            } else {
                System.out.println("이미 사용 중인 이메일 입니다. 다른 이메일을 입력해주세요.");
            }
        } while (!checkResult); // checkResult 값이 false라면 계속 반복되도록

        System.out.print("비밀번호: ");
        String memberPass = scanner.next();
        System.out.print("이름: ");
        String memberName = scanner.next();
        System.out.print("전화번호: ");
        String memberMobile = scanner.next();
        MemberDTO memberDTO = new MemberDTO(memberEmail, memberPass, memberName, memberMobile);
        boolean result = memberRepository.save(memberDTO);
        if (result) {
            System.out.println("회원가입 성공");
        } else {
            System.out.println("회원가입 실패");
        }
    }
    public void login(){
        System.out.print("이메일: ");
        String memberEmail = scanner.next();
        System.out.print("비밀번호: ");
        String memberPass = scanner.next();
        MemberDTO loginResult = memberRepository.login(memberEmail,memberPass);
        if (loginResult != null){
            System.out.println("로그인 성공!");
            CommonVariables.loginEmail = memberEmail;
        }else {
            System.out.println("이메일 또는 비밀번호가 틀립니다!");
        }
    }
    public void findAll(){
        List<MemberDTO> memberDTOList = memberRepository.findAll();
        for (MemberDTO memberDTO: memberDTOList){
            System.out.println("memberDTO = " + memberDTO);
        }
    }
    public void update(){
        if(CommonVariables.loginEmail != null){
            System.out.print("수정할 전화번호: ");
            String member = scanner.next();

            boolean result = memberRepository.update(CommonVariables.loginEmail, member );
                if (result){
                    System.out.println("회원정보가 수정되었습니다.");
                }else {
                    System.out.println("수정이 실패하였습니다.");
                }
            } else {
            System.out.println("로그인을 해주세요!");
        }
    }
    public void delete(){
        if (CommonVariables.loginEmail != null){
            System.out.println("정말 탈퇴하실 건가요?");
            System.out.print("비밀번호: ");
        }

    }

}

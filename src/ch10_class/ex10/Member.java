package ch10_class.ex10;
                /**
                 * 회원 정보 클래스
                 * 회원 정보
                 *    - 이메일(memberEmail)
                 *    - 비밀번호(memberPassword)
                 *    - 이름(memberName)
                 *    - 전화번호(memberMobile)
                 *  getter/setter
                 *  생성자 2가지
                 *  로그인 처리 메서드
                 *    name: memberLogin
                 *    parameter: memberEmail, memberPassword
                 *    return type: boolean
                 *    실행내용: 이메일, 비밀번호가 일치하면 true,
                 *              일치하지 않으면 false 리턴
 */
public class Member {

    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;
// 알트 + 인서트 키를 누르면 getter/setter 를 자동으로 입력 가능하다.

                    //메서드 => 하나의 기능을 수행 할수있는 코드블록
public void setMemberEmail(String memberEmail){
    this.memberEmail = memberEmail;

}
public String getMemberEmail(){
    return memberEmail;
}
public void setMemberPassword(String memberPassword){
    this.memberPassword = memberPassword;
}
public String getMemberPassword(){
    return memberPassword;
}
public void setMemberName(String memberName){
    this.memberName = memberName;
}
public String getMemberName(){
    return memberName;
}
public void setMemberMobile(String memberMobile){
    this.memberMobile = memberMobile;
}
public String getMemberMobile(){
    return memberMobile;
}



        //기본생성자

public Member(){

}


public Member(String memberEmail, String memberPassword, String memberName, String memberMobile){
    //필드에 " 매개변수 "값을 저장   => 생성자
            this.memberEmail = memberEmail;
            this.memberPassword = memberPassword;
            this.memberName = memberName;
            this.memberMobile = memberMobile;
}
public boolean memberLogin(String memberEmail, String memberPassword) {
    //메서드를 만들때는 타입과 변수이름을 무조건 같이 써야 한다

    if (this.memberEmail.equals(memberEmail)&& this.memberPassword.equals(memberPassword)){

        return true;
    } else  {

        return false;
    }


}
}

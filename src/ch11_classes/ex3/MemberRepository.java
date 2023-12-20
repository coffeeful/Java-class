package ch11_classes.ex3;

import java.util.ArrayList;
import java.util.List;


public class MemberRepository {
    /** 회원가입 메서드
    * name : save
    * parameter : MemberDTO
    * return : boolean
    */

    public static List<MemberDTO> memberDTOList = new ArrayList<>();
    public boolean save(MemberDTO memberDTO){
         return memberDTOList.add(memberDTO);

    }

    /**회원목록 메서드
     * name : findAll
     * parameter : x
     * return: List<MemberDTO>
     */
    public List<MemberDTO> findAll(){
        return memberDTOList;
    }
    public MemberDTO login(String memberEmail, String memberPassword) {
        //메서드를 만들때는 타입과 변수이름을 무조건 같이 써야 한다
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
             if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())&& memberPassword.equals(memberDTOList.get(i).getMemberPassword())){
                memberDTO = memberDTOList.get(i);
        }
    }
        return memberDTO;
}
public boolean update(String loginEmail, String mobile){
        boolean result = false;
    for (int i = 0; i < memberDTOList.size(); i++) {
        if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
            memberDTOList.get(i).setMemberMobile(mobile);
            result = true;
        }
    }
        return result;
}
public boolean delete(String loginEmail) {
    boolean result = false;
    for (int i = 0; i < memberDTOList.size(); i++) {
        if (loginEmail.equals(memberDTOList.get(i).getMemberEmail())) {
            memberDTOList.remove(i);
            result = true;
        }
    }
        return result;
}

    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {
                // 중복되는 이메일이 있다 -> 결과를 false로 주자
                result = false;
            }
        }
        return result;
    }
}

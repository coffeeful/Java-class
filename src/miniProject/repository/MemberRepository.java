package miniProject.repository;

import miniProject.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private static List<MemberDTO> memberDTOList = new ArrayList<>();
    public boolean save(MemberDTO memberDTO) {
        return memberDTOList.add(memberDTO);
    }

    public MemberDTO login(String memberEmail, String memberPass) {
        MemberDTO memberDTO = null;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())&& memberPass.equals(memberDTOList.get(i).getMemberPass())) {
                memberDTO = memberDTOList.get(i);
            }
        }
            return memberDTO;
    }

    public boolean emailCheck(String memberEmail) {
        boolean result = true;
        for (int i = 0; i < memberDTOList.size(); i++) {
            if (memberEmail.equals(memberDTOList.get(i).getMemberEmail())) {

                result = false;
            }
        }
        return result;
    }
}

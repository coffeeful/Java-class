package ch13_map.ex03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();
    public static List<MemberDTO> memberDTOList = new ArrayList<>();
    public boolean save(MemberDTO memberDTO) {
       MemberDTO dto = memberDTOMap.put(memberDTO.getId(), memberDTO);
       if (dto)
    }

    public boolean emailCheck(String memberEmail) {
        for (Long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
        }
    }
    public Map<Long, MemberDTO> findAll() {
        return memberDTOMap;
    }
    public MemberDTO findById(Long id) {
        for (Long i : memberDTOMap.keySet()) {
            if (id.equals(memberDTOMap.get(i).getId())) {
                return memberDTOMap.get(i);
            }
        }
        return null;
    }
    public MemberDTO login(String memberEmail, String memberPassword) {
        for (Long i: memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail()))
        }
    }

}

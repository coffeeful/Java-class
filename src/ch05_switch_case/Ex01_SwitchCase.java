package ch05_switch_case;

public class Ex01_SwitchCase {
    public static void main(String[] args) {
    int num = 0;
    switch (num){
        case 0: //num ==0
            System.out.println("num은 0 입니다.");
            break;
        case 1: //num ==1
            System.out.println("num은 1 입니다.");
            break;
        case 2: //num ==2
            System.out.println("num은 2 입니다.");
            break;
        case 3: //num ==3
            System.out.println("num은 3 입니다.");
            break;
        default:
            System.out.println("1,2,3이 아닙니다.");
            break;
        }
        System.out.println("Switch Case 종료.");
        String city ="인천";
        switch (city){
            case "인천":
                System.out.println("인천 입니다.");
                break;
            case "서울":
                System.out.println("서울 입니다.");
                break;
            case "제주":
                System.out.println("저주 입니다.");
                break;
            default:
                System.out.println("한국이 아니에요.");
                break;



        }

    }
}



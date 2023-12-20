package ch11_classes.ex05;

import java.util.Scanner;

public class BankService {
    BankRepository bankRepository = new BankRepository();
    Scanner scanner = new Scanner(System.in);
//    - clientList(고객 정보를 담고 있는 리스트)
//    - bankingList(입출금 정보를 담고 있는 리스트)
//- ClientDTO(은행 고객 정보)
//    - id, clientName(고객이름), accountNumber(계좌번호, String)
//    clientPass(계좌비밀번호), clientCreatedAt(가입일자, String), balance(잔고, long)
//- AccountDTO(입출금 내역 정보)
//    - id, accountNumber(계좌번호, String), deposit(입금액),
//    withdraw(출금액), bankingAt(입출금 발생 시간, String)
//### 주요 기능
//- 신규계좌 등록
//    - 고객의 이름, 희망하는계좌번호, 계좌비밀번호를 입력받음
//    - 계좌번호는 중복되면 다시 입력받음
//    - id는 1씩 증가하며 저장됨
//    - 가입일자도 자동 저장됨
//- 잔액 조회
//    - 계좌번호를 입력받고 해당 계좌의 잔액을 출력
//    - 계좌가 없으면 없는 계좌번호라고 출력
//- 입금
//    - 입금하려는 계좌번호, 금액을 입력 받고 해당 계좌에 입금을 처리함
//    - 계좌가 없으면 없는 계좌번호라고 출력
//    - 입금내역도 bankingList에 기록해야 함
//- 출금
//    - 출금하려는 계좌번호, 비밀번호, 출금액을 입력 받고 해당 계좌에서 출금을 처리함
//        - 계좌가 없으면 없는 계좌번호라고 출력
//        - 비밀번호가 틀리면 입력정보가 틀렸다고 출력
//    - 출금처리시 잔액보다 출금금액이 크면 잔액이 부족하다고 출력하고 출금처리를 하지 않음.
//    - 출금내역도 bankingList에 기록해야 함
//- 입출금 내역 조회
//    - 계좌번호를 입력받음
//    - 계좌번호가 존재하면 1.전체내역 2.입금내역 3.출금내역 4.종료 메뉴가 출력됨
//        - 메뉴 선택에 따라 해당 계좌의 내역을 출력함
//-
//- 대부분의 기능에 계좌 체크하는 부분이 있기 때문에 이 부분을 따로 메서드로 분리하는 것도 좋음


    public void save(){
        boolean checkReslut = false;
        String accountNumber = null;
        System.out.println("고객등록을 시작합니다!");
        do {
        System.out.print("계좌번호: ");
        accountNumber = scanner.next();
        checkReslut = bankRepository.accountNumberChelck(accountNumber);
        if (checkReslut) {
            System.out.println("사용 가능한 계좌번호 입니다.");
        }else {
            System.out.println("이미사용중인 계좌입니다. 다른 계좌번호를 입력해주세요.");
        }
        }while (!checkReslut);

        System.out.print("고객 이름: ");
        String clientName = scanner.next();
        System.out.print("비밀번호: ");
        String clientPass = scanner.next();
        System.out.println("고객등록이 완료 되었습니다!");
    }

    public void inquiry(){
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        ClientDTO clientDTO = bankRepository.inquiry(accountNumber);
        if(clientDTO != null){
            System.out.print("고객님의 잔액은 " + clientDTO.getBalance() +"원 입니다");
        }else {
            System.out.println("없는 계좌번호 입니다!");
        }
    }
    public  void deposit(){

    }
}
package ch11_classes.ex05_bank;

import java.util.Scanner;
import java.util.List;
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


    public void save() {
        ClientDTO clientDTO = null;
        String accountNumber = null;
        System.out.println("고객등록을 시작합니다!");
        do {
            System.out.print("계좌번호: ");
            accountNumber = scanner.next();

            if (clientDTO == null) {
                System.out.println("사용 가능한 계좌번호 입니다.");
            } else {
                System.out.println("이미사용중인 계좌입니다. 다른 계좌번호를 입력해주세요.");
            }
        } while (clientDTO != null);

        System.out.print("고객 이름: ");
        String clientName = scanner.next();
        System.out.print("비밀번호: ");
        String clientPass = scanner.next();
        System.out.println("고객등록이 완료 되었습니다!");
        ClientDTO newClient = new ClientDTO(clientName, accountNumber, clientPass);
        boolean result = bankRepository.save(newClient);
        if (result) {
            System.out.println("고객등록 성공");
        } else {
            System.out.println("고객등록 실패");
        }
    }
    public void checkBalance(){
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        ClientDTO clientDTO = bankRepository.checkBalance(accountNumber);
        if(clientDTO != null){
            System.out.print(clientDTO.getClientName() + "님의 잔액은 " + clientDTO.getBalance() +"원 입니다");
        }else {
            System.out.println("없는 계좌번호 입니다!");
        }
    }
    public  void deposit( ){
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        System.out.print("입금액: ");
        long money = scanner.nextLong();
        ClientDTO clientDTO = bankRepository.accountCheck(accountNumber);
        if (clientDTO != null) {
            boolean result = bankRepository.deposit(accountNumber, money);
            if (result) {
                System.out.println("입금 완료!");
            }else {
                System.out.println("입금 실패!");
            }
        }else {
            System.out.println("해당 계좌가 없습니다");
        }
    }
    public void withdraw(){
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        System.out.print("비밀번호: ");
        String clientPass = scanner.next();
        System.out.print("출금액: ");
        long money = scanner.nextLong();
        ClientDTO clientDTO = bankRepository.accountCheck(accountNumber);
        if (clientDTO != null && clientPass.equals(clientDTO.getClientPass())) {
            boolean result = bankRepository.withdraw(accountNumber, money);
            if (result) {
                System.out.println("출금 완료");
            } else {
                System.out.println("잔액이 부족합니다");
            }
        } else {
            System.out.println("해당 계좌가 없거나 비밀번호가 틀립니다!");
        }
    }

    public void transactionalInfor() {
        boolean run = true;
        System.out.print("계좌번호: ");
        String accountNumber = scanner.next();
        int selectNo = 0;
        ClientDTO clientDTO = bankRepository.accountCheck(accountNumber);
        if (clientDTO != null) {
            while (run) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("1.모든 내역 | 2.입금 내역 | 3.출금 내역 | 4.종료 ");
                System.out.println("-----------------------------------------------------------------------");
                System.out.print("선택> ");
                selectNo = scanner.nextInt();
                List<AccountDTO> accountDTOList = bankRepository.bankingList(accountNumber); // 입력한 계좌번호에 해당하는 거래내역만
                if (accountDTOList.size() > 0) { // 거래내역 있음
                    if (selectNo == 1) {
                        for (AccountDTO accountDTO : accountDTOList) {
                            System.out.println("accountDTO = " + accountDTO);
                        }
                    } else if (selectNo == 2) {
                        for (AccountDTO accountDTO : accountDTOList) {
                            if (accountDTO.getDeposit() > 0) {
                                System.out.println("accountDTO = " + accountDTO);
                            }
                        }
                    } else if (selectNo == 3) {
                        for (AccountDTO accountDTO : accountDTOList) {
                            if (accountDTO.getWithdraw() > 0) {
                                System.out.println("accountDTO = " + accountDTO);
                            }
                        }
                    } else if (selectNo == 4) {
                        run = false;
                    }
                } else {
                    System.out.println("거래내역이 없습니다!");
                }
            }
        } else {
            System.out.println("해당 계좌가 없습니다!");
        }
    }
    public void accountTransfer(){
        System.out.print("보내실 분 계좌번호: ");
        String accountNumberFrom = scanner.next();
        System.out.print("받으실 분 계좌번호: ");
        String accountNumberTo = scanner.next();
        System.out.print("보낼 금액: ");
        long money = scanner.nextLong();
        ClientDTO clientTo = bankRepository.accountCheck(accountNumberTo); // 받는 사람의 고객정보
        ClientDTO clientFrom = bankRepository.accountCheck(accountNumberFrom); // 보내는 사람의 고객정보
        if (clientTo != null && clientFrom !=null) {
            System.out.println("받으실 분이 " + clientTo.getClientName() + "님이 맞습니까?");
            System.out.println("맞으면 1번, 틀리면 2번을 입력해주세요.");
            System.out.print("입력> ");
            int selectNo = scanner.nextInt();
            if (selectNo == 1) {
                System.out.print("비밀번호를 입력해주세요: ");
                String clientPass = scanner.next(); // 보내는 사람의 비밀번호
                if (clientPass.equals(clientFrom.getClientPass()) && money <= clientFrom.getBalance()) {
                    bankRepository.transfer(accountNumberFrom, accountNumberTo, money);
                    System.out.println("이체가 완료되었습니다. ");
                } else if (!clientPass.equals(clientFrom.getClientPass())) {
                    System.out.println("비밀번호가 틀립니다!");
                } else if (money > clientFrom.getBalance()) {
                    System.out.println("잔액이 부족합니다!");
                }
            } else if (selectNo == 2) {
                System.out.println("메인메뉴로 돌아갑니다.");
            }
        } else {
            System.out.println("해당 계좌가 없습니다.");
        }
    }

    }

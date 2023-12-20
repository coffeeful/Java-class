package ch11_classes.ex05;

import java.time.LocalDateTime;

public class ClientDTO {

    LocalDateTime now = LocalDateTime.now();
private Long id;
private String  clientName; //고객이름
private String  accountNumber; // 계좌번호
private int clientPass; // 계좌비밀번호
private String clientCreatedAt; // 가입일자
private Long balance; //잔고


    public LocalDateTime getNow() {
        return now;
    }

    public void setNow(LocalDateTime now) {
        this.now = now;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getClientPass() {
        return clientPass;
    }

    public void setClientPass(int clientPass) {
        this.clientPass = clientPass;
    }

    public String getClientCreatedAt() {
        return clientCreatedAt;
    }

    public void setClientCreatedAt(String clientCreatedAt) {
        this.clientCreatedAt = clientCreatedAt;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
    public static Long idvalue = 1L;
    public ClientDTO(String clientName, String accountNumber, int clientPass, String clientCreatedAt, Long balance){
        this.id = idvalue;
        this.clientName = clientName;
        this.accountNumber = accountNumber;
        this.clientPass = clientPass;
        this.clientCreatedAt = clientCreatedAt;
        this.balance = 0L;
    }

    @Override
    public String toString() {
        return "ClientDTO{" +
                "now=" + now +
                ", id=" + id +
                ", clientName='" + clientName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", clientPass=" + clientPass +
                ", clientCreatedAt='" + clientCreatedAt + '\'' +
                ", balance=" + balance +
                '}';
    }
}

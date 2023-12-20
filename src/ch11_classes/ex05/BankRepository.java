package ch11_classes.ex05;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {





    public  static List<AccountDTO> accountDTOList = new ArrayList<>();
    public  static List<ClientDTO> clientDTOList = new ArrayList<>();
    public boolean save(ClientDTO clientDTO) {
        return clientDTOList.add(clientDTO);
    }
    public ClientDTO inquiry(String  accountNumber){
        ClientDTO clientDTO = null;
        for (int i = 0; i <clientDTOList.size(); i++) {
            if (accountNumber.equals(clientDTOList.get(i).getAccountNumber())) {
                clientDTO = clientDTOList.get(i);
            }
        } return clientDTO;
    }

    public void deposit(){

    }

































    public  boolean accountNumberChelck(String accountNumber){
        boolean result = true;
        for (int i = 0; i <accountDTOList.size(); i++) {
            if (accountNumber.equals(accountDTOList.get(i).getAccountNumber())){

                result = false;
            }
        } return result;
    }
}
package Client;

import WSHandler.Account;
import WSHandler.BankService;
import WSHandler.BankWS;


import java.util.List;

public class ClientWS {

    public static void main(String[] args) {

        BankService stub =new BankWS().getBankServicePort();
        System.out.println(stub.converter(800));
        Account cp=stub.getAccountWS(5);
        System.out.println("--------------------------");

        System.out.println(cp.getId());
        System.out.println(cp.getBalance());
        System.out.println(cp.getCreationDate());
        System.out.println("---------------------------");

        List<Account> accountList = stub.getAccountsList();
        accountList.forEach(c->{
            System.out.println(c.getId());
            System.out.println(c.getBalance());
            System.out.println(c.getCreationDate());
            System.out.println("---------------------------");
        });
    }
}


package WS;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BankWS")

public class BankService {

    @WebMethod(operationName = "Converter")
    public double currencyConverter(@WebParam(name = "Amount") double amount) {
        return amount * 11;
    }
    @WebMethod(operationName = "GetAccountWS")
    public Account accountMethodeCode (@WebParam(name ="Code") int code){
        return new Account(code, Math.random()*9888,new Date());
    }
    @WebMethod(operationName = "GetAccountsList")
    public List<Account> getAccounts(){

        return List.of(

                new Account(1, Math.random()*9888,new Date()),
                new Account(2, Math.random()*9888,new Date()),
                new Account(3, Math.random()*9888,new Date())
        );
    }
}

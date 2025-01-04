package Server;

import WS.BankService;
import jakarta.xml.ws.Endpoint;

public class ServerJaxWS {

    public static void main(String[] args) {

//        Endpoint endpoint = null;
        Endpoint.publish("http://0.0.0.0:9191/",new BankService());
        System.out.println("Server started");

    }

}
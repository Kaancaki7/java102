package _interface;

public interface IBank {

    final String hostAIpAdress = "127.0.0.1";
    final String hostBIpAdress = "127.1.1.1";
    final String hostCIpAdress = "127.2.2.2";

    void connect();

    void cardInfo(double amount,String cardNo,String expDate,String cvc);
}

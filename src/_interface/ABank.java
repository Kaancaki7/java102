package _interface;

public class ABank implements IBank{
    private String bankName;
    private String terminalID;
    private String password;

    ABank(String bankName,String terminalID,String password){
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    @Override
    public void connect(){
        System.out.println(this.bankName + " Connected.");
        System.out.println("Machine Ip: " + this.hostAIpAdress);
    }
    @Override
    public void cardInfo(double amount,String cardNo,String expDate,String cvc) {
        System.out.println("transaction succesful");
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package exception;

//kendi hata atma sınıfımızı oluşturduk.
public class AgeCheckException extends Exception{
    public AgeCheckException(String message) {
        super(message);
        System.out.println("yaş hatası alındı!");
    }

}

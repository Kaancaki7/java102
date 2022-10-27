package _interface;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        System.out.print("Enter card No:");
        String cardNo = sc.next();
        System.out.print("Enter expiration date: ");
        String expDate = sc.next();
        System.out.print("Enter cvc: ");
        String cvc = sc.next();

        System.out.println("1 - A Bank");
        System.out.println("2 - B Bank");
        System.out.println("3 - C Bank");
        System.out.print("Choose the bank: ");
        int select = sc.nextInt();

        switch (select) {
            case 1:
                ABank aPos = new ABank("A Bank","2213123","219783hjbfdkh29");
                aPos.connect();
                aPos.cardInfo(amount,cardNo,expDate,cvc);
                break;
            case 2:
                BBank bPos = new BBank("B Bank","985676","2197hggaskdaskdkh29");
                bPos.connect();
                bPos.cardInfo(amount,cardNo,expDate,cvc);
                break;
            case 3:
                CBank cPos = new CBank("C Bank","985676213123","219213ksdksd");
                cPos.connect();
                cPos.cardInfo(amount,cardNo,expDate,cvc);
                break;
            default:
                System.out.println("ENTER A VALID BANK!");
                break;
        }
    }
}

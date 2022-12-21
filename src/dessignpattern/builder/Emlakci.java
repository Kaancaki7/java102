package dessignpattern.builder;

public class Emlakci {

    public static void main(String[] args) {

        Ev ev1 = new Ev();
        ev1.setIl("Isparta");
        ev1.setIlce("Merkez");
        ev1.setMahalle("Fatih mah.");
        ev1.setOdaSayisi(3);
        ev1.setBinaYili(2014);
        ev1.setHasKlima(true);

        Ev ev2 = new Ev("Afyon","Dinar","Fatih",2004,2,3,2,1,false,false,false,true,false,true);
        printEv(ev1);
        printEv(ev2);

    }

    private static void printEv(Ev ev) {

        System.out.println();

        System.out.println("Ev eklendi -> " + ev);

        System.out.println();
    }
}

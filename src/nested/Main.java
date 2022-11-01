package nested;

public class Main {
    public static void main(String[] args) {

        //Non - static için gösterim:
        Out o = new Out();
        o.run();

        //Out sınıfındaki in sınıfını çağırmak için bir nesneye ihtiyac duyarız o da ürettiğimiz "o" nesnesi
        //aşağıdaki kodun anlamı Out sınıfındaki in sınıfından bir nesne yoluyla yeni nesne üret.
        Out.In inNesnesi = o.new In();
        inNesnesi.run();

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();

        //static için gösterim
        StatikOut.StatikIn.run();

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
        //local sınıflar için gösterim

        Local l = new Local();
        l.run();

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();

        Anonim a = new Anonim(){
            @Override
            public void run() {
                System.out.println("anonim olarak yazılmış run metodu.");
            }
        };

        a.run();
    }
}

package dessignpattern.builder;

public class EmlakciV2 {


    public static void main(String[] args) {

        Ev ev1 = EvBuilder.startNormalEvBuild("Isparta","Merkez","Fatih",2005,3)
                .setHasCocukParki(true)
                .setHasOtopark(true)
                .build();

        Ev ev2 = EvBuilder.startHavuzluEvBuild("ANtalya","Kaş","Sahil",2022,5,true)
                .setHasOtopark(true)
                .setBalkonSayisi(3)
                .setEsyali(true)
                .build();


        printEv(ev1);
        printEv(ev2);


    }

    private static void printEv(Ev ev) {

        System.out.println();

        System.out.println("Ev eklendi -> " + ev);

        System.out.println();
    }
}

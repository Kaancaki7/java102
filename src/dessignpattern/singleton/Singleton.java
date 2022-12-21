//açıklama :  singleton bir tane nesne oluşturur ve get metodu ile sürekli onu çağırır 10 kere
//get metodu çağırsak bile sadece 1 kere nesne oluşur ve sürekli o gelir.

package dessignpattern.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getSingleton() {
        return singleton;
    }
}

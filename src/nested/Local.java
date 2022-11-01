package nested;

public class Local {

    public void run() {

        //local sınıf sadece bu metotta yerel den nesne üretilebilir print metodunda üretmezsin mesela.
        class Yerel {
            private int a;
            public Yerel(int a) {
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }

        Yerel y = new Yerel(15);
        System.out.println("local class");
        System.out.println(y.getA());

    }

    public void print() {

    }
}

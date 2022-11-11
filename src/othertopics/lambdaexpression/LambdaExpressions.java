package othertopics.lambdaexpression;

public class LambdaExpressions {
    public static void main(String[] args) {
        Matematik toplama = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a + b;
            }
        };

        Matematik cikarma = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a - b;
            }
        };

        Matematik carpma = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a * b;
            }
        };

        Matematik bolme = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a / b;
            }
        };

        System.out.println(toplama.transaction(10,2));
        System.out.println(cikarma.transaction(10,2));
        System.out.println(carpma.transaction(10,2));
        System.out.println(bolme.transaction(10,2));

        System.out.println("---------------------------------------------------------------------");
        //Şimdi diyor ki lambda expression yukarıkadi kullanım biraz karışık ve uzun gelebilir sana
        //Eğer bir interface sadece bir tane abstract metoda sahipse beni kullanabilirsin ben daha kolay ve sadeyim
        //diyor
        //Lambda kullanımı :

        Matematik sum = (a,b) -> a + b;
        Matematik ext = (a,b) -> a - b;
        Matematik imp = (a,b) -> a * b;
        Matematik div = (a,b) -> a / b;

        System.out.println(sum.transaction(10,2));
        System.out.println(ext.transaction(10,2));
        System.out.println(imp.transaction(10,2));
        System.out.println(div.transaction(10,2));

    }

}

package nested;

public class StatikOut {
    public int a = 5;

    public static class StatikIn {
        public int a = 10;

        public static void run() {
            System.out.println("Statik in sınıfına ait gösterim");
            int a = 1;
            System.out.println(a);
        }
    }

    public void run() {
        StatikIn.run();
    }
}

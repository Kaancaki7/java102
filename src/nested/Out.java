package nested;

//Outer class
public class Out {
    public int a = 5;

    //Inner class
    public class In {
        public int a = 10;

        public void run() {
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a);
        }
    }

    public void run() {
        In in = new In();
        in.run();
    }

}

package multithreadsandconcurrency;

import java.util.ArrayList;

public class Homework extends Thread{
    private ArrayList<Integer> odd = new ArrayList<>();
    private ArrayList<Integer> even = new ArrayList<>();
    private ArrayList<Integer> general = new ArrayList<>();

    public Homework(ArrayList<Integer> general) {
        this.general = general;
    }

    @Override
    public void run() {

        for (int i = 0; i < general.size(); i++) {

            if (general.get(i) % 2 == 0) {
                odd.add(general.get(i));
            }
            else {
                even.add(general.get(i));
            }
        }

        printOdd();
        printEven();
    }

    public synchronized void printOdd() {
        System.out.println("ODD : " + this.odd);
    }

    public synchronized void printEven() {
        System.out.println("EVEN : "  + this.even);
    }
}

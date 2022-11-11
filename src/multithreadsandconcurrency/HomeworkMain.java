package multithreadsandconcurrency;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeworkMain {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(4);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            arr.add(i);
        }

        Homework h1 = new Homework(arr);

        pool.execute(h1);
    }
}

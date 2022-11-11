package multithreadsandconcurrency;

//interface yluyla runnable sınıfından threadları kullanabiliyoruz.

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = 0; i <= 50; i++) {
            System.out.println(threadName + " : " + i);
        }

    }
}

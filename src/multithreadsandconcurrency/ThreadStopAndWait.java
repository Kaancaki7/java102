package multithreadsandconcurrency;

public class ThreadStopAndWait {
    public static void main(String[] args) throws InterruptedException {
        StopAndWaitInterface n1 = new StopAndWaitInterface("n1",1);
        Thread t1 = new Thread(n1);

        t1.start();
        Thread.sleep(2000L);
        n1.stop();

        StopAndWaitInterface n2 = new StopAndWaitInterface("n2",2);
        Thread t2 = new Thread(n2);

        t2.start();
        Thread.sleep(2000);
        n2.stop();
    }
}

package multithreadsandconcurrency;

public class OrderMatic implements Runnable{
    private int orderNo;
    private final Object LOCK = new Object();

    OrderMatic() {
        this.orderNo = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //ister böyle senkron haline getir
        synchronized (LOCK) {
            this.orderNo++;
            System.out.println("Thread : " + Thread.currentThread().getName() + " - Order No : " + this.orderNo);
        }
    }

    //istersen metota ekle.
    /*
    public synchronized void increaseOrder() {
        this.orderNo++;
        System.out.println("Thread : " + Thread.currentThread().getName() + " - Order No : " + this.orderNo);
        }
 */

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}

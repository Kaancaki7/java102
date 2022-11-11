package multithreadsandconcurrency;

//çok fazla thread üretmek yerine ne akdar kullanmak istediğini belirtiyosun ve o kadar threadle işlemlerini
//yapıyorsun threadpooling sayesinde (thread havuzu)

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPooling {
    public static void main(String[] args) {
        OrderMatic o1 = new OrderMatic();

        //10 tane thread kullanmak istediğimi belirttim.
        ExecutorService pool = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            pool.execute(o1);
        }
        //100 tane değeri 10 tane threadle halletmiş olduk.
    }
}

package fittingShop;

import java.util.concurrent.*;

public class ShopSimulator {
    private final int totalCustomers;
    private final int workerCount;
    private final BlockingQueue<Customer> queue = new LinkedBlockingQueue<>();
    private final ExecutorService workerPool;
    private final CountDownLatch latch;

    public ShopSimulator(int workerCount, int totalCustomers) {
        this.workerCount = workerCount;
        this.totalCustomers = totalCustomers;
        this.workerPool = Executors.newFixedThreadPool(workerCount);
        this.latch = new CountDownLatch(totalCustomers);
    }

    public void start() {
        Logger logger = Logger.getInstance();
        logger.setStartTime(System.nanoTime());


        for (int i = 0; i < workerCount; i++) {
            workerPool.submit(new Worker(queue,latch,logger));
        }

        CustomerArrivalScheduler arrivalScheduler = new CustomerArrivalScheduler(totalCustomers, queue,logger);
        arrivalScheduler.start();



        try {
            latch.await();
            workerPool.shutdown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

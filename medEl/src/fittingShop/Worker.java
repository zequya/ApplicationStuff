package fittingShop;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable {

    private final BlockingQueue<Customer> queue;
    private final Logger logger;
    private final Random random = new Random();
    private final CountDownLatch latch;

    public Worker(BlockingQueue<Customer> queue,CountDownLatch latch,Logger logger) {
        this.queue = queue;
        this.logger = logger;
        this.latch = latch;
    }

    @Override
    public void run() {
        while (true) { //!Thread.currentThread().isInterrupted()
            try {
                if (latch.getCount() == 0) break;

                Customer customer = queue.poll(500, TimeUnit.MILLISECONDS);;
                if (customer == null) continue;

                float duration = 2.0f + random.nextFloat() * 3.0f;
                logger.log("Customer " + customer.getId() +
                        " car tires are being changed and it will take " + String.format("%.1f", duration) + " seconds.");
                Thread.sleep((long) (duration * 1000));
                logger.log("Customer " + customer.getId() + " has left.");

                latch.countDown();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

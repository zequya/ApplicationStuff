package fittingShop;

import vehicles.Car;
import vehicles.VehicleBrand;

import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomerArrivalScheduler {
    private final int totalCustomers;
    private final BlockingQueue<Customer> queue;
    private final Random random = new Random();
    private final Logger logger;


    public CustomerArrivalScheduler(int totalCustomers, BlockingQueue<Customer> queue,Logger logger) {
        this.totalCustomers = totalCustomers;
        this.queue = queue;
        this.logger = logger;
    }

     public void start() {
         for (int i = 1; i <= totalCustomers; i++){
             long delay = (long) (random.nextDouble() * 1000);
             VehicleBrand m = (i % 2 == 0) ? VehicleBrand.HONDA : VehicleBrand.TOYOTA;
             Car car = new Car(m);
             Customer customer = new Customer(i, car);

             logger.log("Customer " + customer.getId() + " has arrived. " + customer.getCar().toString()
                     +"\n"+customer.getCar().getCarTire().toString() );
             try {
                 queue.put(customer);

             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
             try {
                 Thread.sleep(delay);
             } catch (InterruptedException e) {
                 System.err.println("Sleep interrupted");
             }

         }
     }
}


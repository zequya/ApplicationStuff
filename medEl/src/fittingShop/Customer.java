package fittingShop;

import vehicles.Car;

public class Customer {

    int id;
    Car car;

    public Customer(int id, Car car) {
        this.id = id;
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public Car getCar() {
        return car;
    }
}

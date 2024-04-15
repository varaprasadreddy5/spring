package org.learning.spring.day1session1;

public class Disc extends Product{
    private double capacity;

    public Disc(){}

    public Disc(int productId, String productName, double price, int capacity, double discount) {
        super(productId, productName, price, discount);
        this.capacity = capacity;
    }


    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}

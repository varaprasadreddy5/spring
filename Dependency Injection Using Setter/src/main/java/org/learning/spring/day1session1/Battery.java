package org.learning.spring.day1session1;

public class Battery extends Product{

    private boolean rechargeable;

    public Battery(){

    }

    public Battery(int productId, String productName, double price, boolean rechargeable, double discount) {
        super(productId, productName, price, discount);
        this.rechargeable = rechargeable;
   }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}

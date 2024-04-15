package org.learning.spring.day1session1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


//        Battery battery = (Battery) context.getBean("battery");
//
//
//        Disc disc = (Disc) context.getBean("disc");
//
//
//        System.out.println("Battery Details:");
//        System.out.println("Product ID: " + battery.getProductId());
//        System.out.println("Product Name: " + battery.getProductName());
//        System.out.println("Price: $" + battery.getPrice());
//        System.out.println("Rechargeable: " + battery.isRechargeable());
//        System.out.println("Discount: " + battery.getDiscount());
//        double discountPrice = battery.getPrice() * battery.getDiscount();
//        System.out.println("Price After Discount : " + (battery.getPrice() - discountPrice));
//
//        System.out.println("\nDisc Details:");
//        System.out.println("Product ID: " + disc.getProductId());
//        System.out.println("Product Name: " + disc.getProductName());
//        System.out.println("Price: $" + disc.getPrice());
//        System.out.println("Capacity: " + disc.getCapacity() + " GB");
//        System.out.println("Discount: " + disc.getDiscount());
//        double discountPrice1 = disc.getPrice() * disc.getDiscount();
//        System.out.println("Price After Discount : " + (disc.getPrice() - discountPrice1));


        //Problem Statement 4
        ShoppingCart cart1 = (ShoppingCart) context.getBean("shoppingCart");
        cart1.setItems(new Product(1, "Cello Battery", 5.99, 0.15));
        cart1.setItems(new Product(2, "DVD Disc", 9.99, 0.2));

        // Customer 2
        ShoppingCart cart2 = (ShoppingCart) context.getBean("shoppingCart");
        cart2.setItems(new Product(3, "LED Flashlight", 12.99, 0.1));

        // Print items in each shopping cart
        System.out.println("Customer 1 Shopping Cart:");
        for (Product item : cart1.getItems()) {
            System.out.println("Product ID: " + item.getProductId() + ", Name: " + item.getProductName());
        }

        System.out.println("\nCustomer 2 Shopping Cart:");
        for (Product item : cart2.getItems()) {
            System.out.println("Product ID: " + item.getProductId() + ", Name: " + item.getProductName());
        }



        // Problem Statement 5
        Casher casher = (Casher) context.getBean("casher");
        ShoppingCart cart = (ShoppingCart) context.getBean("shoppingCart");

        cart.setItems(new Battery(1, "AAA Battery", 5.99, true, 0.15));
        cart.setItems(new Disc(2, "DVD Disc", 9.99, 2, 4.7));


        try {
            casher.checkOut(cart);
            System.out.println("Checkout successful!");
        } catch (IOException e) {
            System.out.println("Error during checkout: " + e.getMessage());
        }
    }
}

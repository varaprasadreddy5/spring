package org.learning.spring.day1session1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void setItems(Product item) {
        items.add(item);
    }

    public List<Product> getItems() {
        return items;
    }
}

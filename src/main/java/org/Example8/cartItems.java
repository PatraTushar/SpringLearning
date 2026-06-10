package org.Example8;

import java.util.List;
import java.util.Map;

public class cartItems {

    private String name;
    private List<String> itemNames;

    private Map<String, Double> itemPrices;

    private Product product;


    public cartItems() {
        super();
        System.out.println(" Default Constructor with no arguments ");
    }

    public cartItems(String name, List<String> itemNames, Map<String, Double> itemPrices) {

        super();
        System.out.println("  Constructor with 3 arguments ");
        this.name = name;
        this.itemNames = itemNames;
        this.itemPrices = itemPrices;
    }


    public cartItems(String name) {

        super();
        System.out.println("  Constructor with 1 arguments ");
        this.name = name;

    }


    public List<String> getItemNames() {
        return itemNames;
    }

    public Map<String, Double> getItems() {
        return itemPrices;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}

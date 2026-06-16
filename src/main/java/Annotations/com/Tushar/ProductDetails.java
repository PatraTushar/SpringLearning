package Annotations.com.Tushar;

import org.springframework.stereotype.Component;

@Component
public class ProductDetails {

    private int id;
    private String name;

    private double Price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}

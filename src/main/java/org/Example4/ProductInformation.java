package org.Example4;

public class ProductInformation {

    private int productID;
    private String productName;
    private double price;

    private boolean isExpired;


    public ProductInformation() {

        System.out.println(" Product is created ");
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        System.out.println(" Product setProductID is called with value : " + productID);
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        System.out.println(" Product setProductName is called with value : " + productName);
        this.productName = productName;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println(" Product setPrice is called with value : " + price);
        this.price = price;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setIsExpired(boolean expired) {
        System.out.println(" Product setExpired is called with value : " + expired);
        isExpired = expired;
    }

    @Override
    public String toString() {
        return " ProductInformation[productID = " + productID + "," + " productName = " + productName + "," + " price = " + price + "," + " isExpired = " + isExpired + "]";
    }
}

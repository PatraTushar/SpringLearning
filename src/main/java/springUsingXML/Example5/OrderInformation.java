package springUsingXML.Example5;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderInformation {

    private int orderID;
    private List<String> productNames;

    private List<Integer> releaseYears;

    private Set<String> emailIDS;

    private Map<String, Double> productAndPrices;


    public OrderInformation() {

        System.out.println(" OrderInformation is created ");
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }


    public List<String> getProductNames() {
        return productNames;
    }

    public void setProductNames(List<String> productNames) {

        System.out.println(" OrderInformation setProductNames is called " + productNames);
        this.productNames = productNames;
    }

    public void totalProduct() {

        System.out.println(productNames);
    }

    public List<Integer> getReleaseYears() {
        return releaseYears;
    }

    public void setReleaseYears(List<Integer> releaseYears) {
        System.out.println(" OrderInformation setReleaseYears is called " + releaseYears);
        this.releaseYears = releaseYears;
    }


    public Set<String> getEmailIDS() {
        return emailIDS;
    }


    public void setEmailIDS(Set<String> emailIDS) {
        System.out.println(" OrderInformation setEmailIDS is called " + emailIDS);
        this.emailIDS = emailIDS;
    }

    public Map<String, Double> getProductAndPrices() {
        return productAndPrices;
    }

    public void setProductAndPrices(Map<String, Double> productAndPrices) {
        this.productAndPrices = productAndPrices;
    }


    public void yearOfRelease() {

        System.out.println(releaseYears);
    }

    public void totalEmail() {

        System.out.println(emailIDS);
    }


    public void allProductAndPrices(){

        System.out.println(productAndPrices);
    }
}

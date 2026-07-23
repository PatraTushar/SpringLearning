package springUsingXML.Practice;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OrderInfo {

    private String orderID;

    private List<String> orderNames;

    private Set<String> emailIDS;

    private Map<String,Integer> productAndPrices;

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public List<String> getOrderNames() {
        return orderNames;
    }

    public void setOrderNames(List<String> orderNames) {
        this.orderNames = orderNames;
    }

    public Set<String> getEmailIDS() {
        return emailIDS;
    }

    public void setEmailIDS(Set<String> emailIDS) {
        this.emailIDS = emailIDS;
    }

    public Map<String, Integer> getProductAndPrices() {
        return productAndPrices;
    }

    public void setProductAndPrices(Map<String, Integer> productAndPrices) {
        this.productAndPrices = productAndPrices;
    }
}

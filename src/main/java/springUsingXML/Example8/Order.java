package springUsingXML.Example8;

public class Order {

    private String emailID;
    private cartItems cartItems;

    public Order() {
        super();
    }

    public Order(String emailID, cartItems cartItems) {

        super();
        this.emailID = emailID;
        this.cartItems = cartItems;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public cartItems getCartItems() {
        return cartItems;
    }

    public void setCartItems(springUsingXML.Example8.cartItems cartItems) {
        this.cartItems = cartItems;
    }

    public void cartInfo(){

        System.out.println(getEmailID());
        System.out.println(getCartItems().getItemNames());
    }
}

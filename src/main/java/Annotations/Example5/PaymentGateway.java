package Annotations.Example5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class PaymentGateway {


    private int amount;
    private String userEmail;
    @Autowired
    @Qualifier("upiCardPayment")
    private PaymentType paymentType;

    public PaymentGateway(){

        System.out.println(" PaymentGateway Object is created ");
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }


}



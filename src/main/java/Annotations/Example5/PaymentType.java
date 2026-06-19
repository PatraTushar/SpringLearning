package Annotations.Example5;


import org.springframework.stereotype.Component;

@Component("upiPayment")
public class PaymentType {


    private String paymentType;
    public PaymentType(){

        System.out.println(" PaymentType object is created ");
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}

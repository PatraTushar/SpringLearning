package Annotations.com.Swiggy.Payment;


import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public PaymentService(){

        System.out.println(" PaymentService Object is created ");
    }

    public void pay() {
        System.out.println("Payment Successful");
    }
}

package Annotations.Example5;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("Annotations.Example5")
@Configuration
public class SpringBeanConfiguration {


    @Bean
    public PaymentType upiCardPayment() {
        PaymentType payment = new PaymentType();
        payment.setPaymentType(" UpiCard Payment ");
        return payment;
    }


    @Bean
    public PaymentType creditCardPayment() {
        PaymentType payment = new PaymentType();
        payment.setPaymentType(" CreditCard Payment ");
        return payment;
    }


    @Bean
    public PaymentType debitCardPayment() {
        PaymentType payment = new PaymentType();
        payment.setPaymentType(" DebitCard Payment ");
        return payment;
    }




}

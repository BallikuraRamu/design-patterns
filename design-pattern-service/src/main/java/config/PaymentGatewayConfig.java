package config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import classes.PayPalFactory;
import classes.RazorpayFactory;
import classes.StripeFactory;
import interfaces.PaymentGatewayFactory;

@Configuration
public class PaymentGatewayConfig {

	@Value("${payment.gateway}")
	String gateway;

	@Bean
    public PaymentGatewayFactory paymentGatewayFactory() {
        switch (gateway.toLowerCase()) {
            case "razorpay":
                return (PaymentGatewayFactory) new RazorpayFactory();
            case "paypal":
                return (PaymentGatewayFactory) new PayPalFactory();
            case "stripe":
                return (PaymentGatewayFactory) new StripeFactory();
            default:
                throw new IllegalArgumentException("Unsupported payment gateway: " + gateway);
        }
    }
}

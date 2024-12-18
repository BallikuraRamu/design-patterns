package classes;

import interfaces.PaymentGatewayService;

public class StripePaymentGatewayService implements PaymentGatewayService{

	@Override
	public void processPayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);		
	}

	@Override
	public void refundPayment(double amount) {
        System.out.println("Refunding Stripe payment of $" + amount);		
	}

}

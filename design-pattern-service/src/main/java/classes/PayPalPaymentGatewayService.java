package classes;

import interfaces.PaymentGatewayService;

public class PayPalPaymentGatewayService implements PaymentGatewayService{

	@Override
	public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
	}

	@Override
	public void refundPayment(double amount) {
        System.out.println("Refunding PayPal payment of $" + amount);		
	}

}

package classes;

import interfaces.PaymentGatewayService;

public class StripeFactory implements PaymentGatewayService{

	@Override
	public void processPayment(double amount) {
		new StripePaymentGatewayService();
		
	}

	@Override
	public void refundPayment(double amount) {
		new StripePaymentGatewayService();
		
	}

}

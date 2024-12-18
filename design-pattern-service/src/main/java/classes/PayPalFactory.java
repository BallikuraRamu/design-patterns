package classes;

import interfaces.PaymentGatewayService;

public class PayPalFactory implements PaymentGatewayService{

	@Override
	public void processPayment(double amount) {
		new PayPalPaymentGatewayService();
		
	}

	@Override
	public void refundPayment(double amount) {
		new PayPalPaymentGatewayService();
		
	}

}

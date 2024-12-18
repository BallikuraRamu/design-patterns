package classes;

import interfaces.PaymentGatewayService;

public class RazorpayFactory implements PaymentGatewayService {

	@Override
	public void processPayment(double amount) {
		new RazorpayPaymentGatewayService();
	}

	@Override
	public void refundPayment(double amount) {
		new RazorpayPaymentGatewayService();
	}

}

package classes;

import interfaces.PaymentGatewayService;

public class RazorpayPaymentGatewayService implements PaymentGatewayService{

	@Override
	public void processPayment(double amount) {
        System.out.println("Processing Razorpay payment of $" + amount);		
	}

	@Override
	public void refundPayment(double amount) {
        System.out.println("Refunding Razorpay payment of $" + amount);		
	}

}

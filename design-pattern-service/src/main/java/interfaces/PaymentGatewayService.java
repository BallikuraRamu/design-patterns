package interfaces;

public interface PaymentGatewayService {
	
	void processPayment(double amount);
	void refundPayment(double amount);
}

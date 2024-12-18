package service;

import org.springframework.stereotype.Service;

@Service
public class PaymentProcessorService {

	
	public String processPayment(double amount) {
        return "Payment of $" + amount + " has been processed.";
    }

    public String refundPayment(double amount) {
        return "Refund of $" + amount + " has been processed.";
    }
}

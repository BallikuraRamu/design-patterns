package component;

import org.springframework.stereotype.Component;

import interfaces.Payment;

@Component
public class PhonePay implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing PhonePay payment of : " + amount + "Rupess");
	}

}

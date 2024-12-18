package component;

import org.springframework.stereotype.Component;

import interfaces.Payment;

@Component
public class GooglePay implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing GooglePay payment of : " + amount + "Rupess");
	}

}

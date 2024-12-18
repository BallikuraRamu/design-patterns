package component;

import org.springframework.stereotype.Component;

import interfaces.Payment;

@Component
public class PaymentProcessorFactory {

	private final GooglePay googlePay;
	private final PhonePay phonePay;

	private PaymentProcessorFactory(GooglePay googlePay, PhonePay phonePay) {
		super();
		this.googlePay = googlePay;
		this.phonePay = phonePay;
	}

	public Payment getProcessPayment(String paymentType) {
		switch(paymentType.toLowerCase()) {
		case "googlepay":
			return googlePay;
		case "phonepay":
			return phonePay;
		default:
			throw new IllegalArgumentException("Invalid Payment Type");
		}
}

}

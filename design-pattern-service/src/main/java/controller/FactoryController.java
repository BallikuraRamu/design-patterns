package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import component.PaymentProcessorFactory;
import interfaces.Payment;

@RestController
public class FactoryController {

	private final PaymentProcessorFactory paymentProcessorFactory;

	private FactoryController(PaymentProcessorFactory paymentProcessorFactory) {
		super();
		this.paymentProcessorFactory = paymentProcessorFactory;
	}
	
	
	@GetMapping("/select/payment")
	public Payment processPayment(@RequestParam String paymentType) {
		Payment payment = paymentProcessorFactory.getProcessPayment(paymentType);
		payment.processPayment(130);
		return payment;
	}
}

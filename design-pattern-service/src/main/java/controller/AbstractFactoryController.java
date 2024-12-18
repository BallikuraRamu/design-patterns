package controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.PaymentProcessorService;

@RestController
@RequestMapping("/api")
public class AbstractFactoryController {

	private final PaymentProcessorService paymentProcessorService;

	private AbstractFactoryController(PaymentProcessorService paymentProcessorService) {
		super();
		this.paymentProcessorService = paymentProcessorService;
	}

	@PostMapping("/process")
	public ResponseEntity<String> getPaymentProcess(@RequestParam double amount) {
		String response = paymentProcessorService.processPayment(amount);
		return ResponseEntity.ok(response);
	}

	@PostMapping("/refund")
	public ResponseEntity<String> processRefund(@RequestParam double amount) {
		String reponse = paymentProcessorService.refundPayment(amount);
		return ResponseEntity.ok(reponse);
	}

}

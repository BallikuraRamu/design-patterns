package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import service.SingletonLoggerService;

@RestController
public class LoggingController {

	
    private final SingletonLoggerService singletonLoggerService;

	private LoggingController(SingletonLoggerService singletonLoggerService) {
		super();
		this.singletonLoggerService = singletonLoggerService;
	}

	@GetMapping("/log")
    public String logMessage(@RequestParam String message) {
        singletonLoggerService.logMessage(message);
        return "Message logged successfully!";
    }
    
}

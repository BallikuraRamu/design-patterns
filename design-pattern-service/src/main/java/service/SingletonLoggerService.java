package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SingletonLoggerService {

    private static final Logger logger = LoggerFactory.getLogger(SingletonLoggerService.class);

	public SingletonLoggerService() {
		System.out.println("SingletonLoggerService instainciated ");
	}

	public void logMessage(String message) {
		logger.info("Log message: {}", message);
		
	}
}

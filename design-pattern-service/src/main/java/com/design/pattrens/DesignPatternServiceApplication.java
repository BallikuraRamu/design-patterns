package com.design.pattrens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "component", "controller", "interfaces", "service" })
public class DesignPatternServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternServiceApplication.class, args);
	}

}

package com.telnet.prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class PrometheusApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SpringApplication.run(PrometheusApplication.class, args);
	}
}

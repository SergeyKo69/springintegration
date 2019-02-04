package ru.kogut.enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@IntegrationComponentScan
public class SpringintegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringintegrationApplication.class, args);
	}

}


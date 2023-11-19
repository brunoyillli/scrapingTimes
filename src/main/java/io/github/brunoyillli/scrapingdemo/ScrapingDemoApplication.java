package io.github.brunoyillli.scrapingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScrapingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrapingDemoApplication.class, args);
	}

}

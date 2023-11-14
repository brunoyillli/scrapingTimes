package io.github.brunoyillli.scrapingdemo;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.brunoyillli.scrapingdemo.controller.ScrapingController;

@SpringBootApplication
public class ScrapingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrapingDemoApplication.class, args);
		ScrapingController controller = new ScrapingController();
		try {
			controller.raspagemClassificacaoBrasileirao("https://pt.besoccer.com/competicao/tabela/serie_a_brazil/2022");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

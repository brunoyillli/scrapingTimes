package io.github.brunoyillli.scrapingdemo.resource;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.brunoyillli.scrapingdemo.model.Time;
import io.github.brunoyillli.scrapingdemo.service.scraping.CampeonatosStatsScraper;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatosResource {

	@Autowired
	private CampeonatosStatsScraper scraper;


	@GetMapping("/classificacao")
	public List<Time> getClassificacaoGeral(@RequestParam String campeonato, @RequestParam String ano) throws IOException {
		return scraper.raspagemClassificacaoGeral(campeonato, ano);
	}
}

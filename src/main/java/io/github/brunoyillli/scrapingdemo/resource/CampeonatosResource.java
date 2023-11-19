package io.github.brunoyillli.scrapingdemo.resource;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.brunoyillli.scrapingdemo.automation.EstatisticasExtractorBot;
import io.github.brunoyillli.scrapingdemo.model.Time;
import io.github.brunoyillli.scrapingdemo.service.scraping.CampeonatosStatsScraper;

@RestController
@RequestMapping("/campeonatos")
public class CampeonatosResource {

	@Autowired
	private CampeonatosStatsScraper scraper;

	@Autowired
	private EstatisticasExtractorBot bot;

	@GetMapping("/classificacao")
	public List<Time> getClassificacaoGeral(@RequestParam String campeonato, @RequestParam String ano) throws IOException {
		bot.capturarLinks();
		return scraper.raspagemClassificacaoGeral(campeonato, ano);
	}
}

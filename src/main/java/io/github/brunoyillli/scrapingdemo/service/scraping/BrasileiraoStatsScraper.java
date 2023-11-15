package io.github.brunoyillli.scrapingdemo.service.scraping;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import io.github.brunoyillli.scrapingdemo.model.Time;

@Component
public class BrasileiraoStatsScraper {

	public BrasileiraoStatsScraper() {
		super();
	}

	public List<Time> raspagemClassificacaoGeral(String ano) throws IOException {
		List<Time> timesBrasileirao = new ArrayList<>();
		URL url = new URL("https://pt.besoccer.com/competicao/tabela/serie_a_brazil/"+ ano);
		Document doc = Jsoup.parse(url, 30000);
		
		for(int i = 2; i <= 21 ; i++) {
			Time time = new Time();
			time.setNome(nomeTime(doc, i));
			time.setPontos(pontosTime(doc,i));
			time.setJogos(jogosTime(doc, i));
			time.setEmpates(empatesTime(doc, i));
			time.setDerrotas(derrotasTime(doc, i));
			time.setGolsMarcados(golsMarcadosTime(doc, i));
			time.setSaldoGols(saldoDeGolsTime(doc, i));
			time.setGolsContra(golsContraTime(doc, i));
			time.setClassificacao(String.valueOf(i-1));
			time.setPartidasJogadas(partidasJogadas(doc, i));
			time.setVitorias(calcularVitorias(time));
			timesBrasileirao.add(time);
			System.out.println(time.toString());
		}
		return timesBrasileirao;
	}

	private String calcularVitorias(Time time) {
		int empates = Integer.parseInt(time.getEmpates());
		int derrotas = Integer.parseInt(time.getDerrotas());
		int partidasJogadas = Integer.parseInt(time.getPartidasJogadas());
		int vitorias = partidasJogadas - (derrotas + empates);
		return String.valueOf(vitorias);
	}

	private String pontosTime(Document doc, int timeAtual) {
		String esquerdaCssQuery = "html > body > main > section:nth-of-type(3) > div >"
				+ " div:nth-of-type(6) > div:nth-of-type(2) > div:nth-of-type(2) > div > "
				+ "div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(";
		String direitaCssQuery = ") > td:nth-of-type(4)";
		Elements element = doc.select(esquerdaCssQuery + timeAtual + direitaCssQuery);
		return element.text();
	}

	private String nomeTime(Document doc, int timeAtual) {
		String esquerdaCssQuery = "html > body > main > section:nth-of-type(3) > div > div:nth-of-type(6) > "
				+ "div:nth-of-type(2) > div:nth-of-type(2) > div > div:nth-of-type(2) > "
				+ "div > div > table > tbody > tr:nth-of-type(";
		String direitaCssQuery = ") > td:nth-of-type(3) > a > span";
		Elements element = doc.select(esquerdaCssQuery + timeAtual + direitaCssQuery);
		return element.text();
	}
	
	private String jogosTime(Document doc, int timeAtual) {
		String esquerdaCssQuery = "html > body > main > section:nth-of-type(3) > div >"
				+ " div:nth-of-type(6) > div:nth-of-type(2) > div:nth-of-type(2) > div > "
				+ "div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(";
		String direitaCssQuery = ") > td:nth-of-type(6)";
		Elements element = doc.select(esquerdaCssQuery + timeAtual + direitaCssQuery);
		return element.text();
	}
	
	private String empatesTime(Document doc, int timeAtual) {
		String esquerdaCssQuery = "html > body > main > section:nth-of-type(3) > div >"
				+ " div:nth-of-type(6) > div:nth-of-type(2) > div:nth-of-type(2) > div > "
				+ "div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(";
		String direitaCssQuery = ") > td:nth-of-type(7)";
		Elements element = doc.select(esquerdaCssQuery + timeAtual + direitaCssQuery);
		return element.text();
	}
	
	private String derrotasTime(Document doc, int timeAtual) {
		String esquerdaCssQuery = "html > body > main > section:nth-of-type(3) > div >"
				+ " div:nth-of-type(6) > div:nth-of-type(2) > div:nth-of-type(2) > div > "
				+ "div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(";
		String direitaCssQuery = ") > td:nth-of-type(8)";
		Elements element = doc.select(esquerdaCssQuery + timeAtual + direitaCssQuery);
		return element.text();
	}
	
	private String golsMarcadosTime(Document doc, int timeAtual) {
		String esquerdaCssQuery = "html > body > main > section:nth-of-type(3) > div >"
				+ " div:nth-of-type(6) > div:nth-of-type(2) > div:nth-of-type(2) > div > "
				+ "div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(";
		String direitaCssQuery = ") > td:nth-of-type(9)";
		Elements element = doc.select(esquerdaCssQuery + timeAtual + direitaCssQuery);
		return element.text();
	}
	
	private String golsContraTime(Document doc, int timeAtual) {
		String esquerdaCssQuery = "html > body > main > section:nth-of-type(3) > div >"
				+ " div:nth-of-type(6) > div:nth-of-type(2) > div:nth-of-type(2) > div > "
				+ "div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(";
		String direitaCssQuery = ") > td:nth-of-type(10)";
		Elements element = doc.select(esquerdaCssQuery + timeAtual + direitaCssQuery);
		return element.text();
	}
	
	private String saldoDeGolsTime(Document doc, int timeAtual) {
		String esquerdaCssQuery = "html > body > main > section:nth-of-type(3) > div >"
				+ " div:nth-of-type(6) > div:nth-of-type(2) > div:nth-of-type(2) > div > "
				+ "div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(";
		String direitaCssQuery = ") > td:nth-of-type(11)";
		Elements element = doc.select(esquerdaCssQuery + timeAtual + direitaCssQuery);
		return element.text();
	}
	
	private String partidasJogadas(Document doc, int timeAtual) {
		String esquerdaCssQuery = "html > body > main > section:nth-of-type(3) > div >"
				+ " div:nth-of-type(6) > div:nth-of-type(2) > div:nth-of-type(2) > div > "
				+ "div:nth-of-type(2) > div > div > table > tbody > tr:nth-of-type(";
		String direitaCssQuery = ") > td:nth-of-type(5)";
		Elements element = doc.select(esquerdaCssQuery + timeAtual + direitaCssQuery);
		return element.text();
	}
}

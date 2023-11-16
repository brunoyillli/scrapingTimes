package io.github.brunoyillli.scrapingdemo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.brunoyillli.scrapingdemo.model.Time;
import io.github.brunoyillli.scrapingdemo.repository.TimeRepository;
import io.github.brunoyillli.scrapingdemo.service.BrasileiraoService;

@Service
public class BrasileiraoServiceImpl implements BrasileiraoService{

	@Autowired
	private TimeRepository timeRepository;
	
	@Override
	public List<Time> saveAllTimes(List<Time> times) {
		String ano = "0000";
		String campeonato = "nenhum";
		
		Optional<Time> timeEncontrado = times.stream().findFirst();
		if(timeEncontrado.isPresent()) {
			ano = timeEncontrado.get().getAno();
			campeonato = timeEncontrado.get().getCampeonato();
		}

		if(timeRepository.existsByCampeonatoAndAno(campeonato, ano)) {
			return times;
		}else {
			return times.stream()
	                .map(timeRepository::save)
	                .collect(Collectors.toList());
		}
	}

}

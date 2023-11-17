package io.github.brunoyillli.scrapingdemo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.brunoyillli.scrapingdemo.model.Campeonato;
import io.github.brunoyillli.scrapingdemo.model.Time;
import io.github.brunoyillli.scrapingdemo.repository.CampeonatoRepository;
import io.github.brunoyillli.scrapingdemo.repository.TimeRepository;
import io.github.brunoyillli.scrapingdemo.service.CampeonatoService;

@Service
public class CampeonatoServiceImpl implements CampeonatoService{

	@Autowired
	private TimeRepository timeRepository;
	
	@Autowired
	private CampeonatoRepository campeonatoRepository;
	
	@Override
	public List<Time> saveAllTimes(List<Time> times) {
		String ano = "0000";
		String campeonato = "nenhum";
		
		Optional<Campeonato> campeonatoOptional = times.stream()
                .map(Time::getCampeonato)
                .findFirst();
		
		if(campeonatoOptional.isPresent()) {
			ano = campeonatoOptional.get().getAno();
			campeonato = campeonatoOptional.get().getNome();
		}else {
			return times;
		}

		if(campeonatoRepository.existsByNomeAndAno(campeonato, ano)) {
			return times;
		}else {
			
			Campeonato campeonatoPersistido = campeonatoRepository.findByNomeAndAno(campeonato, ano)
	                .orElse(campeonatoRepository.save(campeonatoOptional.get()));
	        
			times.forEach(time -> time.setCampeonato(campeonatoPersistido));

			return times.stream()
	                .map(timeRepository::save)
	                .collect(Collectors.toList());
		}
	}

}

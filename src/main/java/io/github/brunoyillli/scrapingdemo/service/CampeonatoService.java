package io.github.brunoyillli.scrapingdemo.service;

import java.util.List;

import io.github.brunoyillli.scrapingdemo.model.Time;

public interface CampeonatoService {
	
	public List<Time> saveAllTimes(List<Time> times);
}

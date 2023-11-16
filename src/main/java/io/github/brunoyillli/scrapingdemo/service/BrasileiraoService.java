package io.github.brunoyillli.scrapingdemo.service;

import java.util.List;

import io.github.brunoyillli.scrapingdemo.model.Time;

public interface BrasileiraoService {
	
	public List<Time> saveAllTimes(List<Time> times);
}

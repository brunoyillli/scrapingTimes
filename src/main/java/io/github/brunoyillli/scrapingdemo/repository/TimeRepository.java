package io.github.brunoyillli.scrapingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.brunoyillli.scrapingdemo.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, String>{

}

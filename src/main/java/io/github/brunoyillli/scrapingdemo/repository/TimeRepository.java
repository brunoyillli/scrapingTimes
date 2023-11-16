package io.github.brunoyillli.scrapingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.github.brunoyillli.scrapingdemo.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, String>{

	 @Query("SELECT COUNT(t) > 0 FROM Time t WHERE t.campeonato = :campeonato AND t.ano = :ano")
	 boolean existsByCampeonatoAndAno(String campeonato, String ano);
}

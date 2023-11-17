package io.github.brunoyillli.scrapingdemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.github.brunoyillli.scrapingdemo.model.Campeonato;

public interface CampeonatoRepository extends JpaRepository<Campeonato, Integer>{
	
	@Query("SELECT COUNT(c) > 0 from Campeonato c WHERE c.nome = :nome AND c.ano = :ano")
	boolean existsByNomeAndAno(String nome, String ano);

	@Query("SELECT c FROM Campeonato c WHERE c.nome = :nome AND c.ano = :ano")
	Optional<Campeonato> findByNomeAndAno(String nome, String ano);
}

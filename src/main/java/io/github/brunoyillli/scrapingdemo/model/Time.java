package io.github.brunoyillli.scrapingdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "time")
public class Time {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    @Column(name = "nome")
	private String nome;
	
    @Column(name = "partidas_jogadas")
	private String partidasJogadas;
    
    @Column(name = "pontos")
	private String pontos;
    
    @Column(name = "jogos")
	private String jogos;
    
    @Column(name = "vitorias")
	private String vitorias;
    
    @Column(name = "empates")
	private String empates;
    
    @Column(name = "derrotas")
	private String derrotas;
    
    @Column(name = "gols_marcados")
	private String golsMarcados;
	
    @Column(name = "gols_contra")
	private String golsContra;
	
    @Column(name = "saldo_gols")
	private String saldoGols;
	
    @Column(name = "classificacao")
	private String classificacao;
    
    @Column(name = "campeonato")
    private String campeonato;
    
    @Column(name = "ano")
    private String ano;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPontos() {
		return pontos;
	}

	public void setPontos(String pontos) {
		this.pontos = pontos;
	}

	public String getJogos() {
		return jogos;
	}

	public void setJogos(String jogos) {
		this.jogos = jogos;
	}

	public String getVitorias() {
		return vitorias;
	}

	public void setVitorias(String vitorias) {
		this.vitorias = vitorias;
	}

	public String getEmpates() {
		return empates;
	}

	public void setEmpates(String empates) {
		this.empates = empates;
	}

	public String getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(String derrotas) {
		this.derrotas = derrotas;
	}

	public String getGolsMarcados() {
		return golsMarcados;
	}

	public void setGolsMarcados(String golsMarcados) {
		this.golsMarcados = golsMarcados;
	}

	public String getGolsContra() {
		return golsContra;
	}

	public void setGolsContra(String golsContra) {
		this.golsContra = golsContra;
	}

	public String getSaldoGols() {
		return saldoGols;
	}

	public void setSaldoGols(String saldoGols) {
		this.saldoGols = saldoGols;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getPartidasJogadas() {
		return partidasJogadas;
	}

	public void setPartidasJogadas(String partidasJogadas) {
		this.partidasJogadas = partidasJogadas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(String campeonato) {
		this.campeonato = campeonato;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Time [id=" + id + ", nome=" + nome + ", partidasJogadas=" + partidasJogadas + ", pontos=" + pontos
				+ ", jogos=" + jogos + ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas
				+ ", golsMarcados=" + golsMarcados + ", golsContra=" + golsContra + ", saldoGols=" + saldoGols
				+ ", classificacao=" + classificacao + ", campeonato=" + campeonato + ", ano=" + ano + "]";
	}

	

}

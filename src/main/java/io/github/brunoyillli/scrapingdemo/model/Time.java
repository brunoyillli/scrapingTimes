package io.github.brunoyillli.scrapingdemo.model;

public class Time {
	private String nome;
	private String partidasJogadas;
	private String pontos;
	private String jogos;
	private String vitorias;
	private String empates;
	private String derrotas;
	private String golsMarcados;
	private String golsContra;
	private String saldoGols;
	private String classificacao;

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

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", partidasJogadas=" + partidasJogadas + ", pontos=" + pontos + ", jogos=" + jogos
				+ ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas + ", golsMarcados="
				+ golsMarcados + ", golsContra=" + golsContra + ", saldoGols=" + saldoGols + ", classificacao="
				+ classificacao + "]";
	}

}

package com.project.nebulosa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class FatosInformacao {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeObrservacao;
	private Double tempoDeObservacao;
	private String codigoDeCores;
	private Long estimativaDeDistanciaEmLuz;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataDeObrservacao() {
		return dataDeObrservacao;
	}
	public void setDataDeObrservacao(Date dataDeObrservacao) {
		this.dataDeObrservacao = dataDeObrservacao;
	}
	public Double getTempoDeObservacao() {
		return tempoDeObservacao;
	}
	public void setTempoDeObservacao(Double tempoDeObservacao) {
		this.tempoDeObservacao = tempoDeObservacao;
	}
	public String getCodigoDeCores() {
		return codigoDeCores;
	}
	public void setCodigoDeCores(String codigoDeCores) {
		this.codigoDeCores = codigoDeCores;
	}
	public Long getEstimativaDeDistanciaEmLuz() {
		return estimativaDeDistanciaEmLuz;
	}
	public void setEstimativaDeDistanciaEmLuz(Long estimativaDeDistanciaEmLuz) {
		this.estimativaDeDistanciaEmLuz = estimativaDeDistanciaEmLuz;
	}
	
	
	
}

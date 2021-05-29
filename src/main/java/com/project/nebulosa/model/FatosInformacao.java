package com.project.nebulosa.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class FatosInformacao {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeObrservacao;
	
	private Double tempoDeObservacao;
	
	@NotBlank
	@NotEmpty(message = "{campo.fatosInformacao.codigoCores}")
	private String codigoDeCores;
	private Double estimativaDeDistanciaEmLuz;
	
	@ManyToOne
	private Nebulosa nebulosa;
	
	@JsonIgnore
	public Nebulosa getNebulosa() {
		return nebulosa;
	}
	public void setNebulosa(Nebulosa nebulosa) {
		this.nebulosa = nebulosa;
	}
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
	public Double getEstimativaDeDistanciaEmLuz() {
		return estimativaDeDistanciaEmLuz;
	}
	public void setEstimativaDeDistanciaEmLuz(Double estimativaDeDistanciaEmLuz) {
		this.estimativaDeDistanciaEmLuz = estimativaDeDistanciaEmLuz;
	}
	
	
	
}

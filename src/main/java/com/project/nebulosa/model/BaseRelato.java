package com.project.nebulosa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BaseRelato {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String coDeNome;
	private String instrumento; 
	private Long dataDeLancamento;
	private String creditos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCoDeNome() {
		return coDeNome;
	}
	public void setCoDeNome(String coDeNome) {
		this.coDeNome = coDeNome;
	}
	public String getInstrumento() {
		return instrumento;
	}
	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}
	public Long getDataDeLancamento() {
		return dataDeLancamento;
	}
	public void setDataDeLancamento(Long dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}
	public String getCreditos() {
		return creditos;
	}
	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}
	
	
}

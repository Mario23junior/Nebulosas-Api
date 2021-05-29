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
public class BaseRelato {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	@NotEmpty(message = "{campo.BaseRelato.coDeNome}")
	private String coDeNome;
	
	@NotBlank
	@NotEmpty(message = "{campo.BaseRelato.instrumento}")
	private String instrumento;
	
	 
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeLancamento;
	
	@NotBlank
	@NotEmpty(message = "{campo.BaseRelato.creditos}")
	private String creditos;
	
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
	public Date getDataDeLancamento() {
		return dataDeLancamento;
	}
	public void setDataDeLancamento(Date dataDeLancamento) {
		this.dataDeLancamento = dataDeLancamento;
	}
	public String getCreditos() {
		return creditos;
	}
	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}
	
	
	
	
}

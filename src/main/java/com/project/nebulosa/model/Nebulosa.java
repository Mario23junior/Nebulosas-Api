package com.project.nebulosa.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class Nebulosa {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty(message = "{campo.nebulosa.urlImage}")
	private String urlImage;
	
	@NotEmpty(message = "{campo.nebulosa.nome}")
	private String nome;
	
	@NotEmpty(message = "{campo.nebulosa.costelacao}")
	private String costelacao;
	private Double escala;
	
	@NotEmpty(message = "{campo.nebulosa.categoria}")
	private String categoria;
	
	@OneToMany(mappedBy = "nebulosa", cascade = CascadeType.ALL)
	private List<FatosInformacao> fatosInformacao;
	
	@OneToMany(mappedBy = "nebulosa", cascade = CascadeType.ALL)
	private List<BaseRelato> baseRelato;
	
	public List<FatosInformacao> getFatosInformacao() {
		return fatosInformacao;
	}
	public void setFatosInformacao(List<FatosInformacao> fatosInformacao) {
		this.fatosInformacao = fatosInformacao;
	}
	public List<BaseRelato> getBaseRelato() {
		return baseRelato;
	}
	public void setBaseRelato(List<BaseRelato> baseRelato) {
		this.baseRelato = baseRelato;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCostelacao() {
		return costelacao;
	}
	public void setCostelacao(String costelacao) {
		this.costelacao = costelacao;
	}
	public Double getEscala() {
		return escala;
	}
	public void setEscala(Double escala) {
		this.escala = escala;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}

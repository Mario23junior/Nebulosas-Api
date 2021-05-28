package ModelDTO;

import java.util.List;

public class NebulosaDTO {
 
 	private Long id;
	private String urlImage;
	private String nome;
	private String costelacao;
	private Double escala;
	private String categoria;
	
 	private List<FatosInformacaoDTO> fatosInformacaoDto;	
 	private List<BaseRelatoDTO> baseRelatoDto;
 	
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
	public List<FatosInformacaoDTO> getFatosInformacaoDto() {
		return fatosInformacaoDto;
	}
	public void setFatosInformacaoDto(List<FatosInformacaoDTO> fatosInformacaoDto) {
		this.fatosInformacaoDto = fatosInformacaoDto;
	}
	public List<BaseRelatoDTO> getBaseRelatoDto() {
		return baseRelatoDto;
	}
	public void setBaseRelatoDto(List<BaseRelatoDTO> baseRelatoDto) {
		this.baseRelatoDto = baseRelatoDto;
	}
}

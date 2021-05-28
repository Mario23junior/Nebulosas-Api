package ModelDTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.nebulosa.model.Nebulosa;

public class FatosInformacaoDTO {
    
	private Long id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeObrservacao;
	private Double tempoDeObservacao;
	private String codigoDeCores;
	private Double estimativaDeDistanciaEmLuz;
	
 	private Nebulosa nebulosa;

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

	public Nebulosa getNebulosa() {
		return nebulosa;
	}

	public void setNebulosa(Nebulosa nebulosa) {
		this.nebulosa = nebulosa;
	}		
}

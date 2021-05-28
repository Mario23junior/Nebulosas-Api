package ModelDTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.project.nebulosa.model.Nebulosa;

public class BaseRelatoDTO {
    
	private Long id;
	private String coDeNome;
	private String instrumento;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeLancamento;
	private String creditos;	
	private Nebulosa nebulosa;
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
	public Nebulosa getNebulosa() {
		return nebulosa;
	}
	public void setNebulosa(Nebulosa nebulosa) {
		this.nebulosa = nebulosa;
	}
	
	
}

package corp.formulacerta.integracao.mirror.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOG_CONSULTA_FORMULA_CERTA")
public class LogConsultaFormulaCerta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "DATA_EXEC")
	private Date dataExec;

	@Column(name = "RECORD_FOUND")
	private Boolean recordFound;

	@Column(name = "LAST_IMPORTED_ID")
	private Integer lastImportedId;
	
	public LogConsultaFormulaCerta() {
		super();
	}

	public LogConsultaFormulaCerta(Date dataExec, Boolean recordFound, Integer lastImportedId) {
		this.dataExec = dataExec;
		this.recordFound = recordFound;
		this.lastImportedId = lastImportedId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataExec() {
		return dataExec;
	}

	public void setDataExec(Date dataExec) {
		this.dataExec = dataExec;
	}

	public Boolean getRecordFound() {
		return recordFound;
	}

	public void setRecordFound(Boolean recordFound) {
		this.recordFound = recordFound;
	}

	public Integer getLastImportedId() {
		return lastImportedId;
	}

	public void setLastImportedId(Integer lastImportedId) {
		this.lastImportedId = lastImportedId;
	}

	public interface OnlyLastImportedIdInterface {
		Integer getLastImportedId();
	}
}

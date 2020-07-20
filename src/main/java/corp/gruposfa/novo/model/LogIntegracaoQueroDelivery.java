package corp.gruposfa.novo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import corp.gruposfa.novo.consinco.enumeration.TipoLogIntegracaoEnum;

@Entity
@Table(name = "NVO_LOG_INTEGRACAO_QUERO_DELIVERY")
public class LogIntegracaoQueroDelivery implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "DATA")
	private Date data;

	@Column(name = "TIPO_LOG")
	@Enumerated(EnumType.STRING)
	private TipoLogIntegracaoEnum tipoLog;
	
	@Column(name = "HISTORICO")
	private String historico;

	@Column(name = "NOME_PRODUTO")
	private String nomeProduto;
	
	@Column(name = "COD_BARRAS")
	private String codBarras;

	@Column(name = "NOME_CATEGORIA")
	private String nomeCategoria;
	
	@Column(name = "AMBIENTE")
	private String ambiente;
	
	@Column(name = "COD_LOJA")
	private Integer codLoja;
	
	public LogIntegracaoQueroDelivery() {
	}
	
	public LogIntegracaoQueroDelivery(Date data, TipoLogIntegracaoEnum tipoLog, String historico, String codBarras,
			String nomeCategoria, String nomeProduto,String ambiente, Integer codLoja) {
		this.data = data;
		this.tipoLog = tipoLog;
		this.historico = historico;
		this.codBarras = codBarras;
		this.nomeCategoria = nomeCategoria;
		this.nomeProduto = nomeProduto;
		this.ambiente = ambiente;
		this.codLoja = codLoja;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public TipoLogIntegracaoEnum getTipoLog() {
		return tipoLog;
	}

	public void setTipoLog(TipoLogIntegracaoEnum tipoLog) {
		this.tipoLog = tipoLog;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public Integer getCodLoja() {
		return codLoja;
	}

	public void setCodLoja(Integer codLoja) {
		this.codLoja = codLoja;
	}
	
}
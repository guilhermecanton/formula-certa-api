package corp.gruposfa.novo.consinco.enumeration;

public enum TipoLogIntegracaoEnum {

	ADICIONAR_CATEGORIA("Adicionar categoria"),
	INATIVAR_CATEGORIA("Inativar categoria"),
	ADICIONAR_PRODUTO("Adicionar produto"),
	ATUALIZAR_ESTOQUE_PRODUTO("Atualizar estoque"),
	ATUALIZAR_PRECO_PRODUTO("Atualizar preço"),
	ATUALIZAR_STATUS_PRODUTO("Atualizar status"),
	ATUALIZAR_DESCRICAO_PRODUTO("Atualizar descrição");
	
	private String descricao;

	private TipoLogIntegracaoEnum(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setD(String descricao) {
		this.descricao = descricao;
	}
	
}

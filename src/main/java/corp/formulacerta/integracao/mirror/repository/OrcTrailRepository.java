package corp.formulacerta.integracao.mirror.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import corp.formulacerta.integracao.mirror.model.OrcTrail;
import corp.formulacerta.integracao.model.dto.OrcamentoDTO;
import feign.Param;

@Repository
public interface OrcTrailRepository extends JpaRepository<OrcTrail, Integer> {

	@Query("select new corp.formulacerta.integracao.model.dto.OrcamentoDTO(o.numOrcamento, o.descricaoSimples, o.codFormaFarmaceutica, o.formaFarmaceutica, o.preco, o.precoOferta, o.dataEntrada, o.quantidade, o.unidade, o.idProdutoTray) from OrcTrail o")
	List<OrcamentoDTO> buscarTodos();
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE ORCAMENTO SET ID_PRODUTO_TRAY = :idProdutoTray WHERE ID = :id", nativeQuery = true)
	void updateIdProdutoTray(@Param("id") Integer id, @Param("idProdutoTray") String idProdutoTray);
	
}

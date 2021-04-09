package com.cultivar.armazemNatural.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cultivar.armazemNatural.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
	public List<Produto> findAllByMarcaContainingIgnoreCase(String marca);
	public List<Produto> findAllByFornecedorContainingIgnoreCase(String fornecedor);

}

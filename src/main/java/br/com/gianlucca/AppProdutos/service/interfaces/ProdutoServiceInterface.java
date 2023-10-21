package br.com.gianlucca.AppProdutos.service.interfaces;

import java.util.List;
import java.util.Optional;

import br.com.gianlucca.AppProdutos.model.Produto;

public interface ProdutoServiceInterface {
	Produto saveProduto(Produto produto);
	Optional<Produto> getById(Long id);
	List<Produto> getAll();
	Produto update(Produto produto);
	void delete(long id);
}

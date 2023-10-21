package br.com.gianlucca.AppProdutos.service.interfaces;

import java.util.List;
import java.util.Optional;

import br.com.gianlucca.AppProdutos.model.Estoque;

public interface EstoqueServiceInterface {
	Estoque saveProduto(Estoque estoque);
	Optional<Estoque> getById(Long id);
	List<Estoque> getAll();
	Estoque update(Estoque estoque);
	void delete(long id);
	Estoque addQuantidade(Long id, int quantidade);
	Estoque delQuantidade(Long id, int quantidade);
}
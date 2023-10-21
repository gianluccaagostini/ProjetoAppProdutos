package br.com.gianlucca.AppProdutos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gianlucca.AppProdutos.model.Produto;
import br.com.gianlucca.AppProdutos.repository.ProdutoRepository;
import br.com.gianlucca.AppProdutos.service.interfaces.ProdutoServiceInterface;

@Service
public class ProdutoService implements ProdutoServiceInterface {

	private ProdutoRepository produtoRepository;
	
	@Autowired
	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	@Override
	public Produto saveProduto(Produto produto) {
		return produtoRepository.save(produto);
		
	}

	@Override
	public Optional<Produto> getById(Long id) {
		return produtoRepository.findById(id);
	}

	@Override
	public List<Produto> getAll() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto update(Produto produto) {
		//Busca produto
		Optional<Produto> upProduto = produtoRepository.findById(produto.getId());
		
		//Se ele existir, atualizar:
		if(upProduto.isPresent()) {
			Produto newProduto = upProduto.get();
			newProduto.setCodigoBarras(produto.getCodigoBarras());
			newProduto.setNome(produto.getNome());
			newProduto.setPreco(produto.getPreco());
			return produtoRepository.save(newProduto);
		}
		return produto;
	}

	@Override
	public void delete(long id) {
		produtoRepository.deleteById(id);
		
	}
	
}

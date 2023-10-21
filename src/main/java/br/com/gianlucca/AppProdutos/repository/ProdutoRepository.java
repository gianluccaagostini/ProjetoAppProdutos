package br.com.gianlucca.AppProdutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.gianlucca.AppProdutos.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
}

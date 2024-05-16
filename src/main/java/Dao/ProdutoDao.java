package Dao;

import Produtos.Produtos;
import jakarta.persistence.EntityManager;

public class ProdutoDao {

	private EntityManager var;

	public ProdutoDao(EntityManager entityManager){
		this.var = entityManager;
	}

	public void cadastraProduto(Produtos produtos){
		this.var.persist(produtos);
	}
}

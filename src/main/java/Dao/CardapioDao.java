package Dao;

import Produto.Produto;
import jakarta.persistence.EntityManager;

public class CardapioDao {
	private EntityManager var;

	public CardapioDao(EntityManager connection){
		this.var = connection;
	}
	public void cadastrar(Produto value){
		this.var.persist(value);
	}
}

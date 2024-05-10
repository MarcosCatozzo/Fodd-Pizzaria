package Dao;

import Produto.Cardapio;
import jakarta.persistence.EntityManager;

public class CardapioDao {
	private EntityManager var;

	public CardapioDao(EntityManager connection){
		this.var = connection;
	}
	public void cadastrar(Cardapio value){
		this.var.persist(value);
	}
}

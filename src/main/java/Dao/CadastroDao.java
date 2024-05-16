package Dao;

import CadastroCliente.Cadastro;
import jakarta.persistence.EntityManager;

public class CadastroDao {

	private EntityManager var;

	public CadastroDao(){

	}

	public CadastroDao(EntityManager entityManager) {
		this.var = entityManager;
	}

	public void cadastrar(Cadastro cadastro) {
		this.var.persist(cadastro);
	}

}

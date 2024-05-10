package Dao;

import CadastroCliente.Cadastro;
import jakarta.persistence.EntityManager;

public class CadastroDao {
	private EntityManager var;

	public CadastroDao(EntityManager value){
		this.var = value;
	}

	public void CadastrarCliente(Cadastro value){
		this.var.persist(value);
	}
}

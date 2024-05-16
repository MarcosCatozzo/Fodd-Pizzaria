package Dao;

import CadastroCliente.Cadastro;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CadastroDao {

	private EntityManager var;

	public CadastroDao() {

	}

	public CadastroDao(EntityManager entityManager) {
		this.var = entityManager;
	}

	public void cadastrar(Cadastro cadastro) {
		this.var.persist(cadastro);
	}

	public Cadastro buscarPorId(Long id){
		return var.find(Cadastro.class, id);
	}

	public List<Cadastro> buscarNomes(){
		String jpql = "SELECT n FROM Cadastro n";
		return var.createQuery(jpql, Cadastro.class).getResultList();
	}
}

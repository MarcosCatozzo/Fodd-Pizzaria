import CadastroCliente.Cadastro;
import Dao.CadastroDao;
import JPAUtil.JPAUtil;
import jakarta.persistence.EntityManager;
import org.hibernate.event.spi.SaveOrUpdateEvent;

import java.util.List;

public class CadastroTest {

	public static void main(String[] args) {

		cadastroDeCliente();

		EntityManager entityManager = JPAUtil.getEntitymanager();
		CadastroDao cadastroDao = new CadastroDao(entityManager);

		Cadastro p = cadastroDao.buscarPorId(16l);
		System.out.println(p.getEndereco() + p.getNome());

		List<Cadastro> todos = cadastroDao.buscarNomes();
		todos.forEach(p1 -> System.out.println(p.getNome()));

	}

	private static void cadastroDeCliente() {
		Cadastro cadastro = new Cadastro();
		cadastro.setNome("MARTA");
		cadastro.setTelefone("1111-1111");
		cadastro.setEndereco("RUA VALE");

		EntityManager entityManager = JPAUtil.getEntitymanager();
		CadastroDao cadastroDao = new CadastroDao(entityManager);

		entityManager.getTransaction().begin();
		entityManager.persist(cadastro);
		cadastroDao.cadastrar(cadastro);
		entityManager.getTransaction().commit();
		entityManager.close();

		Cadastro cadastro1 = new Cadastro();
		cadastro1.setNome("PAULO");
		cadastro1.setTelefone("2222-2222");
		cadastro1.setEndereco("RUA 1");

		EntityManager entityManager1 = JPAUtil.getEntitymanager();
		CadastroDao cadastroDao1 = new CadastroDao(entityManager1);

		entityManager1.getTransaction().begin();
		entityManager1.persist(cadastro1);
		cadastroDao1.cadastrar(cadastro1);
		entityManager1.getTransaction().commit();
		entityManager1.close();
	}
}

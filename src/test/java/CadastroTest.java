import CadastroCliente.Cadastro;
import Dao.CadastroDao;
import JPAUtil.JPAUtil;
import jakarta.persistence.EntityManager;
import org.hibernate.metamodel.spi.ValueAccess;

public class CadastroTest {

	public static void main(String[] args) {
		Cadastro cliente = new Cadastro();
		cliente.setNome("JOAO");
		cliente.setEndereco("RUA VALE");
		cliente.setTelefone("9999-9999");

		EntityManager var = JPAUtil.getEntitymanager();
		CadastroDao c = new CadastroDao(var);

		var.getTransaction().begin();
		var.persist(cliente);
		c.CadastrarCliente(cliente);
		var.getTransaction().commit();
		var.close();
	}
}

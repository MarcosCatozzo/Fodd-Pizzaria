import Dao.CardapioDao;
import JPAUtil.JPAUtil;
import Produto.Produto;
import jakarta.persistence.EntityManager;

public class ProdutoTest {

	public static void main(String[] args) {
		Produto cardapio = new Produto("Mussarela",30);

		EntityManager var = JPAUtil.getEntitymanager();
		CardapioDao cardapioDao = new CardapioDao(var);

		var.getTransaction().begin();
		var.persist(cardapio);
		cardapioDao.cadastrar(cardapio);
		var.getTransaction().commit();
		var.close();

	}
}

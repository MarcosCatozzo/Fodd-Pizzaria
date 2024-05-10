import Dao.CardapioDao;
import JPAUtil.JPAUtil;
import Produto.Cardapio;
import jakarta.persistence.EntityManager;

public class CardapioTest {

	public static void main(String[] args) {
		Cardapio cardapio = new Cardapio();
		cardapio.setNome("Calabresa");
		cardapio.setPreco(30);

		EntityManager var = JPAUtil.getEntitymanager();
		CardapioDao cardapioDao = new CardapioDao(var);

		var.getTransaction().begin();
		var.persist(cardapio);
		cardapioDao.cadastrar(cardapio);
		var.getTransaction().commit();
		var.close();

	}
}

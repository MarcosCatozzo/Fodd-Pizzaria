import Dao.ProdutoDao;
import JPAUtil.JPAUtil;
import Produtos.Produtos;
import jakarta.persistence.EntityManager;

public class ProdutosTest {

	public static void main(String[] args) {

		Produtos produtos = new Produtos("Mussarela",30);

		EntityManager entityManager = JPAUtil.getEntitymanager();
		ProdutoDao produtoDao = new ProdutoDao(entityManager);

		entityManager.getTransaction().begin();
		entityManager.persist(produtos);
		produtoDao.cadastraProduto(produtos);
		entityManager.getTransaction().commit();
		entityManager.clear();

		Produtos produtos1 = new Produtos("Calabresa",30);

		EntityManager entityManager1 = JPAUtil.getEntitymanager();
		ProdutoDao produtoDao1 = new ProdutoDao(entityManager1);

		entityManager1.getTransaction().begin();
		entityManager1.persist(produtos1);
		produtoDao1.cadastraProduto(produtos1);
		entityManager1.getTransaction().commit();
		entityManager1.close();
	}
}

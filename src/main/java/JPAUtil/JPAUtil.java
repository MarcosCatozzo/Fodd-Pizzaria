package JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("pizzaria");

	public static EntityManager getEntitymanager() {
		return FACTORY.createEntityManager();
	}
}

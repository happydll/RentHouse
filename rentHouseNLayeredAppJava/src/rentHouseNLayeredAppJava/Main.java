package rentHouseNLayeredAppJava;

import rentHouseNLayeredAppJava.business.ProductManager;
import rentHouseNLayeredAppJava.core.logging.DatabaseLogging;
import rentHouseNLayeredAppJava.core.logging.FileLogging;
import rentHouseNLayeredAppJava.core.logging.Logging;
import rentHouseNLayeredAppJava.dataAccess.HibernateProductDao;
import rentHouseNLayeredAppJava.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Product product1 = new Product(1, "ev1", "aa mah. bb sok. ilçe/il", 10000, 100, "2+1", "Müstakil", 0, 0, "Eşyalı", "güzel ev");
		
		Product product2 = new Product(1, "ev2", "aa mah. bb sok. ilçe/il", 10, 100, "2+1", "Müstakil", 0, 0, "Eşyalı", "güzel ev");
		
		Logging[] loggers = {new FileLogging(), new DatabaseLogging()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(loggers), loggers);
		
		productManager.add(product2);
		productManager.delete(product1);
	}

}

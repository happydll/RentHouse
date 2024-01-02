package rentHouseNLayeredAppJava.dataAccess;

import rentHouseNLayeredAppJava.core.logging.Logging;
import rentHouseNLayeredAppJava.entities.Product;

public class HibernateProductDao implements ProductDao {

	private Logging[] loggers;
	
	public HibernateProductDao(Logging[] loggers) {
		super();
		this.loggers = loggers;
	}

	public void add(Product product) {
		//db conn string ve ekleme kodu
		/* System.out.println("Hibernate ile eklendi"); */
		
		for (Logging logging: loggers) {
			String data = "Hibernate ile veritabanına eklendi: " + product.getName();
			logging.log(data);
		}
	}
	
	public void delete(Product product) {
		//db conn string ve silme kodu 
		/* System.out.println("Hibernate ile silindi"); */
		
		for (Logging logging: loggers) {
			String data = "Hibernate ile veritabanından silindi: " + product.getName();
			logging.log(data);
		
		}
	}
}

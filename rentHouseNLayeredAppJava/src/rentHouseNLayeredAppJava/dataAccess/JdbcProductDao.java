package rentHouseNLayeredAppJava.dataAccess;

import rentHouseNLayeredAppJava.core.logging.Logging;
import rentHouseNLayeredAppJava.entities.Product;

public class JdbcProductDao implements ProductDao {

	private Logging[] loggers;
	
	public JdbcProductDao(Logging[] loggers) {
		super();
		this.loggers = loggers;
	}

	public void add(Product product) {
		//db conn string ve ekleme kodu 
		//System.out.println("Jdbc ile eklendi");
		
		for (Logging logging: loggers) {
			String data = "Jdbc ile veritabanına eklendi: " + product.getName();
			logging.log(data);
		}
	}
	
	public void delete(Product product) {
		//db conn string ve silme kodu 
		//System.out.println("Jdbc ile silindi");
		
		for (Logging logging: loggers) {
			String data = "Jdbc ile veritabanına eklendi: " + product.getName();
			logging.log(data);
		}
	}
	
}

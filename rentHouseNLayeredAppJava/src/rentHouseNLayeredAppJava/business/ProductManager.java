package rentHouseNLayeredAppJava.business;

import rentHouseNLayeredAppJava.core.logging.Logging;
import rentHouseNLayeredAppJava.dataAccess.ProductDao;
import rentHouseNLayeredAppJava.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logging[] loggers;
	
	public ProductManager(ProductDao productDao, Logging[] loggers) {
		super();
		this.productDao = productDao;
		this.loggers = loggers;
	}
	
	public void add(Product product) throws Exception {
		
		
		//if (product.getAddress() != null && product.getAddress().equals(product.getAddress())) { 
			//throw new Exception("Aynı ev 2 farklı ilanda olmaz"); }
		 
		
		if (product.getUnitPrice() <=0 ) {
			throw new Exception("Evin bedeli 0 veya negeatif sayı olamaz");
		}
		if (product.getField() <=0 ) {
			throw new Exception("Evin alanı 0 veya negtif olamaz");
		}
		if (product.getBuildingAge() <0) {
			throw new Exception("Bina yaşı negatif olamaz");
		}
		
		productDao.add(product);

		/*
		 * for(Logging logging: loggers) { logging.log(product.getName()); }
		 */
		
	}
	public void delete(Product product) {
		productDao.delete(product);
	}
}

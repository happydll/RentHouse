package rentHouseNLayeredAppJava.dataAccess;

import rentHouseNLayeredAppJava.entities.Product;

public class JdbcProductDao implements ProductDao {

	public void add(Product product) {
		//db conn string ve ekleme kodu 
		System.out.println("Jdbc ile eklendi");
	}
	
	public void delete(Product product) {
		//db conn string ve silme kodu 
		System.out.println("Jdbc ile silindi");
	}
	
}

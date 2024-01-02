package rentHouseNLayeredAppJava.dataAccess;

import rentHouseNLayeredAppJava.entities.Product;

public interface ProductDao {

	void add(Product product);
	
	void delete(Product product);
	
}

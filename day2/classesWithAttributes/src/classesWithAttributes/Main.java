package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		
		product1.setName("computer");
		product1.setId(1);
		product1.setPrice(12000);
		product1.setStockAmount(4);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		
	}

}

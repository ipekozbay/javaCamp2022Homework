package staticDemo;

public class ProductManager {
	public void add(Product product){
				
		if(ProductValidator.isValid(product)) {
			System.out.println("added");
		}else {
			System.out.println("product's information is not valid.");
		}
	}
}

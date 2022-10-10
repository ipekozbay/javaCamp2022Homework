package classesWithAttributes;

public class ProductManager {

	public void Add(Product product) {
		System.out.println("product added " + product.getName() );
	}

	
	public void Delete(Product product) {
		System.out.println("product deleted");

	}

	public void Update(Product product) {
		System.out.println("product updated");

	}

}

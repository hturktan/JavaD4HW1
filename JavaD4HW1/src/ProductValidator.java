
public class ProductValidator {
	// ana class static olamaz. public "static" class ProductValidator olmaz.
	// static: ProductValidator bir kere oluþur. 
	// bir metot static yapýlýrsa, ProductValidator yapýldý, isValid ProductValidator ile çaðrýlabilir.
	// ProductManager de product validator new lenmesine gerek kalmaz. 
	// static ler direkt class ismiyle çaðýrýlýrlar. 
	// constructor lar, class new lenmediði için çalýþmaz.
	// Ama static constructor la çalýþýr. 
	
	static {
		System.out.println("Static yapýcý blok çalýþtý");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	// inner class týr ve static yapýlabilir. 
	public static class BaskaBirClass {
		public static void sil(){
			
		}
	}
}

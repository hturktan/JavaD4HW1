
public class ProductValidator {
	// ana class static olamaz. public "static" class ProductValidator olmaz.
	// static: ProductValidator bir kere olu�ur. 
	// bir metot static yap�l�rsa, ProductValidator yap�ld�, isValid ProductValidator ile �a�r�labilir.
	// ProductManager de product validator new lenmesine gerek kalmaz. 
	// static ler direkt class ismiyle �a��r�l�rlar. 
	// constructor lar, class new lenmedi�i i�in �al��maz.
	// Ama static constructor la �al���r. 
	
	static {
		System.out.println("Static yap�c� blok �al��t�");
	}
	
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	// inner class t�r ve static yap�labilir. 
	public static class BaskaBirClass {
		public static void sil(){
			
		}
	}
}

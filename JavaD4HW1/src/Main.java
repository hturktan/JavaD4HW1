
public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		
//		abstract class lar new lenmez. New lenirse alttaki gibi override etmek gerek.
//	    kullan�m a��s�ndan do�ru de�il. 
//		zorunlu i�i doldurulmas� gereken operasyonlar elde ediyoruz. 		
//		GameCalculator gameCalculator = new GameCalculator() {
//			
//			@Override
//			public void hesapla() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		
	}

}

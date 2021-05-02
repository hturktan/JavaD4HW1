
public abstract class GameCalculator {
	// abstract yaparsak: Hesapla base'de hesaplanmayacak, kim inherite ediyorsa o hesapla yapacak. 
	// override etmek gerek. 
	// operasyon abstract olmas� i�in de abstract yaz�lmas� laz�m. o y�zden void �n�ne abstract yazd�k.
	public abstract void hesapla();
	
	// final yazd���m�zda ise kullan�lmas� zorunlu olyor, inheritance yapanlarca.
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}

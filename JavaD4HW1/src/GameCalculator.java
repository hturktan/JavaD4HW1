
public abstract class GameCalculator {
	// abstract yaparsak: Hesapla base'de hesaplanmayacak, kim inherite ediyorsa o hesapla yapacak. 
	// override etmek gerek. 
	// operasyon abstract olmasý için de abstract yazýlmasý lazým. o yüzden void önüne abstract yazdýk.
	public abstract void hesapla();
	
	// final yazdýðýmýzda ise kullanýlmasý zorunlu olyor, inheritance yapanlarca.
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}

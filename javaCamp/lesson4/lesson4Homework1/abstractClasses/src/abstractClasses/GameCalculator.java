package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla();
	public final void gameOver() {	//final = Metodun de�i�tirilemeyece�ini belirtir
		System.out.println("Oyun bitti");
	}
}

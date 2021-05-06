package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla();
	public final void gameOver() {	//final = Metodun deðiþtirilemeyeceðini belirtir
		System.out.println("Oyun bitti");
	}
}

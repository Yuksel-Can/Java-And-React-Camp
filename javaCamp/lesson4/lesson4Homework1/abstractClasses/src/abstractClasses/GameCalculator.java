package abstractClasses;

public abstract class GameCalculator {
	
	public abstract void hesapla();
	public final void gameOver() {	//final = Metodun değiştirilemeyeceğini belirtir
		System.out.println("Oyun bitti");
	}
}

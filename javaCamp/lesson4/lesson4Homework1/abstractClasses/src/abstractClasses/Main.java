package abstractClasses;

public class Main {

	public static void main(String[] args) {
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.hesapla();
		gameCalculator.gameOver();

	}

}

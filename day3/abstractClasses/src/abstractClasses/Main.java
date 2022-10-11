package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGamerCalculator womanGamerCalculator = new WomanGamerCalculator();
		womanGamerCalculator.calculate();
		womanGamerCalculator.gameOver();
		
		// GameCalculator GameCalculator = new GameCalculator();
		// abstract classes cannot be new
		
		GameCalculator GameCalculator = new WomanGamerCalculator();

		 
	}

}

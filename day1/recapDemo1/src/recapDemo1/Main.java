package recapDemo1;

public class Main {

	public static void main(String[] args) {

		int num = 20;
		int num2 = 343;
		int num3 = 2;
		int theBiggest = num;
		
		if(theBiggest < num2) {
			theBiggest = num2;
		}
		if(theBiggest <num3 ) {
			theBiggest = num3;
		}
		
		System.out.println("theBiggest "+theBiggest);
		
	}

}

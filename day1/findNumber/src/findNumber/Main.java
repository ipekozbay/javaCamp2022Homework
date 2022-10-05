package findNumber;

public class Main {

	public static void main(String[] args) {

		int numbers [] = new int[] {1,2,3,5,7,9,0};
		int wanted = 1;
		
		boolean isThere= false;
		
		for(int number : numbers) {
			if(number== wanted ) {
				isThere=true;
				break;
			}
		}
		if(isThere) {
			System.out.println("number is there");
		}else {
			System.out.println("number isnt there");
		}
		
		
	}

}

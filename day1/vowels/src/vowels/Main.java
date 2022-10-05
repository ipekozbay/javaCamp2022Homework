package vowels;

public class Main {

	public static void main(String[] args) {

		char character = 'E';

		switch (character) {
		
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("not vowel");
			break;
			
		default:
			System.out.println("vowel");

		}
	}

}
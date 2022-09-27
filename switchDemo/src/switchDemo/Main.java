package switchDemo;

public class Main {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("perfect.");
			break;
		case 'B':
			System.out.println("very good");
			break;
		case 'C':
			System.out.println("good");
			break;
		case 'D':
			System.out.println("not good");
			break;
		case 'F':
			System.out.println("bad");
			break;
		default:
			System.out.println("invalid");

		}
	}

}

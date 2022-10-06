package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}

	public static void findNumber() {

		int numbers[] = new int[] { 1, 2, 3, 5, 7, 9, 0 };
		int wanted = 1;

		boolean isThere = false;

		for (int number : numbers) {
			if (number == wanted) {
				isThere = true;
				break;
			}
		}
		if (isThere) {
			sendMessage("number is there" + wanted);
		} else {
			sendMessage("number is not there" + wanted);

		}
	}
	
	public static void sendMessage(String message) {
		System.out.println(message);	
		}
}

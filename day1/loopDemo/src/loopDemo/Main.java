package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		//for loop
		for(int i=0 ; i<10 ; i++) {
			System.out.println(i);
		}
		System.out.println("for loop ended.");
		System.out.println("while loop started");
		
		//while loop
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("while loop ended.");
		System.out.println("do-while loop started");

		
		// do-while loop
		int j =1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		
		System.out.println("do-while loop ended.");

		
	}

}

package stringDemo;

public class Main {

	public static void main(String[] args) {

		String message = "The weather is very good";
		
		System.out.println(message.length());
		System.out.println(message.charAt(4));
		System.out.println(message.concat(" yeah"));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("d"));
		
		char[] characters = new char[5];
		message.getChars(0, 4, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("he"));
		System.out.println(message.lastIndexOf("a"));
	}

}

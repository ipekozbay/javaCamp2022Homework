package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		String [][] cities = new String [3][3];
		cities[0][0] = "istanbul";
		cities[0][1] = "a";
		cities[0][2] = "b";
		cities[1][0] = "";
		cities[1][1] = "f";
		cities[1][2] = "g";
		cities[2][0] = "h";
		cities[2][1] = "j";
		cities[2][2] = "y";

		for(int i =0; i<=2; i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(cities[i][j]);
			}
		}
	}

}

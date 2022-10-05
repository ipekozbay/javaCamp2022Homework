package recapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList= {1,2,3,45,5};
		double sum = 0;
		double max= myList[0];
		
		for (double number:myList) {
			if(max<number) {
				max=number;
			}
			sum+=number;
			System.out.println(number);
		}
		System.out.println("sum: "+ sum);
		System.out.println("max: "+ max);

	}

}

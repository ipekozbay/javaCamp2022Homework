package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String student1 = "ipek";
		String student2 = "kubra";
		String student3 = "zeynep";

		String[] students = new String[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		for (String student : students) {
			System.out.println(student);

		}
		
		//second choice
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

	}

}

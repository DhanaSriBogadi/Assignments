package language.basics;

public class OperatorsAssignment6 {

	public static void main(String[] args) {

		String[] studentName = new String[3];

		studentName[0] = "Suresh";
		studentName[1] = "Mahesh";
		studentName[2] = "Naresh";

		int[] marks = new int[3];

		marks[0] = 75;
		marks[1] = 80;
		marks[2] = 82;
int [] marksAddOn = new int [3];

		 marksAddOn[0] = marks[0] += 10;
		 marksAddOn[1] = marks[1] += 10;
		 marksAddOn[2] = marks[2] += 10;

		int x = marksAddOn[0]+ marksAddOn[1] +marksAddOn[2];

		int y = x / 3;

		System.out.println("Average Marks:" + y);

	}

}

package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class FirstJavaProgram {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Hello, World!");

		System.out.print("Dhana Sri");
		System.out.printf("%nHello,%s is working as a test engineer with %d years of experince.%n", "Dhana", 3);
		System.out.format("total cpga is %.2f", 90.345);
//		System.out.println();
		System.out.append("i know english").append(" and telugu");
		System.out.println();
		System.out.write(75);
		System.out.println();
		Logger log = Logger.getLogger("MyLogger");
		log.info("current line is 18");
		log.warning("Error occured");
		System.err.print("error:no data found!");

		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\log.txt");
		writer.println("No issue in code");
		writer.close();
		System.out.println("output");

	}

}

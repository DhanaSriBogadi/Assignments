package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class comments {

	public static void main(String[] args) throws FileNotFoundException {
		// Below println command provides the output and move the curser to new line
		System.out.println("Hello, World!");
		/*
		 * Below print command just print the output and keeps curser in same line we
		 * can print the data whatever present in double quotes by using print statement
		 */
		System.out.print("Dhana Sri");
		/**
		 * below printf command will be usefull when we want to print the same format
		 * output with different data we can see it in below example %s is used for
		 * string ,%d is used for digits and %b used for boolean domain It is easy to
		 * use
		 * 
		 * @author Dhana Sri
		 * @version java 17
		 */
		System.out.printf("%nHello,%s is working as a test engineer with %d years of experince.%n", "Dhana", 3);
		// format is used when we want to print only particular digits in output we can
		// use the f . for two digits we need to use 2f for 3disgits 3f
		System.out.format("total cpga is %.2f", 90.345);
		// append is used to join 2 statements
		System.out.append("i know english").append(" and telugu");
		System.out.println();
		// write is used to print ascii values
		System.out.write(75);
		System.out.println();
		// by using logger log we can print info , error msg and it is easy to find
		// errors in code if we use this
		Logger log = Logger.getLogger("MyLogger");
		log.info("current line is 18");
		log.warning("Error occured");
		System.err.print("error:no data found!");
		/*
		 * Print writer is used to print output in new file before this we need to
		 * create txt file in project and paste the path in printwriter and then the txt
		 * file will be used to print the output
		 */

		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\log.txt");
		writer.println("No issue in code");
		writer.close();
		System.out.println();
		System.out.println("output");

	}

}

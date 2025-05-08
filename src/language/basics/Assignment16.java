package language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment16 {

	public static void main(String[] args) {
		/*Assignment: Write a program to search for all occurrences of a “Java” word in the paragraph and print their
		indexes.
		1. Divide into multiple words
		2. Find total number of occurrences
		3. Print count and Indexes of the word*/

		String paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";
		int temp =0;
		int j=0;
	String[] line = {"Java"," is ","a ","popular"," programming"," language. ","Java"," is ","used"," for ","web ","development,"," mobile"," applications"," and", "more."};
	   for (int i=0;i<line.length;i++) {
		   if (line[i]=="Java") {
			   temp++;
			   j= temp;
			   
			   System.out.println("Word Java index value is : "+ i);
			  
		   }
        
	}System.out.println("Count of word Java :"+j);

	
	}

}

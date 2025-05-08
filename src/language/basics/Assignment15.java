package language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment15 {

	public static void main(String[] args) {
		/*Write a program to perform the following tasks:




String sentence = "Java programming is fun and challenging";*/
		
		String sentence = "Java programming is fun and challenging";
		
		//1. Count the total number of words in the sentence.
		
		String[] splittedtext= sentence.split(" ");
		System.out.println(splittedtext.length);
		
		
		
		//2. Print the sentence words in reverse order.
		
		System.out.println(sentence.substring(28,39)+sentence.substring(23,28)+sentence.substring(20,27)+sentence.substring(16,20)+sentence.substring(5,17)+sentence.substring(0,4));
        


		//3. Convert the first character of each word to uppercase and print original sentence
		 
		
	}

}

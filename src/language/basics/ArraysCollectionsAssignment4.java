package language.basics;

import java.util.ArrayList;
import java.util.List;

public class ArraysCollectionsAssignment4 {

	public static void main(String[] args) {
		/*1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
		cities combined.*/
		
		List<Integer> cityArrayList = new ArrayList<Integer>();
		
		cityArrayList.add(1484);
		cityArrayList.add(741);
		cityArrayList.add(681);
		cityArrayList.add(650);
		cityArrayList.add(631);
	      
		 int sum = cityArrayList.get(2) + cityArrayList.get(3);
	     System.out.println("Total area of 3rd and 4th cities :"+ sum) ;
	      
	    /*2. Create a set of the top 10 most visited tourist attractions in the world and print out all
	     of them and its size.*/
	     
	     
	     
	     /*3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
6th Value.*/
	     
	     int[] number = new int[10];
	     
	     number[0]= 10;
	     number[1]= 15;
	     number[2]= 17;
	     number[3]= 22;
	     number[4]= 35;
	     number[5]= 46;
	     number[6]= 54;
	     number[7]= 67;
	     number[8]= 78;
	     number[9]= 99;
	     
	     int Sum = number[4] + number[5];
	     int div = Sum /2;
	     
	     System.out.println("Average of 5th and 6th value is "+ div);
	    		 
	     /*4. Create a list of the top 5 highest-grossing movies of all time and print out the third
movie on the list.*/
	     
			
	     List<String> movieArrayList = new ArrayList<String>();
	    	     
	             movieArrayList.add("Baahubali2");
	    	     movieArrayList.add("RRR");
	    	     movieArrayList.add("Baahubali");
	    	     movieArrayList.add("Saaho");
	    	     movieArrayList.add("Pushpa");
	    	     System.out.println(movieArrayList.get(2));
	     
	     
	     
	}

}

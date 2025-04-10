package language.basics;

public class ArrayAssignement {

	public static void main(String[] args) {
		String [][][] sem = new String [5][2][6];
		 
		
		    sem [0][0][0]= "M1";
		    sem [0][0][1]= "PHY";
		    sem [0][0][2]= "CHEM";
		    sem [0][0][3]= "CP";
		    sem [0][0][4]= "ED";
		    sem [0][0][5]= "BEE";
		    sem [0][1][0]= "78P";
		    sem [0][1][1]= "85P";
		    sem [0][1][2]= "21F";
		    sem [0][1][3]= "74P";
		    sem [0][1][4]= "88P";
		    sem [0][1][5]= "79P";
		    
		    sem [1][0][0]= "M2";
		    sem [1][0][1]= "MECH";
		    sem [1][0][2]= "ES";
		    sem [1][0][3]= "BE";
		    sem [1][0][4]= "EP";
		    sem [1][0][5]= "EG";
		    sem [1][1][0]= "82P";
		    sem [1][1][1]= "77P";
		    sem [1][1][2]= "93P";
		    sem [1][1][3]= "19F";
		    sem [1][1][4]= "24F";
		    sem [1][1][5]= "90P";
		    
		    sem [2][0][0]= "DS";
		    sem [2][0][1]= "DM";
		    sem [2][0][2]= "DE";
		    sem [2][0][3]= "OS";
		    sem [2][0][4]= "SS";
		    sem [2][0][5]= "OOPS";
		    sem [2][1][0]= "88P";
		    sem [2][1][1]= "81P";
		    sem [2][1][2]= "76P";
		    sem [2][1][3]= "32F";
		    sem [2][1][4]= "85P";
		    sem [2][1][5]= "78P";
		    
		    sem [3][0][0]= "ALG";
		    sem [3][0][1]= "CN";
		    sem [3][0][2]= "DS";
		    sem [3][0][3]= "MP";
		    sem [3][0][4]= "CE";
		    sem [3][0][5]= "SE";
		    sem [3][1][0]= "91P";
		    sem [3][1][1]= "73P";
		    sem [3][1][2]= "19F";
		    sem [3][1][3]= "80P";
		    sem [3][1][4]= "76P";
		    sem [3][1][5]= "87P";

		    sem [4][0][0]= "P&S";
		    sem [4][0][1]= "ML";
		    sem [4][0][2]= "CD";
		    sem [4][0][3]= "TC";
		    sem [4][0][4]= "ES";
		    sem [4][0][5]= "CG";
		    sem [4][1][0]= "86P";
		    sem [4][1][1]= "88P";
		    sem [4][1][2]= "84P";
		    sem [4][1][3]= "95P";
		    sem [4][1][4]= "73P";
		    sem [4][1][5]= "90P";

		


		      
System.out.println("Semester 2 Subject 4 is "+sem[1][0][3] + ",Semester 2 Subject 5 is " +sem[1][0][5]);
System.out.println("Status& Marks of Semester 4 Subject 3 is "+sem[3][1][2] + ",Status/Marks of Semester 4 Subject 3 is " +sem[3][1][5]);

		      
			

	}

}

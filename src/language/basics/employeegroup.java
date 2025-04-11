package language.basics;

public class employeegroup extends Employeeclass{

	public static void main(String[] args) {
		employeegroup obj 	= new employeegroup();
		
		String [][] group1 = new String [2][3];
		int [][] group2 = new int [2][3];
		
		group1[0][0] = obj.employeename1;
		group1[0][1] = obj.employeename2;
		group1[0][2] = obj.employeename2;
		group2[1][0] = obj.employeeid1;
		group2[1][1] = obj.employeeid2;
		group2[1][2] = obj.employeeid3;
		 
		 
		 System.out.println("Employee Name:"+group1[0][0] +",Employee ID:"+group2[1][0]);
		 System.out.println("Employee Name:"+group1[0][1] +",Employee ID:"+group2[1][1]);
		 System.out.println("Employee Name:"+group1[0][2] +",Employee ID:"+group2[1][2]);
		

	}

}

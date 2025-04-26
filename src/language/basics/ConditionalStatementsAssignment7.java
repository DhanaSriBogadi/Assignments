package language.basics;

public class ConditionalStatementsAssignment7 {

	public static void main(String[] args) {
		
             
             int creditscore = 720;
             System.out.println("John Doe your credit score is 720 ");
             
             if (creditscore > 750) {
            	 System.out.println("Your loan is automatically approved");
             }else if( creditscore >=650 && creditscore <=750) {
            	 
            	 System.out.println("So additional checks are performed.");
            	 double salary = 55000.0;
            	  if( salary >= 50000) {
            		  System.out.println("Your are eligible to get loan as your salary is 55000");
            		 
            	  }else if ( salary < 50000) {
            		  
            		  System.out.println("Additional checks will be performed as your salary is less than 50000");
            		  
            		  boolean isEmployeed = true;
            		  
            		 
            		  if (isEmployeed = true) {
            			  
            			  System.out.println ("You are eligiible to get loan");
            			  
            		  }else 
            		  {
                			  System.out.println("Your are not eligible to get loan");
                	  }
            	  }
            	  else 
        		  {
            			  System.out.println("Your are not eligible to get loan");
            	  }
            		  
            			  double debtToIncomeRatio = 35.0;
            			  if (debtToIncomeRatio < 40 ) {
            			  
            			  System.out.println("Your debt to income ratio is 35 You are eligible to get loan");
            			  }else 
            				  System.out.println("Your are not eligible to get loan");
            		  }
             
             }
            	 
            
	}
	


package language.basics;

public class ConditionalStatementsLoopsAssignement8 {

	public static void main(String[] args) {
		

		int[] transactions = new int [8];
		
		transactions[0]= 50000;
		transactions[1]= -2000;
		transactions[2]= 3000;
		transactions[3]=-15000 ;
		transactions[4]= -200;
		transactions[5]= -300;
		transactions[6]= 4000;
		transactions[7]= -3000;
		int totalCredits = 0;
		int totalDebits = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransactions = 0;
		//1. total number of credit and debit transactions completed
		
			System.out.println("Total number of credit and debit transactions completed are " + transactions.length);
		
	     //2. Pri-nt the total amount credited and debited in account				
	
			for (int amount:transactions) {
				if (amount>0) {
					
					totalCredits++;
					totalCreditAmount += amount;
					if (amount > 10000) {
						System.out.println("Suspicious credit transaction with Amount: " + amount);
						suspiciousTransactions++;
					}
					
				}else {
					totalDebits++;
					totalDebitAmount -= amount;
					
					if (amount < -10000) {
						System.out.println("Suspicious debit transaction with Amount: " + amount);
						suspiciousTransactions++;
				}
			}
			
			
			

}int finalBalance = totalCreditAmount - totalDebitAmount;
System.out.println("Total amount credited: " + totalCreditAmount);
System.out.println("Total amount debited: " + totalDebitAmount);
System.out.println("Total no of suspicious transactions: " + suspiciousTransactions);
System.out.println("Final remaining amount in the account: " + finalBalance);
	}
}


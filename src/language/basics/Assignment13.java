package language.basics;

public class Assignment13 {

	public static void main(String[] args) {
		/*Given a number n, determine whether it is a prime number or not. A prime number is a
		number greater than 1 that has no positive divisors other than 1 and itself.
		Examples :
		Input: n = 7
		Output: true
		Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.*/
		
		int n = 7;
		int temp =0;
		int result=0;
		int y=result;
		int z=result +1;
		
			for (int i=1;i<=n;i++) {
				if (n%i==0) {
					result++;
				 z=result;
				}else 
				{	y=0;
						
					}
				temp= y+z;
					
			}if (temp==2) {
				System.out.println(n + " is prime number");
			}else 
			{
				System.out.println(n + " is not prime number");
			}
		}
	   
}


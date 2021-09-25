package BigO;

public class Exercise_8 {
	
	public static void main(String[] args) {
		System.out.println(sumDigits(1234));
	}
	
	static int sumDigits(int n) {  
		int sum =0;	
		while(n>0) {
			sum = sum + n%10;
			n=n/10;
		}
		return sum;
	}	
}

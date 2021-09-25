package BigO;

public class Exercise_1 {
	
	public static void main(String[] args) {
		System.out.println(product(5,6));
	}
	
	static int product(int a,int b) {  
		int sum=0;
		for (int i=0;i<b;i++) {
			sum=sum+a;
		}
		return sum;	
	}
	
}

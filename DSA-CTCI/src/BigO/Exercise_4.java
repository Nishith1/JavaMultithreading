package BigO;

public class Exercise_4 {
	
	public static void main(String[] args) {
		System.out.println(div(10,3));
	}
	
	static int div(int a,int b) {  
		int count =0;
		int sum=b;
		while(sum<=a) {
			sum=sum+b;
			count++;
		}
		return count;
	}
	
}

package BigO;

public class Exercise_3 {
	
	public static void main(String[] args) {
		System.out.println(mod(10,3));
	}
	
	static int mod(int a,int b) {  
		if(b<=0)return -1;
		int div = a/b;
		return a - div*b;
	}
	
}

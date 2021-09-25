package BigO;

public class Example_9 {
	
	public static void main(String[] args) {
		System.out.println(factorial(3));
	}
	
	static int factorial(int num) {
		if(num < 0 ) return -1;
		else if(num == 0) return 1;
		else return num * factorial(num-1);	
	}
}


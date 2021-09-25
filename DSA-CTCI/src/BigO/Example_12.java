package BigO;

public class Example_12 {
	
	public static void main(String[] args) {
		allFibonacci(30);
	}
	private static void allFibonacci(int num) {
		for(int i=0;i<num;i++) {
			System.out.println(i + " : "+ fib(i));
		}
	}
	private static int fib(int num) {
		if(num<0) return 0;
		if(num==1) return 1;
		return fib(num-1)+fib(num-2);
		
	}
}


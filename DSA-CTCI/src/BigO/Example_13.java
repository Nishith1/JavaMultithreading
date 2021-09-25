package BigO;

public class Example_13 {
	
	public static void main(String[] args) {
		allFibonacci(30);
	}
	private static void allFibonacci(int num) {
		int[] memo = new int[num+1];
		for(int i=0;i<num;i++) {
			System.out.println(i + " : "+ fib(i,memo));
		}
	}
	private static int fib(int num,int[] memo) {
		if(num<0) return 0;
		if(num==1) return 1;
		else if(memo[num]>0) return memo[num];
		memo[num] = fib(num-1,memo)+fib(num-2,memo);
		return memo[num];
		
	}
}


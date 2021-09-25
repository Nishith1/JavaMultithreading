package BigO;

public class Exercise_6 {
	
	public static void main(String[] args) {
		System.out.println(sqrt(100));
	}
	
	static int sqrt(int n) {  
		for(int guess=1;guess*guess<=n;guess++) {
			if(guess*guess == n) return guess;
		}
		return -1;
	}	
}

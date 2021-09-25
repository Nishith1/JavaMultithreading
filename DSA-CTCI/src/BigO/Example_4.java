package BigO;

public class Example_4 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,6};
		printUnorderedPairs(array);
	}
	
	static void printUnorderedPairs(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				System.out.println(array[i]+" , "+array[j]);
			}
		}
	}

}

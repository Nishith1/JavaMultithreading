package BigO;

public class Example_5 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,6};
		printUnorderedPairs(array);
	}
	
	static void printUnorderedPairs(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				for(int k=0;k<100000;k++) {
					System.out.println(array[i]+" , "+array[j]);
				}
			}
		}
	}

}

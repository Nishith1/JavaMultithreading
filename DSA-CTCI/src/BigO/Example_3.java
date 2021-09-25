package BigO;

public class Example_3 {
	
	public static void main(String[] args) {
		int[] arrayA = {1,2,3,4,5};
		int[] arrayB = {6,7,8,9,10};
		printUnorderedPairs(arrayA,arrayB);
	}
	
	static void printUnorderedPairs(int[] arrayA,int[] arrayB) {
		for(int i=0;i<arrayA.length;i++) {
			for(int j=0;j<arrayB.length;j++) {
				System.out.println(arrayA[i]+" , "+arrayB[j]);
			}
		}
	}

}

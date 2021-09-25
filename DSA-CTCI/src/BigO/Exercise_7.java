package BigO;

import java.util.Arrays;

public class Exercise_7 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println(Arrays.toString(appendToNew(array,6)));;
	}
	
	static int[] copyArray(int[] array) {  
		int[] copy = new int[0];
		for(int value : array) {
			copy = appendToNew(copy,value);
		}
		return copy;
	}

	private static int[] appendToNew(int[] array, int value) {
		int[] bigger = new int[array.length+1];
		for(int i=0;i<array.length;i++) {
			bigger[i] = array[i];
		}
		bigger[bigger.length-1] = value;
		return bigger;
	}	
}

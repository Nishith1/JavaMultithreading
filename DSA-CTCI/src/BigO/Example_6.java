package BigO;

import java.util.Arrays;

public class Example_6 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		System.out.println(Arrays.toString(reverseArray(array)));
	}
	
	static int[] reverseArray(int[] array) {
		for(int i=0;i<array.length/2;i++) {
			int other = array.length-i-1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;	
		}
		return array;
	}

}

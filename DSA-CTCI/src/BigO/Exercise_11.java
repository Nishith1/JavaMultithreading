package BigO;

public class Exercise_11 {

	public static void main(String[] args) {
		int[] a = {1,2,4};
		int[] b = {7,9,6};
		System.out.println(intersection(a , b));
	}

	static int intersection(int[] a,int[] b) {  
		mergesort(b);
		int intersect =0;
		for(int x:a) {
			if(binarySearchIterative(b,x)){
				intersect++;
			}
		}
		return intersect;	
	}

	private static boolean binarySearchIterative(int[] sortedArray, int key) {
		int lowestIndex = 0;
		int highestIndex = sortedArray.length-1;
		boolean found = false;
		while(lowestIndex<=highestIndex) {
			int middleIndex = lowestIndex + (highestIndex - lowestIndex)/2;
			if(sortedArray[middleIndex] < key) {
				lowestIndex = middleIndex+1;
			}else if(sortedArray[middleIndex] >key) {
				highestIndex = middleIndex-1;
			}else if(sortedArray[middleIndex] == key) {
				found =  true;
				break;
			}
		}
		return found;
	}

	private static void mergesort(int[] mainArray) {
		int arrayLength = mainArray.length;
		if(arrayLength<2) return;
		int inputArrayFirstHalfIndex = arrayLength/2;
		int inputArraySecondHalfIndex = arrayLength-inputArrayFirstHalfIndex;
		int[] leftArray = new int[inputArrayFirstHalfIndex];
		int[] rightArray = new int[arrayLength-inputArrayFirstHalfIndex];
		for(int i=0;i<inputArrayFirstHalfIndex;i++) {
			leftArray[i] = mainArray[i];
		}
		for(int i=inputArrayFirstHalfIndex;i<arrayLength;i++) {
			rightArray[i-inputArrayFirstHalfIndex] = mainArray[i];
		}
		mergesort(leftArray);
		mergesort(rightArray);
		merge(mainArray,leftArray,rightArray,inputArrayFirstHalfIndex,inputArraySecondHalfIndex);		
	}

	private static void merge(int[] mainArray, int[] leftArray, int[] rightArray, int inputArrayFirstHalfIndex, int inputArraySecondHalfIndex) {
		int i = 0, j = 0, k = 0;
		while(i<inputArrayFirstHalfIndex && j<inputArraySecondHalfIndex) {
			if(leftArray[i]<rightArray[i]) {
				mainArray[k++] = leftArray[i++];
			}else {
				mainArray[k++] = rightArray[j++];
			}
		}
		while(i<inputArrayFirstHalfIndex) {
			mainArray[k++] = leftArray[i++];
		}
		while(j<inputArraySecondHalfIndex) {
			mainArray[k++] = rightArray[j++];
		}
	}
}

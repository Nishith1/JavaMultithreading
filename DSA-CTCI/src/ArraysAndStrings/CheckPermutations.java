package ArraysAndStrings;

import java.util.Arrays;

//Given two strings, write a method to decide if one is a permutation of the other.

public class CheckPermutations {

	public static void main(String[] args) {
		//System.out.println(isPermutationUsingSorting("qweqti", "wqqety"));
		System.out.println(isPermutationOptimized("qweqty", "wqqety"));

	}

	private static boolean isPermutationUsingSorting(String stringOne,String stringTwo) {
		if(stringOne == null || stringTwo == null || stringOne.length()!=stringTwo.length()) return false;
		else {
			char[] stringOneArray = stringOne.toCharArray();
			char[] stringTwoArray = stringTwo.toCharArray();
			Arrays.sort(stringOneArray);
			Arrays.sort(stringTwoArray);
			String stringOneSorted = Arrays.toString(stringOneArray);
			String stringTwoSorted = Arrays.toString(stringTwoArray);
			return stringOneSorted.equals(stringTwoSorted);
		}
	}
	
	private static boolean isPermutationOptimized(String stringOne,String stringTwo) {
		if(stringOne == null || stringTwo == null || stringOne.length()!=stringTwo.length()) return false;
		else {
			int[] letters = new int[128];
			for(int i=0;i<stringOne.length();i++) {
				letters[stringOne.charAt(i)]++;
			}
			for(int i=0;i<stringTwo.length();i++) {
				letters[stringTwo.charAt(i)]--;
				if(letters[stringTwo.charAt(i)]<0) return false;
			}
		}
		return true;
		
	}

}

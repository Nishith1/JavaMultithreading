package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;

//Implement an algorithm to determine a string has all unique characters. What if you cannot use additional data structures

public class IsUnique {
	
	public static void main(String[] args) {
		//System.out.println("Output : "+allUniqueCharactersUsingSet("qwertyq"));
		//System.out.println("Output : "+allUniqueCharactersDumb("qweqrty"));
		//System.out.println("Output : "+allUniqueCharactersUsingSorting("qwertyq"));
		System.out.println("Output : "+isUniqueCharacters("qwertyq"));
	}
       
	
	private static boolean allUniqueCharactersUsingSet(String string) {
		HashSet<Character> hs = new HashSet<Character>();
		if(string==null || string.length()<=1)return true;
		else {
			for(int i=0;i<string.length();i++) {
				hs.add((string.charAt(i)));
			}
		}
		return string.length() == hs.size();
		
	}
	
	
	private static boolean allUniqueCharactersDumb(String string) {
		if(string==null || string.length()<=1)return true;
		for(int i=0;i<string.length();i++) {
			for(int j=i+1;j<string.length()-i-1;j++) {
				if(string.charAt(i) == string.charAt(j)) return false;
			}
		}
		return true;
	}
	
	private static boolean allUniqueCharactersUsingSorting(String string) {
		if(string==null || string.length()<=1)return true;
		char[] stringArray = string.toCharArray();
		Arrays.sort(stringArray);
		for(int i=0;i<stringArray.length-1;i++) {
			if(stringArray[i] == stringArray[i+1]) return false;
		}
		return true;
	}

	
	private static boolean isUniqueCharacters(String inputString) {
		if(inputString.length()>128) return false;
		boolean[] charSet = new boolean[128];
		for(int i=0;i<inputString.length();i++) {
			char val = inputString.charAt(i);
			if(charSet[val]) return false;
			charSet[val] = true;
		}
		return true;	
	}
	
}

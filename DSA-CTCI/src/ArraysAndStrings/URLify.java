package ArraysAndStrings;

import java.util.Arrays;

//Write a method to replace all spaces in a string with '%20'. You may assume that the string
//has sufficient space at the end to hold the additional characters, and that you are given the "true"
//length of the string. (Note: if implementing in Java, please use a character array so that you can
//perform this operation in place.)
//EXAMPLE
//Input: "Mr John Smith" , 13
//Output: "Mr%20John%20Smith"

public class URLify {
	
	public static void main(String[] args) {
		//System.out.println(urlifyDirect("Mr John Smith"));
		System.out.println(urlifyOptimized("Mr John Smith    ",13));
		
	}
	
	private static String urlifyDirect(String inputString) {
		if(inputString.isEmpty() || inputString == null) return "";
		if (!inputString.contains(" ")) return inputString;
		return inputString.replace(" ", "%20");
	}
	
	private static String urlifyOptimized(String inputString,int trueLength) {
		char[] inputCharArray = inputString.toCharArray();
		int spaceCount = 0;
		for(int i=0;i<trueLength;i++) {
			if(inputCharArray[i]==' ')spaceCount++;
		}
		int index = trueLength+spaceCount*2;
		if(trueLength<inputCharArray.length) inputCharArray[trueLength] = '\0';
		for(int i=trueLength-1; i>=0; i--) {
			if(inputCharArray[i]==' ') {
				inputCharArray[index-1]='0';
				inputCharArray[index-2]='2';
				inputCharArray[index-3]='%';
				index = index-3;
			}else {
				inputCharArray[index-1] = inputCharArray[i];
				index--;
			}
		}
		return String.valueOf(inputCharArray);
	}

}

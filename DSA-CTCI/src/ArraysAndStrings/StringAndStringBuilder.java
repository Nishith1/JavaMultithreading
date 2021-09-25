package ArraysAndStrings;

public class StringAndStringBuilder {
	
	public static void main(String[] args) {
		String[] words = {"abc","def","ghi"};
		System.out.println("joingWordsUsingString : "+joingWordsUsingString(words));
		System.out.println("joingWordsUsingString : "+joingWordsUsingStringBuilder(words));
	}
	
	private static String joingWordsUsingString(String[] words){
		String sentence = "";
		for(String s: words) {
			sentence = sentence+s;
		}
		return sentence;
		
	}
	private static String joingWordsUsingStringBuilder(String[] words){
		StringBuilder sentence = new StringBuilder();
		for(String s: words) {
			sentence.append(s);
		}
		return sentence.toString();
		
	}

}

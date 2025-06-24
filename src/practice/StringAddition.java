package practice;

import java.util.Arrays;
import java.util.HashMap;

public class StringAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "sandeep joshi is";
		/*String cleanedString = input.replaceAll("[^0-9]","");
		System.out.println(cleanedString);
		int value = Integer.parseInt(cleanedString);
		System.out.println(value);
		int sum =0;
		
		while(value>0) {
			 sum = sum+ value%10;
			value /= 10;	
		}
		System.out.println(sum);*/
		
		HashMap<Character, Integer> mapCharCount = new HashMap<>();
		for(char ch : input.toCharArray()) {
			mapCharCount.put(ch, mapCharCount.getOrDefault(ch,0)+1);
		}
		
		System.out.println( mapCharCount);

		String str1 = "listen";
		String str2 = "silssent";
		boolean status = true;
		
		if(str1.length()!=str2.length()) {
			status = false;
		}
		
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		status = Arrays.equals(s1, s2);
		
		if(status) {
			System.out.println("is annagram");
		}else {
			System.out.println("is not anngram");
		}
		
		
	}
	

	private static Integer getOrDefault() {
		// TODO Auto-generated method stub
		return null;
	}

}

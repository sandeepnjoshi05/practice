package practice;

import java.util.Arrays;

public class AnnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnnagram("keep ", "peek");
	}

	
	public static void isAnnagram(String s1, String s2) {
		String copyofS1 = s1.replaceAll("\\s", "");
		String copyofS2 = s2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(copyofS1.length() != copyofS2.length()) {
			status = false;
		}
		
		else{
			System.out.println("");
			char[] s1Array = copyofS1.toLowerCase().toCharArray();
			char[] s2Array = copyofS2.toLowerCase().toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			status = Arrays.equals(s1Array, s2Array);
		}
		if(status) {
			System.out.println(s1 + "and " +s2 +" are annagram");
		}
		else {
			System.out.println(s1 + "and " + s2 + "are not annagram");
		}
	}
}

package practice;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "HSBC@TEST";
		String cleanedInput = input.replaceAll("[^a-zA-Z]", "");
		System.out.println(cleanedInput.substring(0,4));
		System.out.println(cleanedInput.substring(4));
		
	}

}

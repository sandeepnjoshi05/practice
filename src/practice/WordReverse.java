package practice;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = " i love java programming";
		
		String[] word = input.split(" ");
		for(int i=word.length-1; i >=0; i--) {
			System.out.print(word[i]);
		}
				

	}

}

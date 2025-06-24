import java.util.Scanner;

public class oddEvenNumber {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		x = sc.nextInt();
		// TODO Auto-generated method stub
		
		if(x%2!=0)
		{
			System.out.println("number is odd");
		}
		else
		{
			System.out.println("number is even");
		}

	}

}

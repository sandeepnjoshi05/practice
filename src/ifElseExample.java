import java.util.Scanner;

public class ifElseExample {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		x = sc.nextInt();
		
		if(x>0)
		{
			System.out.println("number is positive" +x);
		}
		else if(x<0)
		{
			System.out.println("number is negative" +x);
		}
		else
		{
			System.out.println("number is 0" +x);
		}
		// TODO Auto-generated method stub

	}

}

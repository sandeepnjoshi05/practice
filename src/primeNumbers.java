import java.util.Scanner;

public class primeNumbers {

	public static void main(String[] args) {
		boolean flag =false;
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		num = sc.nextInt();
		
		for(int i=2; i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("number is prime number");
		}
		else
		{
			System.out.println("number is not prime");
		}

	}

}

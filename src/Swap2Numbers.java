import java.util.Scanner;

public class Swap2Numbers {
	public static Scanner sc; 
	
	public void swappningNumberwithoutvarible()
	{
		int a,b;
		sc = new Scanner(System.in);
		System.out.println("enter a value");
		a = sc.nextInt();

		System.out.println(" enter b value");
		b = sc.nextInt();
		a = a+b;// 11+22 == 33
		b = a-b; // 22-33 = 11
		a = a-b; // 33-11 =22
		
		System.out.println("after swapping " +a + "  " +b);
		
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int x,y,z;
		
		
		System.out.println(" enter x value");
		x = sc.nextInt();

		System.out.println(" enter y value");
		// TODO Auto-generated method stub
		
		y = sc.nextInt();
		
		System.out.println("before swapping" +x + "nnumber " +y);
		z =x;
		x=y;
		y=z;
		System.out.println("after swapping" +x + "nnumber " +y);
		
      Swap2Numbers ss = new Swap2Numbers();
      ss.swappningNumberwithoutvarible();
	}

}

import java.util.Scanner;

public class JavaIfElseIntergerOdd {

	
		
		
		private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        String answer="";
	        /*
	        if(N%2==1 || ( (N%2==0) && (N>=6 && N <= 20 ) )){
	              answer = "Weird";
	            } else {
	                answer = "Not Weird";
	            }
	        System.out.println(answer); */
	        
	        if(N%2==1)
	        {
	          System.out.println("Weird");
	            
	        }
	        
	        if(N%2==0 && N>=2 & N<=5)
	        {
	            System.out.println("Not Weird");
	        }
	        
	        if(N%2==0 && N>=6 & N<=20)
	        {
	            System.out.println("Weird");
	        }
	        
	        if(N%2==0 && N>=20 & N<=100)
	        {
	            System.out.println("Not Weird");
	        }
	        
	        
	        
	        
	        scanner.close();
	    

	}

}

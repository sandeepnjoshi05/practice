
public class largestNumber {

	public static void main(String[] args) {
		
		 int array[] = {22,11,11,212,1};
		 int max = array[0];
		 
		 for(int i=0; i<array.length; i++)
		 {
			 if(array[i]>max)
				 max=array[i];
			 
		 }
		 System.out.println(max);

	}

}

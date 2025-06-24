
public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "my name is sandeep";//"sting to reverse";
		char[] aa = text.toCharArray();
		String hh = "";
		
		for(int i=aa.length-1;i>=0;i--)
		{
			hh = hh+aa[i];
			
		}
		
		System.out.println(hh);
		
		String mm = hh.replace(" ", "");
		
		System.out.println(mm);
		
		
	}

}

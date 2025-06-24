package practiceoops;

public class ConstructorDemo1 extends ConstructorDemo {

	
	public void ConstructorDemo(String str) {
		
		System.out.println("value of string is==" +str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd = new ConstructorDemo("me hssh");
		ConstructorDemo cds = new ConstructorDemo();
	}

}

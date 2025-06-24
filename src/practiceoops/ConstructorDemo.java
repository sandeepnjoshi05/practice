package practiceoops;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		
		System.out.println("inside constructor ");
	}

	public ConstructorDemo(String str) {
		System.out.println("value of string is==" +str);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo("sandeep");
		
		
		
	}

}

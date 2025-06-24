
public class EncapsTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpSSN(1231);
		obj.setEmpAge(20);
		obj.setEmpName("Sandeep");
		
		System.out.println("employee ssn is =" +obj.getEmpSSn());
		System.out.println("employee age is =" +obj.getEmpAge());
		System.out.println("employee name is = " +obj.getEmpName());

	}

}

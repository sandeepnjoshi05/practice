
public class EncapsulationDemo {
	
	private int ssn;
	private int empAge;
	private String empName;
	
	//getter method to get private values
	
	public int getEmpSSn()
	{
		return ssn;
	}
	
	public int getEmpAge()
	{
		return empAge;
	}

	public String getEmpName()
	{
		return empName;
	}

	//setter to set the value
	public void setEmpSSN(int newvalue1)
	{
		ssn = newvalue1;
	}
	
	public void setEmpAge(int newvalue1) {
		empAge = newvalue1;
	}
	
	public void setEmpName(String newvalue1) {
		empName = newvalue1;
				
	}
}

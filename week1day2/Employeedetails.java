package week1day2;

public class Employeedetails {
	public void employeeName() 
	{
		String EmployeeName = "Moule";
		int EmployeeID = 155;
		System.out.println("Employee Name :"+EmployeeName);
		System.out.println("Employee ID:"+EmployeeID);
	}
	public void EmployeeAddress()
	{
		String EmployeeAddress = "Salem";
		System.out.println("Employee Address:"+EmployeeAddress);
	}
	public void EmployeeSalary() 
	{
		double EmployeeSalary = 39860.6563578685;
		System.out.println("Employee salary:"+EmployeeSalary);
	}
	public void EmployeeMobileNumber() {
		long EmployeeMobileNumber = 787628971971L;
		System.out.println("Mobile Number:"+EmployeeMobileNumber);
	}
	public static void main(String[] args) {
		Employeedetails details = new Employeedetails();
		details.employeeName();
		details.EmployeeAddress();
		details.EmployeeSalary();
		details.EmployeeSalary();
		details.EmployeeMobileNumber();
	}

}

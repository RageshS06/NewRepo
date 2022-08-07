package org.emp;

public class Employee {
	

	public void empId() {
		

	}
	public void empName() {
	System.out.println("Employee Name: Nathiya");	

	}
	public void empDob() {
	System.out.println("Employee DOB: Jan 6 1997");	

	}
	public void EmpPhone() {
	System.out.println("Employee phone No: 123456789");	
	}
	private void empEmail() {
	System.out.println("Employee Email: 123456789@gmail.com");	

	}
	private void empAddress() {
		
     System.out.println("Employee address: chennai");
	}
	
	public static void main(String[] args) {
		
	Employee obj=new Employee();	
	obj.empName();
	obj.empDob();
	obj.EmpPhone();
	obj.empEmail();
	obj.empAddress();

	}

}

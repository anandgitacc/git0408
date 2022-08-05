package org.gittest;


public class EmployeeDetails {
	
	private void empName() {
		System.out.println("Anand");
	}
	
	private void empMobile() {
		System.out.println("8939278836");
	}
	private void empAdd() {
		System.out.println("OMR - chennai");
	}
	private void empId() {
		System.out.println("Employee id: 1234");
	}
//<<<<<<< HEAD
//	
//=======
//	
//>>>>>>> 8872a2c891fd9cade57f1ee625c9ea26bbec8233
	
	public static void main(String[] args) {
		
		EmployeeDetails e = new EmployeeDetails();
		e.empMobile();
		e.empName();
	}

}

package week2.day1;

public class Employee {
    public void printEmployeeName(String name) {
    	System.out.println(name);
    }
    public void printEmployeeId(int id) {
    	System.out.println(id);
    }
    public void printEmployeeAddress(String address) {
    	System.out.println(address);
    
    }
    public void printEmployeePhNumber(Long PhNumber) {
    	System.out.println(PhNumber);
    	
    }
    public void EmployeeSalary(double employeesalary) {
    	System.out.println(employeesalary);
    }
    public static void main(String[] args) {
		Employee emp=new Employee();
		emp.printEmployeeName("Name=Kumaran");
		emp.printEmployeeId(81);
		emp.printEmployeeAddress("Address=Erode");
		emp.printEmployeePhNumber(9750523452l);
		emp.EmployeeSalary(25000);
				}
        
}

package comp;

import java.util.List;

public class Company {	
	
	//Properties OR Variables
	String name;
	String address;
	String contact;
	String email;
	List<Departments> departments;
	List<Employee> employees;
	
	//Methods
	double calculateSalary(Departments dep, Employee emp) {
		double finalSalary = 0.00;
		
		if("Admin".equalsIgnoreCase(dep.getName())) {
			emp.setSalary(5000.00);
		}else if("HR".equalsIgnoreCase(dep.getName())) {
			emp.setSalary(10000.00);
		} else {
			emp.setSalary(4000.00);
		}
		
		finalSalary = emp.getSalary();
		return finalSalary;		
	}
	
	
	//Every method should have -
	//1. Method name - example: cerTest
	//2. Method argument within ()- example: String name
	//3. Method return type - example: String, int, double etc. 
	//If method does not return anything, use void.
	//Every method body start with "{" and ends with "}"
	
	
	void carTest(String name){
		Car honda = new Car();
		
		String make = honda.getMake();
		System.out.println("Make is ="+make);
	}
	
	public static void main(String[] args) {
		Company company  = new Company();
		Employee employee  = new Employee();
		Departments department  = new Departments();
		department.setName("Finance");
		
		Departments department1  = new Departments();
		department1.setName("HR");
		
		Departments department2  = new Departments();
		department2.setName("Admin");
		
		double finalSal = company.calculateSalary(department, employee);
		double finalSal1 = company.calculateSalary(department1, employee);
		double finalSal2 = company.calculateSalary(department2, employee);
		
		/*
		 * System.out.println("Final Salary for department "+department.getName()+" is:"
		 * +finalSal);
		 * System.out.println("Final Salary for department "+department1.getName()
		 * +" is:"+finalSal1);
		 * System.out.println("Final Salary for department "+department2.getName()
		 * +" is:"+finalSal2);
		 */
		company.carTest(null);
	}
     
	
}

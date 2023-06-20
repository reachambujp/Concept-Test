package comp;

public class Departments {
	//Variable OR Properties
	String name;
	int headCount;
	Employee departmentHead;
	
	//Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeadCount() {
		return headCount;
	}
	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}
	public Employee getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(Employee departmentHead) {
		this.departmentHead = departmentHead;
	}
	
	
}

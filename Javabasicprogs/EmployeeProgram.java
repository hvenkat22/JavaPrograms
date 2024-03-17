package Start1;
class Employee{
	private int salary;
	public Employee(int salary) {
		this.salary=salary;
	}
	public void work() {
		System.out.println("Working as an Employee.");
	}
	public int getSalary() {
		return(salary);
	}
}
class HRManager extends Employee{
	public HRManager(int salary) {
		super(salary);
	}
	public void work() {
		System.out.println("Working as a HRManager. Manages Employees.");
	}
	public void addEmployee() {
		System.out.println("Adding new employee.");
	}
}
public class EmployeeProgram {
	public static void main(String[] args) {
		Employee e1=new Employee(50000);
		HRManager h1 = new HRManager(100000);
		e1.work();
		System.out.println("Employee e1's Salary: "+e1.getSalary());
		h1.work();
		System.out.println("HRManager h1's Salary: "+h1.getSalary());
		h1.addEmployee();
	}
}

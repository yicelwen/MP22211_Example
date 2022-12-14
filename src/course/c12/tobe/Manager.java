package course.c12.tobe;

public class Manager extends Employee {
	private String managedDept;

	public Manager(int empId, String name, String ssn, double salary, String managedDept) {
		super(empId, name, ssn, salary);
		this.managedDept = managedDept;
	}

	public String getManagedDept() {
		return managedDept;
	}

	public static void main(String args[]) {
		Manager mgr = new Manager(102, "Barbara Jones", "107-99-9078", 109345.67, "Marketing");
		mgr.raiseSalary(10000.00); // 來自繼承
		String dept = mgr.getManagedDept(); // 自己特化
	}
}

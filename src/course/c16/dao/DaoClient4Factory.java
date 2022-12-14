package course.c16.dao;

public class DaoClient4Factory {

	public void addEmployee(Employee e) {
		EmployeeDao dao = EmployeeDaoFactory.createEmployeeDao();
		dao.add(e);
	}

	public void updateEmployee(Employee e) {
		EmployeeDao dao = EmployeeDaoFactory.createEmployeeDao();
		dao.update(e);
	}

	public void deleteEmployee(Employee e) {
		EmployeeDao dao = EmployeeDaoFactory.createEmployeeDao();
		dao.delete(e.getId());
	}

}

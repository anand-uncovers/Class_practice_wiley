package com.wiley.jdbcapp1;

public interface EmployeeDao {

	//Create employee
	public void createEmployee(Employee emp);
	//show all employees
	public void getAllEmployees();
	//show employees based on id
	public void getEmpById(int id);
	//update employee
	public void updateEmpNameById(int id,String name);
	//delete employee
	public void deleteEmpById(int id);
}

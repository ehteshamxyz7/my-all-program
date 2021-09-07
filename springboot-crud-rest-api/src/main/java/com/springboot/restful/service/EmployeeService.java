package com.springboot.restful.service;

import java.util.List;


import com.springboot.restful.model.Employee;

public interface EmployeeService {
	Employee saveEmp(Employee employee);

	List<Employee> getAllEmployees();


	Employee getEmployeeById(long id);


	Employee updatEmployee(Employee employee, long id);

	void deleteEmployee(long id);

}

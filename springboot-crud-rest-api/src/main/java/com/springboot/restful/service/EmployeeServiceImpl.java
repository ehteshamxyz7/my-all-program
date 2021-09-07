package com.springboot.restful.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restful.exception.ResourceNotFoundException;
import com.springboot.restful.model.Employee;
import com.springboot.restful.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmp(Employee employee) {
		return employeeRepository.save(employee);
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	
	}

	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.getById(id);
	
	}

	

	@Override
	public Employee updatEmployee(Employee employee, long id) {
		Employee existEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		existEmployee.setFirstName(employee.getFirstName());
		existEmployee.setLastName(employee.getLastName());
		existEmployee.setEmail(employee.getEmail());
		employeeRepository.save(existEmployee);
		return existEmployee;
	
	}

	@Override
	public void deleteEmployee(long id) {
		employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);

	}

}

package com.springboot.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restful.model.Employee;
import com.springboot.restful.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// Build create employee REST API
	@PostMapping("/add")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee) {
		employeeService.saveEmp(employee);
		return new ResponseEntity<Employee>(HttpStatus.CREATED);

	}

	// Build all employee REST API
	@GetMapping("/get")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();

	}

	// Build get employee By id REST API
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeByid(@PathVariable("id") long employeeId) {
		employeeService.getEmployeeById(employeeId);
		return new ResponseEntity<Employee>(HttpStatus.OK);
	}

	// update employee REST API
	@PutMapping("{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		employeeService.updatEmployee(employee, id);
		return new ResponseEntity<String>("Employee update successfull!.", HttpStatus.OK);

	}

	// build REST API
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id) {
		// Delete employee from DB
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee delete successfully!.", HttpStatus.OK);
	}

}

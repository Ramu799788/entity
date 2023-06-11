package com.example.Curdyt.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Curdyt.Entity.Employee;
import com.example.Curdyt.Service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
/*
 * @Autowired private Formatter formatter;
 * (required = false)
 */
	 
	
	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeservice.saveEmployee(employee);
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") Long id) {
		return employeeservice.getEmployeeById(id);
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
	 	return employeeservice.getAllEmployee();
	}
	
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
		return employeeservice.updateEmployee(id, employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") Long id) {
		return employeeservice.deleteEmployee(id);
	}

}

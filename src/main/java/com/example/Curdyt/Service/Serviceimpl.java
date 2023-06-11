package com.example.Curdyt.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Curdyt.Entity.Employee;
import com.example.Curdyt.Repository.EmployeeRepository;

public class Serviceimpl implements EmployeeService {
	@Autowired //inject repository dependency
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee); //save employee
	}
	
	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) return employee.get();
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>(); //create list of employees variable
		employeeRepository.findAll().forEach(employee ->employees.add(employee)); // keep each employee in employees list
		return employees;
	}
	
	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Optional<Employee> employeeById = employeeRepository.findById(id);
		
		if(employeeById.isPresent()) { 
			Employee updatedEmployee = employeeById.get();
		
			updatedEmployee.setId(employee.getId());
			updatedEmployee.setName(employee.getName());
			updatedEmployee.setSalary(employee.getSalary());
			updatedEmployee.setEmail(employee.getEmail());
			updatedEmployee.setAddress(employee.getAddress());
			updatedEmployee.setPhoneno(employee.getPhoneno());
			return employeeRepository.save(updatedEmployee);
		}
		
		return null;
	}

	@Override
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id);//delete employee by id
		return "id" + id + "is deleted successfully"; 
	}
}

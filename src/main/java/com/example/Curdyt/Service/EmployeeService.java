package com.example.Curdyt.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Curdyt.Entity.Employee;
@Service
public interface EmployeeService {
	List<Employee> getAllEmployee();
	Employee getEmployeeById(Long id);
	Employee saveEmployee( Employee employee);
	String deleteEmployee(Long id);
	Employee updateEmployee(Long id, Employee employee);

}

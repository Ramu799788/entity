package com.example.Curdyt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Curdyt.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	

}

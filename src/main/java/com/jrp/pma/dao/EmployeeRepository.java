package com.jrp.pma.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jrp.pma.entities.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	@Override
	public List<Employee> findAll();
	
//	@Query(antiveQuery=true, value="SELECT e.first_name as firstName, e.last_name as lastName, count(pe.employee_id) as projectCount\r\n"
//			+ "FROM employee e LEFT JOIN project_employee pe \r\n"
//			+ "ON pe.employee_id = e.employee_id\r\n"
//			+ "GROUP BY e.first_name, e.last_name\r\n"
//			+ "ORDER BY 3 DESC")
//	public List<> employeeProjects;
}

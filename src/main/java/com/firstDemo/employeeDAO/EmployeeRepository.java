package com.firstDemo.employeeDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.firstDemo.entity.Employee;

@Repository
public class EmployeeRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addEmployee(Employee e) {
		String query="insert into employee(fName,lName,location) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,e.getfName(),e.getlName(),e.getLocation());
		return r;
	}

}

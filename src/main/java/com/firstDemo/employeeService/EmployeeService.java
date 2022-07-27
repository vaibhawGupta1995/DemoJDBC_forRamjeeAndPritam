package com.firstDemo.employeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstDemo.employeeDAO.EmployeeRepository;
import com.firstDemo.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public int service(Employee emp) {
		//business logic
		int r = employeeRepository.addEmployee(emp);
		return r;
	}
	
}

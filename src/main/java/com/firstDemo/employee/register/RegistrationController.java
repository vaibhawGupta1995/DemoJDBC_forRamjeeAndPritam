package com.firstDemo.employee.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.firstDemo.employeeService.EmployeeService;
import com.firstDemo.entity.Employee;

@Controller
public class RegistrationController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/registration")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/successRegister")
	public String successRegister(@ModelAttribute Employee employee) {
		
		employeeService.service(employee);
		return "successRegistration";
	}
	
	
//	@RequestMapping("/successRegister")
//	public String successRegister(@RequestParam("fName") String fname) {
//		
//		System.out.println(fname);
//		
//		return "successRegistration";
//	}
}

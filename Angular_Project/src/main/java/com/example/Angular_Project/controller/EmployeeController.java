package com.example.Angular_Project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Angular_Project.entity.Country;
import com.example.Angular_Project.entity.Employee;
import com.example.Angular_Project.service.Employee_Service;
import com.example.Angular_Project.service.Employee_Service_imp;




@RestController
@RequestMapping(value = "/employee")
public class EmployeeController 
{
	
	@Autowired
	private Employee_Service service;
	

	@PostMapping(value = "/addEmployee")
    public String addEmployee(@RequestBody Employee employee) 
	{
		String msg = service.addEmployee(employee);
		
			return msg;
	}
	
	@GetMapping(value = "/getAllEmployee")
	public  List<Employee> getAllEmployee() {
		List<Employee> employees = service.getAllEmployee();
		 return  employees;

	}
	
	@GetMapping(value = "/getPerticularEmployee")
	public  Employee getPerticularEmployee(@RequestParam int id) {
		Employee employee = service.getPerticularEmployee(id);
		//if(employee==null) {
		//	return "null";
		//}
		//else {
		 return  employee;
		//}

	}
	@PutMapping(value = "/updateEmployee")
	public String updateProduct(@RequestBody Employee employee) {
		boolean b = service.updateEmployee(employee);
		if(b) {
			
			return "Employee Update";
		} else {
			
			return "Employee Not Update";
		}

	}
	
	@DeleteMapping(value="/DeleteEmployee")
	public String eleteEmployee(@RequestParam int id) {
	boolean b = service.deleteEmployee(id);
	if(b) {
		
		return "Employee Deleted";
	} else {
		
		return "Employee Not Deleted";
	}

}
	@GetMapping(value = "/getAllCountry")
	public List<Country> getAllCountry() {
		List<Country> country = service.getAllCountry();
		 return  country;

	
	
	}
	
	@GetMapping(value = "/getPerticularCountry")
	public  Country getPerticularCountry(@RequestParam int id) {
		Country country = service.getPerticularCountry(id);
		
		 return  country;
		

	}
	
}
	


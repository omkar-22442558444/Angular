package com.example.Angular_Project.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Angular_Project.dao.Employee_Dao;
import com.example.Angular_Project.dao.Employee_Dao_imp;
import com.example.Angular_Project.entity.Country;
import com.example.Angular_Project.entity.Employee;
import com.example.Angular_Project.entity.Registration;

@Service
public class Employee_Service_imp implements Employee_Service {
	@Autowired
	private Employee_Dao dao;
	
	@Override
	public String addEmployee(Employee employee) {
		String msg=dao.addEmployee(employee);
		return msg;
	}

	@Override
	public List<Employee> getAllEmployee() {
	List<Employee> employees=dao.getAllEmployee();
		return employees;
	}

	@Override
	public Employee getPerticularEmployee(int id) {
		Employee employee=dao.getPerticularEmployee(id);
		return employee;
	}

	@Override
	public Boolean updateEmployee(Employee employee) {
		boolean b=dao.updateEmployee(employee);
		return b;
	}

	@Override
	public Boolean deleteEmployee(int id) {
		boolean b=dao.deleteEmployee(id);
		return b;
	}

	@Override
	public String addCountry(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> getAllCountry() {
		List<Country> country = dao.getAllCountry();
		return country;
	}

	@Override
	public Country getPerticularCountry(int cid) {
		Country country=dao.getPerticularCountry(cid);
		return country;
	}

	@Override
	public Boolean updateCountry(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteCountry(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, Registration> login(Registration reg) {
		HashMap<String,Registration> map=new HashMap<String, Registration>();
		Registration obj=dao.login(reg);
		if(obj!=null) {
			//map.put("msg","Valid user");
			map.put("Valid User",obj);
			}
		else {
			//map.put("msg","Invalid user");
			map.put("Invalid user",obj);
		}
		return map;
	}

}

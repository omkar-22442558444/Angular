package com.example.Angular_Project.dao;

import java.util.HashMap;
import java.util.List;

import com.example.Angular_Project.entity.Country;
import com.example.Angular_Project.entity.Employee;
import com.example.Angular_Project.entity.Registration;

public interface Employee_Dao {
	public String addEmployee(Employee employee);
	public List<Employee> getAllEmployee();
	public Employee getPerticularEmployee(int id);
	public Boolean updateEmployee(Employee employee);
	public Boolean deleteEmployee(int id);
	public String addCountry(Country country);
	public List<Country> getAllCountry();
	public Country getPerticularCountry(int cid);
	public Boolean updateCountry(int cid);
	public Boolean deleteCountry(int cid);
	public Registration login(Registration reg);
}

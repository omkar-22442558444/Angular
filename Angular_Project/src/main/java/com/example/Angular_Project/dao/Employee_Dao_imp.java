package com.example.Angular_Project.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Angular_Project.entity.Country;
import com.example.Angular_Project.entity.Employee;
import com.example.Angular_Project.entity.Registration;



@Repository
public class Employee_Dao_imp implements Employee_Dao {
	@Autowired
	private SessionFactory sf;
	@Override
	public String addEmployee(Employee employee) {
		Session session = null;
		boolean b = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();

			Employee employees = session.get(Employee.class, employee.getName());
			if (employee == null) {
				session.save(employees);
				transaction.commit();
			
			}

		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	
	
		return "Added Successfully !";
	}

	@Override
	public List<Employee> getAllEmployee() {
		Session session = null;
		List<Employee> employees = new ArrayList<>();
		try {
			session = sf.openSession();
			Criteria criteria = session.createCriteria(Employee.class);
			employees = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employees;
	}

	
	@Override
	public Employee getPerticularEmployee(int id) {
		
		Session session = sf.openSession();
		Employee employee = null;
		try {
			employee = session.get(Employee.class,id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}


	@Override
	public Boolean updateEmployee(Employee employee) {
		Session session = null;
		boolean b = false;
		try {
			
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(employee);
			transaction.commit();
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	

	@Override
	public Boolean deleteEmployee(int id) {
		Session session = null;
		boolean b = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Employee employee = session.load(Employee.class,id);
			session.delete(employee);

			transaction.commit();
			b = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return b;
		
	}

	@Override
	public String addCountry(Country country) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Country> getAllCountry() {
		Session session = null;
		List<Country> country = new ArrayList<>();
		try {
			session = sf.openSession();
			Criteria criteria = session.createCriteria(Country.class);
			country = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return country;
	}
	

	@Override
	public Country getPerticularCountry(int cid) {
		// TODO Auto-generated method stub
		return null;
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
	public Registration login(Registration reg) {
		Session session = null;
		
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();

			Registration reguser = session.get(Registration.class, reg.getUsername());
			if (reguser == null) {
				session.save(reg);
				transaction.commit();
			 }
			}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	
	
		return reg;
		
	}

	
		
}




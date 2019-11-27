package com.SpringBootwithJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBootwithJpa.dao.EmployeeRepository;
import com.SpringBootwithJpa.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
		return employee;
	}

	@Override
	public Employee readEmployeeById(int empId) {
		
		return this.employeeRepository.findById(empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return null;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		
		return null;
	}
	
	@Override
	public List<Employee> getAllEmployee(){
		
		return this.employeeRepository.findAll();
	}

}

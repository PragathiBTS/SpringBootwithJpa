package com.SpringBootwithJpa.service;

import java.util.List;

import com.SpringBootwithJpa.model.Employee;

public interface EmployeeService 
{
	public Employee createEmployee(Employee employee);
	public Employee readEmployeeById(int empId);
	public Employee updateEmployee(Employee employee);
	public Employee deleteEmployeeById(int empId);
	public List<Employee> getAllEmployee();

}

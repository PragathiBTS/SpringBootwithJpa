package com.SpringBootwithJpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.SpringBootwithJpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	public Employee findById(int val);
	public Employee findByEmpName(String str);
	public List<Employee> findAll();
	public Employee findByIdAndEmpName(int abc,String efg);
}

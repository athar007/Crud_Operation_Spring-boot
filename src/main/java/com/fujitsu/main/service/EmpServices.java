package com.fujitsu.main.service;

import java.util.List;

import com.fujitsu.main.entity.Employee;

public interface EmpServices {
	List<Employee> findAllEmployee();
	Employee findByEmployeeId(int emp_id);
	 String deleteByEmployeeId(int emp_id); 
	 Employee updateByEmployeeId(Employee emp, int emp_id);
	 Employee saveEmp(Employee emp); 
	 Employee createEmp(Employee emp);

}

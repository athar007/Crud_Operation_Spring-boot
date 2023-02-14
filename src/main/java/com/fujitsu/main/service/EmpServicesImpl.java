package com.fujitsu.main.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fujitsu.main.entity.Employee;
import com.fujitsu.main.repository.EmpRepository;

@Service
public class EmpServicesImpl implements EmpServices {
	
	@Autowired
	private EmpRepository emprepo;
	
	@Override
	public List<Employee> findAllEmployee(){
		return (List<Employee>) emprepo.findAll();
	}
	
	//@SuppressWarnings("deprecation")
	@Override 
	public Employee findByEmployeeId(int emp_id) {
		System.out.println("test before");
		return emprepo.findById(emp_id).get();
	}
	
	@Override 
	public String deleteByEmployeeId(int emp_id) { 
		emprepo.deleteById(emp_id);
	    return "Delete Successfully"; 
	    }
	  @Override 
	  public Employee updateByEmployeeId(Employee emp, int emp_id) { 
		  Employee employee = emprepo.findById(emp_id).get();
		  System.out.println(employee);
		  if(Objects.nonNull(emp.getName()) && !"".equalsIgnoreCase(emp.getName())) {
			  employee.setName(emp.getName()); 
		  }
		  if(Objects.nonNull(emp.getAge()) && emp.getAge()!=employee.getAge()) {
			  employee.setAge(emp.getAge()); 
			  }
		 if(Objects.nonNull(emp.getCountry()) && !"".equalsIgnoreCase(emp.getCountry())) {
			 employee.setCountry(emp.getCountry()); 
			 }
		 if(Objects.nonNull(emp.getDesignation()) && !"".equalsIgnoreCase(emp.getDesignation())) {
			 employee.setDesignation(emp.getDesignation()); 
			 }
		 if(Objects.nonNull(emp.getDepartment()) && !"".equalsIgnoreCase(emp.getDepartment())) {
			 employee.setDepartment(emp.getDepartment()); 
		 }
	     return emprepo.save(employee);
	 }
	 @Override 
	 public Employee createEmp(Employee emp) { 
		 return emprepo.save(emp);
	 }
	 @Override
	 public Employee saveEmp(Employee emp) { 
		 return emprepo.save(emp);
	 }
	

}

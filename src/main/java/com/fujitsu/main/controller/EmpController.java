package com.fujitsu.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fujitsu.main.entity.Employee;
import com.fujitsu.main.service.EmpServicesImpl;

@RestController
public class EmpController {
	
	@Autowired
	private EmpServicesImpl services;
	
	@GetMapping("/")
    public String welcome()
    {
        return "<html><body>"
            + "<h1>WELCOME</h1>"
            + "</body></html>";
    }
	
	@GetMapping("/employee") 
	 public List<Employee> getAllEmployee() {
	 System.out.print("scsasdsd"); 
	 return services.findAllEmployee();
	 }
	@GetMapping("/employee/{id}")
    public Employee findById(
        @PathVariable(value = "id") int emp_id)
    {
        return services.findByEmployeeId(emp_id);
    }
	@DeleteMapping("/employee/{id}")
    public String deleteById(
        @PathVariable(value = "id") int emp_id)
    {
		services.deleteByEmployeeId(emp_id);
        return "Deleted Sucessfully";
    }
	
	@PutMapping("/employee/{id}")
    public Employee updateById(@RequestBody Employee emp,
        @PathVariable(value = "id") int emp_id)
    {
		services.updateByEmployeeId(emp, emp_id);
        return emp;
    }
	
	@PostMapping("/employee/add")
    public Employee createEmp(@RequestBody Employee emp )
    {
        return services.createEmp(emp);
    }

}

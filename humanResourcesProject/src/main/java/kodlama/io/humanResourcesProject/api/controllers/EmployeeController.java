package kodlama.io.humanResourcesProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.humanResourcesProject.business.abstracts.EmployeeService;
import kodlama.io.humanResourcesProject.entities.concretes.Employee;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {
private EmployeeService employeeService;
@Autowired
public EmployeeController(EmployeeService employeeService) {
	super();
	this.employeeService = employeeService;
}

@PostMapping("/add")
public void add(@RequestBody Employee employee) {
	employeeService.Add(employee);
	
	
}
}

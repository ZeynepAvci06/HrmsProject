package kodlama.io.humanResourcesProject.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.humanResourcesProject.business.abstracts.EmployeeService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employee/")
public class EmployeesController {
	private EmployeeService employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Employee employee) {
		return employeeService.Add(employee);

	}

	@GetMapping("findById")
	public DataResult<Employee> findById(@RequestParam int id) {

		return this.employeeService.findById(id);

	}

//contoller ise manager ile ilişkili
	@GetMapping("findAll")
	public DataResult<List<Employee>> findAll() {

		return employeeService.findAll();

	}

}

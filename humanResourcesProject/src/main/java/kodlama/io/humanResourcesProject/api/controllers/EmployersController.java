package kodlama.io.humanResourcesProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.humanResourcesProject.business.abstracts.EmployerService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.Employer;

@RequestMapping("/api/employer/")
@RestController
public class EmployersController {
	private EmployerService employerService;
@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
@PostMapping("add")
public Result add(@RequestBody Employer employer) {
	return this.employerService.add(employer);
}


@GetMapping("findById")
public DataResult<Employer> findById(@RequestParam int id){
	return this.employerService.findById(id);
	
}
@GetMapping("findAll")
public DataResult<List<Employer>> findAll(){
	return this.employerService.findAll();
	
	
}
}

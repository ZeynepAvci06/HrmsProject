package kodlama.io.humanResourcesProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.humanResourcesProject.business.abstracts.JobPositionService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.JobPosition;

@RequestMapping("/api/jobPositions/")
@RestController
public class JobPositionsController {
	private JobPositionService jobPositionService;

@Autowired
public JobPositionsController(JobPositionService jobPositionService) {
super();
this.jobPositionService=jobPositionService;
}
@GetMapping("findAll")
public DataResult<List<JobPosition>> findAll() {
	return this.jobPositionService.findAll();
			
}

@GetMapping("findById")
public DataResult<JobPosition> findById(@RequestParam int id){
	return this.jobPositionService.findById(id);
}
 
@PostMapping("add")
public Result add(@RequestBody JobPosition jobPosition) {
	return this.jobPositionService.add(jobPosition);
}

}

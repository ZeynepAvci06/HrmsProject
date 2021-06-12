package kodlamaio.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.entities.concret.JobSeeker;

@RestController
@RequestMapping("/api/jobSeeker")
public class JobSeekerController {

	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		this.jobSeekerService = jobSeekerService;
	}

	@PostMapping("/save")
	public boolean saveJobSeeker(@RequestBody JobSeeker jobSeeker) {
	
		return this.jobSeekerService.save(jobSeeker);

	}
}

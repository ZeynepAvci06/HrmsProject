package kodlama.io.humanResourcesProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.humanResourcesProject.business.abstracts.CandidateService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidate/")

public class CandidatesController  { 
	private CandidateService candidateService;
	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("findAll")
	public DataResult<List<Candidate>>findAll(){
		return this.candidateService.findAll();
	}
	
	@GetMapping("findById")
	public DataResult <Candidate> findById(@RequestParam int id){
		return this.candidateService.findById(id);
	}
	
	// bu bir denemek amaçlıdır.
	@PostMapping("add")
	public Result add (@RequestBody Candidate candidate) {
		return this.candidateService.add(candidate);
	}
}
	
	



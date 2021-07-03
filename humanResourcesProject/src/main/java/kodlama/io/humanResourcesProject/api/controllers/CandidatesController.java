package kodlama.io.humanResourcesProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.humanResourcesProject.business.abstracts.CandidateService;

@RestController
@RequestMapping("/api/candidate")

public class CandidatesController  { 
	private CandidateService candidateService;
	@Autowired
	public CandidatesController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
}
	
	



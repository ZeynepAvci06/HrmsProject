package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.Candidate;

public interface CandidateService { 
	 Result  add(Candidate candidate);
	 DataResult<Optional<Candidate>>  findById (int id);
	 DataResult<List<Candidate>> findAll();
	 

}

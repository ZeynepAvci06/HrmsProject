package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;


import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.Employer;

public interface EmployerService {
	Result add(Employer employer);
	Result update(Employer employer);
	Result delete(int id);
	
	
	DataResult<Employer> findById(int id);
	DataResult<List<Employer>> findAll();
	
	DataResult List<Employer> getAllByVerify();
	Result changeIsVerifiedByEmployee(int employerId);
	
	long countById(id);
	long countGetAll();
	

}

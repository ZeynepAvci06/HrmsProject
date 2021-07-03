package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.Employer;

public interface EmployerService {
	Result add(Employer employer);
	DataResult<Optional<Employer>> findById(int id);
	DataResult<List<Employer>> findAll();

}

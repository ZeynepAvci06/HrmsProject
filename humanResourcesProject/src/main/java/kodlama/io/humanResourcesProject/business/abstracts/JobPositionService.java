package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.JobPosition;

public interface JobPositionService {
	Result add (JobPosition jobPosition);
	DataResult<Optional<JobPosition>> findById (int id);
	DataResult<List<JobPosition>> findAll();
	

}

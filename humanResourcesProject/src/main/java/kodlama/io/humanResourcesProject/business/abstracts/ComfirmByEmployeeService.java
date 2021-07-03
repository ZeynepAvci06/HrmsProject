package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.ComfirmByEmployee;
public interface ComfirmByEmployeeService {
	Result add(ComfirmByEmployee comfirmByEmployee);
	DataResult<Optional<ComfirmByEmployee>> findById(int id);
	DataResult<List<ComfirmByEmployee>> findAll(int id);
	

}

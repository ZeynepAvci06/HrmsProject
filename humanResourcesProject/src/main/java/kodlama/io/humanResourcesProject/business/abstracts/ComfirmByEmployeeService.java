package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;


import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.ComfirmByEmployee;
public interface ComfirmByEmployeeService {
	Result add(ComfirmByEmployee comfirmByEmployee);
	DataResult<ComfirmByEmployee> findById(int id);
	DataResult<List<ComfirmByEmployee>> findAll();
	

}

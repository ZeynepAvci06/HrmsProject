package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.User;

public interface UserService {
	Result add (User user);
	DataResult<Optional<User>> findById(int id);
	DataResult<List<User>> findAll();

}

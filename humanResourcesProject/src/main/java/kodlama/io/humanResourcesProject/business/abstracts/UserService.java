package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;


import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.User;

public interface UserService {
	Result add (User user);
	DataResult <User> findById(int id);
	DataResult <List<User>> findAll();

}

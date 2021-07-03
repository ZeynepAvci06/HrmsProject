package kodlama.io.humanResourcesProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.humanResourcesProject.business.abstracts.UserService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.core.results.SuccessDataResult;
import kodlama.io.humanResourcesProject.core.results.SuccessResult;
import kodlama.io.humanResourcesProject.dataAccess.abstracts.UserDao;
import kodlama.io.humanResourcesProject.entities.concretes.User;
@Service
public class UserManager  implements UserService{
	// Dao'yu constructor ile enjecte ediyoruz.
	private UserDao userDao;

@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	

	@Override
	public Result add( User user) {
		this.userDao.save(user);
		return new SuccessResult("Sistem çalışanı eklendi");
	}

	@Override
	public DataResult<Optional<User>> findById(int id) {
		
		return new SuccessDataResult<Optional<User>> (this.userDao.findById(id),"Id'ye göre data bulundu");
	}

	@Override
	public DataResult<List<User>> findAll() {
		
		return new SuccessDataResult<List<User>>(this.userDao.findAll(),"Data bulundu");
		
	}

}
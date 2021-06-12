package kodlamaio.hrms.business.concret;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.UserDao;

@Service
public class UserManager implements UserService {

	private UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
	
	@Override
	public boolean existsByEmail(String email) {
		return this.userDao.existsByEmail(email);
	}

}

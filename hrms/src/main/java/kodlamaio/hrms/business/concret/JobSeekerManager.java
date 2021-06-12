package kodlamaio.hrms.business.concret;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.entities.concret.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private UserService userService;
	private JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, UserService userService) {
		this.userService = userService;
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public boolean save(JobSeeker jobSeeker) {
		boolean isOperation = false;
		try {
			if (this.userService.existsByEmail(jobSeeker.getEmail())) {
				isOperation = false;
			} else {
				this.jobSeekerDao.save(jobSeeker);
				isOperation = true;
			}

		} catch (Exception e) {
			throw e;
		}
		return isOperation;
	}

}

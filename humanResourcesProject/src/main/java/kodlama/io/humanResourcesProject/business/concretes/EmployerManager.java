package kodlama.io.humanResourcesProject.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.humanResourcesProject.business.abstracts.EmployerService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.core.results.SuccessDataResult;
import kodlama.io.humanResourcesProject.core.results.SuccessResult;
import kodlama.io.humanResourcesProject.dataAccess.abstracts.EmployerDao;
import kodlama.io.humanResourcesProject.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	@Autowired
	public EmployerManager (EmployerDao employerDao) {
	super();
	this.employerDao = employerDao;
			
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("İşveren eklendi");
	}

	
	@Override
	public DataResult<List<Employer>> findAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data listelendi");
		
	}

	@Override
	public DataResult<Employer> findById(int id) {
		
		return new SuccessDataResult<Employer>(this.employerDao.findById(id),"Id'ye göre İşveren eklendi");
		
	}

	@Override
	public Result update(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result changeIsVerifiedByEmployee(int employerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long countById() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long countGetAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <Employer> void getAllByVerify() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	}

	
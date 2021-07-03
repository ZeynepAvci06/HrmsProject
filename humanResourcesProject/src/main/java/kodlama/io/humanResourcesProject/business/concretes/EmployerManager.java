package kodlama.io.humanResourcesProject.business.concretes;

import java.util.List;
import java.util.Optional;

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
	public DataResult<Optional<Employer>> findById(int id) {
		return new SuccessDataResult<Optional<Employer>>(this.employerDao.findById(id),"Id'ye göre data bulundu");
	}

	@Override
	public DataResult<List<Employer>> findAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data listelendi");
		
	}	
	
	
	
	}

	
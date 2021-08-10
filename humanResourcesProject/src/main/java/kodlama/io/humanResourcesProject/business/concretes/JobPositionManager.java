package kodlama.io.humanResourcesProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.humanResourcesProject.business.abstracts.JobPositionService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.core.results.SuccessDataResult;
import kodlama.io.humanResourcesProject.core.results.SuccessResult;
import kodlama.io.humanResourcesProject.dataAccess.abstracts.JobPositionDao;
import kodlama.io.humanResourcesProject.entities.concretes.JobPosition;
import net.bytebuddy.asm.Advice.This;



@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao jobPositionDao;
@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		
		return new SuccessResult("İş pozisyonu eklendi");
	}

	@Override
	public DataResult<JobPosition> findById(int id) {
		
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.findById(id),"Id'ye göre iş pozisyonu bulundu");
	}

	@Override
	public DataResult<List<JobPosition>> findAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"İş pozisyonu listelendi");
		
	}

	


}

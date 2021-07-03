package kodlama.io.humanResourcesProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlama.io.humanResourcesProject.business.abstracts.CandidateService;
import kodlama.io.humanResourcesProject.core.results.DataResult;

import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.core.results.SuccessDataResult;
import kodlama.io.humanResourcesProject.core.results.SuccessResult;
import kodlama.io.humanResourcesProject.dataAccess.abstracts.CandidateDao;
import kodlama.io.humanResourcesProject.entities.concretes.Candidate;


@Service
public class CandidateManager implements CandidateService{

	private CandidateDao candidateDao;	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Aday eklendi");
	}

	@Override
	public DataResult<Optional<Candidate>> findById(int id) {
		
		return new SuccessDataResult<Optional<Candidate>>(this.candidateDao.findById(id), "Id'ye göre data bulundu");
	}

	@Override
	public DataResult<List<Candidate>> findAll() {
		
		return new SuccessDataResult<List<Candidate>> (this.candidateDao.findAll(),"Data listelendi") ;
		
	}

	
}

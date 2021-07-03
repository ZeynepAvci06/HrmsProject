package kodlama.io.humanResourcesProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.humanResourcesProject.business.abstracts.VerificationService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.dataAccess.abstracts.VerificationCodeDao;

@Service
public class VerificationManager implements VerificationService{
	
	private VerificationCodeDao verificationCodeDao;
	
@Autowired		


public VerificationManager(VerificationCodeDao verificationCodeDao) {
	super();
	this.verificationCodeDao = verificationCodeDao;
}

@Override
public Result add(VerificationService verification) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public DataResult<Optional<VerificationService>> findById(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public DataResult<List<VerificationService>> findAll(int id) {
	// TODO Auto-generated method stub
	return null;
}
	
	

}

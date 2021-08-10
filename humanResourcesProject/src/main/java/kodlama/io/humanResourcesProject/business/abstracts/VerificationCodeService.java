package kodlama.io.humanResourcesProject.business.abstracts;

import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	Result add(VerificationCode verificationCode);
	DataResult<VerificationCode> findById(int id);
	

}

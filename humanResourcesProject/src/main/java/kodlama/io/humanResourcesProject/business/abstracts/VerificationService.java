package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;

public interface VerificationService {
	Result add(VerificationService verification);
	DataResult<Optional<VerificationService>> findById(int id);
	DataResult<List<VerificationService>> findAll (int id);

}

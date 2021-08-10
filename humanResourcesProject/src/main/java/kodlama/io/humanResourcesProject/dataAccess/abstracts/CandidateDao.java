package kodlama.io.humanResourcesProject.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
	
	List<Candidate> findAllEmail(String email);
	List<Candidate> findAllIdentityNumber(String identityNumber);
	Candidate findByIdentityNumber (String identityNumber );
	Candidate findById(int id);
}

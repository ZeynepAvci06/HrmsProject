package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{

}

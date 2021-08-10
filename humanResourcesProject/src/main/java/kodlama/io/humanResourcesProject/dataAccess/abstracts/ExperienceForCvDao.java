package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.ExperienceForCv;

public interface ExperienceForCvDao extends JpaRepository<ExperienceForCv, Integer> {

	
	ExperienceForCv getById(int id);
	List<ExperienceForCv> getAllCandidate_id(int id);
	List<ExperienceForCv> getAllCandidate_idOrderByLeaveDateDes(int id);
}

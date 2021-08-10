package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.SkillForCv;

public interface SkillForCvDao extends JpaRepository<SkillForCv, Integer>{
	
	SkillForCv getById (int id);
    List<SkillForCv> getAllCandidate_id(int id);

}

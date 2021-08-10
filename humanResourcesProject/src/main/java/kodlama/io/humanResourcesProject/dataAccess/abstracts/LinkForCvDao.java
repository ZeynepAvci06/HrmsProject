package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.LinkForCv;

public interface LinkForCvDao extends JpaRepository<LinkForCv, Integer> {
	
	LinkForCv getById(int id);
	List<LinkForCv> getAllCandidate_id(int id);
	

}

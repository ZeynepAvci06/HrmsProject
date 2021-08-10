package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.ImageForCv;

public interface ImageForCvDao extends JpaRepository<ImageForCv, Integer>{
	
	
	ImageForCv getById(int id);
	ImageForCv getCandidate_id(int id);

}

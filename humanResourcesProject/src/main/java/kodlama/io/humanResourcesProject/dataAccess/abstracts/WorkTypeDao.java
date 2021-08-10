package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.WorkType;

public interface WorkTypeDao  extends JpaRepository<WorkType,Integer>{
	
	WorkType getById(int id);
	
	WorkType getByWorkType(String workType);

}

package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.JobAdvertConfirmation;

public interface JobAdvertConfirmationDao  extends JpaRepository<JobAdvertConfirmation, Integer>{
     
     
}

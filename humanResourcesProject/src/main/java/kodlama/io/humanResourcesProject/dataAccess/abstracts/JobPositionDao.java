package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{
Optional<JobPosition> findById(int id);
}

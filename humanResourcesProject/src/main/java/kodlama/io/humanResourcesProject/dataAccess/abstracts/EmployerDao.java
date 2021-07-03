package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	Optional<Employer> findById(int id);
}

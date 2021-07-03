package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.ComfirmByEmployee;

public interface ComfirmByEmployeeDao extends JpaRepository<ComfirmByEmployee, Integer>{
Optional<ComfirmByEmployee> findById(int id); 
}

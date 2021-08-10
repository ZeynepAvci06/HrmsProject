package kodlama.io.humanResourcesProject.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.ComfirmByEmployee;

public interface ComfirmByEmployeeDao extends JpaRepository<ComfirmByEmployee, Integer>{
ComfirmByEmployee findById(int id); 
}

package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.ConfirmByEmployee;

public interface ComfirmByEmployeeDao extends JpaRepository<ConfirmByEmployee, Integer>{

}

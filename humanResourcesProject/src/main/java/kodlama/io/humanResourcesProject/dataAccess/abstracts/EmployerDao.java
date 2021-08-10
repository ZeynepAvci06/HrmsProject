package kodlama.io.humanResourcesProject.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.humanResourcesProject.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	Employer findById(int id);
    List<Employer> findAllEmail(String email);
    
    @Query("From Employer where is_verified = false")
    List<Employer> getAllVerify();
    
    long countById(int id);
    
}

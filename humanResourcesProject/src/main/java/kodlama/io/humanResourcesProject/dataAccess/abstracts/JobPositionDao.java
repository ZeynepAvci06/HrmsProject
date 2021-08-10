package kodlama.io.humanResourcesProject.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.JobPosition;
//JPA Repository bize VeriTabanına findById ile filtrelemeyi(CRUD operasyonlarını,getAll()'u veriyor.) yapabiliyoruz anatasyonlarla
//bu imkanlar elimizin altında.Omayanlarıda kodla yazıyoruz.
public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{
	
     JobPosition findById(int id);
     JobPosition findByJobPosition(String title);
     List<JobPosition> findAllJobPosition(String jobPosition); 
}

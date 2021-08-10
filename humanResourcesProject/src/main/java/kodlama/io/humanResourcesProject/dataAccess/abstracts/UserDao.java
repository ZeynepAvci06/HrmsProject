package kodlama.io.humanResourcesProject.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	User findById(int id); //JPA'da olmadığı için bu kodu kendim yazdım.
	   						//getById'de aynı işi yapar.
}

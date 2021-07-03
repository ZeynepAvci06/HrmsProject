package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
	Optional<User> findById(int id); //findByUserId
}

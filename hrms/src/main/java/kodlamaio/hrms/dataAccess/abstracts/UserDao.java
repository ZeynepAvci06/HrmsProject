package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concret.User;


public interface UserDao extends JpaRepository<User, Integer> {

	boolean existsByEmail(String email);
}

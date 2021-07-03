package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.VerificationCode;

public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer>{
Optional<VerificationCode> findById(int id);
}

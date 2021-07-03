package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	Optional<Employee> findById(int id);

}
//Employee dao veriye erişimi sağladığımız alan.
//verileri getirmek veya verileri göndermek için kullanıyoruz.
//veriye erişim dışında asla hiçbir kod yazılmaz.
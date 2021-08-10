package kodlama.io.humanResourcesProject.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.Employee;



public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	Employee findById(int id);

}
//EmployeeDao veriye erişimi sağladığımız alan.
//verileri getirmek veya verileri göndermek için kullanıyoruz.
//veriye erişim dışında asla hiçbir kod yazılmaz.
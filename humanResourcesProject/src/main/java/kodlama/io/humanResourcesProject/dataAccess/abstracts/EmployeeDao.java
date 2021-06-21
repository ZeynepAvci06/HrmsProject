package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{


}

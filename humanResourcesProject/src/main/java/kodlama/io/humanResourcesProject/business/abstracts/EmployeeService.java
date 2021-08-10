package kodlama.io.humanResourcesProject.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.Employee;

public interface EmployeeService {
	Result Add(Employee employee);//service etmek istediğim operasyonlarımı yazıyorum.

	DataResult<Employee> findById(int id);
	DataResult<List<Employee>> findAll();
}
//interface'imizi service olarak verdiğimiz yer.iş sınıfının interface'i
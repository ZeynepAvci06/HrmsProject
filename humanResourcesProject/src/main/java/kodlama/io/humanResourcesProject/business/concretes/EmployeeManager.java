package kodlama.io.humanResourcesProject.business.concretes;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import kodlama.io.humanResourcesProject.business.abstracts.EmployeeService;
import kodlama.io.humanResourcesProject.dataAccess.abstracts.EmployeeDao;
import kodlama.io.humanResourcesProject.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {
	
private EmployeeDao employeeDao;
@Autowired
public EmployeeManager(EmployeeDao employeeDao) {
	super();
	this.employeeDao = employeeDao;
}
@Override
public void Add(Employee employee) {
	this.employeeDao.save(employee);
	
	
}


}

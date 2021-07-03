package kodlama.io.humanResourcesProject.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import kodlama.io.humanResourcesProject.business.abstracts.EmployeeService;
import kodlama.io.humanResourcesProject.core.results.DataResult;


import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.core.results.SuccessDataResult;
import kodlama.io.humanResourcesProject.core.results.SuccessResult;
import kodlama.io.humanResourcesProject.dataAccess.abstracts.EmployeeDao;
import kodlama.io.humanResourcesProject.entities.concretes.Employee;


@Service
public class EmployeeManager implements EmployeeService {

	private EmployeeDao employeeDao;

	//Manager dao ile ilişki sağlıyor
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public Result Add(Employee employee) {

		
		this.employeeDao.save(employee);
		return new SuccessResult("Sistem çalışanı eklendi.");

	}

	
@Override
public DataResult<Optional<Employee>> findById(int id) {
    return new SuccessDataResult<Optional<Employee>>(this.employeeDao.findById(id),"Id'ye göre Data bulundu");
				
}		

@Override
public DataResult<List<Employee>> findAll() {
	return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Data listelendi");
}
}
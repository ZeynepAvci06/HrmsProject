package kodlama.io.humanResourcesProject.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.humanResourcesProject.entities.concretes.ComfirmByEmployee;
import kodlama.io.humanResourcesProject.business.abstracts.ComfirmByEmployeeService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.core.results.SuccessDataResult;
import kodlama.io.humanResourcesProject.core.results.SuccessResult;
import kodlama.io.humanResourcesProject.dataAccess.abstracts.ComfirmByEmployeeDao;


@ Service
public class ComfirmByEmployeeManager implements  ComfirmByEmployeeService{
private ComfirmByEmployeeDao comfirmByEmployeeDao;
@Autowired
public ComfirmByEmployeeManager(ComfirmByEmployeeDao comfirmByEmployeeDao) {
super();
this.comfirmByEmployeeDao = comfirmByEmployeeDao;
}
@Override
public Result add(ComfirmByEmployee comfirmByEmployee) {
	this.comfirmByEmployeeDao.save(comfirmByEmployee);
	return new SuccessResult("Aday eklendi"); 
	
}

@Override
public DataResult<ComfirmByEmployee> findById(int id) {
	
	return new SuccessDataResult<ComfirmByEmployee>(this.comfirmByEmployeeDao.findById(id),"Id'ye göre data bulundu");
}

@Override
public DataResult<List<ComfirmByEmployee>> findAll() {
	
	return new SuccessDataResult<List<ComfirmByEmployee>>(this.comfirmByEmployeeDao.findAll(),"Data Listelendi");
	
}

	
}

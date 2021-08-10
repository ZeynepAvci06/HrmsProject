package kodlama.io.humanResourcesProject.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.humanResourcesProject.business.abstracts.ComfirmByEmployeeService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.ComfirmByEmployee;

@RequestMapping("/api/comfirmByEmployee/")
@RestController
public class ComfirmByEmployeesController {
	private ComfirmByEmployeeService comfirmByEmployeService;

	@Autowired
	public ComfirmByEmployeesController(ComfirmByEmployeeService comfirmByEmployeeService) {
		super();
		this.comfirmByEmployeService = comfirmByEmployeeService;
	}

// Ürün listesini kullanıcıya sunucaz.
@GetMapping("findAll")
	public DataResult<List<ComfirmByEmployee>> findAll() {
		return this.comfirmByEmployeService.findAll();

	}

//Ürün listesini Id'ye göre kullanıcıya sunuyor.
@GetMapping("findById")
public DataResult<ComfirmByEmployee> findById(@RequestParam int id){
	return this.comfirmByEmployeService.findById(id);
}
//ComfirmByEmployee istiyor olucaz.
@PostMapping        //reguestBody hem istek yapıyor.Hemde al Datan budur diyor.
public Result add(@RequestBody ComfirmByEmployee comfirmByEmployee) {
	return this.comfirmByEmployeService.add(comfirmByEmployee);
}

}

package kodlama.io.humanResourcesProject.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.humanResourcesProject.business.abstracts.UserService;
import kodlama.io.humanResourcesProject.core.results.DataResult;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.User;

@RestController
@RequestMapping("/api/users/")
public class UsersController {
private UserService userService;
@Autowired
public UsersController(UserService userService) {
	super();
	this.userService = userService;
	
}

@GetMapping("findAll")
public DataResult<List<User>> findAll(){
	return this.userService.findAll();
	
}

@GetMapping("findById")
public DataResult<Optional<User>> findById(@RequestParam int id){
	return this.userService.findById(id);
}

//bu bir denemek amaçlı yazılmıştır
@PostMapping("add")
public Result add(@RequestBody User user) {
 return	this.userService.add(user);
}
}

package kodlama.io.humanResourcesProject.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import kodlama.io.humanResourcesProject.business.abstracts.VerificationCodeService;
import kodlama.io.humanResourcesProject.core.results.Result;
import kodlama.io.humanResourcesProject.entities.concretes.VerificationCode;

@RestController
@RequestMapping("/api/verificationCode/")
public class VerificationCodesController {
private VerificationCodeService verificationService;
@Autowired
public  VerificationCodesController(VerificationCodeService verificationService) {
	super();
	this.verificationService = verificationService;
}
  @PostMapping("add")
public Result add(@RequestBody VerificationCode verificationCode) {
	return this.verificationService.add(verificationCode);
}
  
  
  
	
}


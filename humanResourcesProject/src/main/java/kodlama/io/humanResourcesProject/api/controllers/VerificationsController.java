package kodlama.io.humanResourcesProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.humanResourcesProject.business.abstracts.VerificationService;

public class VerificationsController {
	private VerificationService verificationService;
	@Autowired
	public VerificationsController(VerificationService verificationService) {
	}

}

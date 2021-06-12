package kodlamaio.hrms.entities.concret;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employer extends User{

	@Column(name = "company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddress;


	
}


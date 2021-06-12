package kodlamaio.hrms.entities.concret;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class JobSeeker extends User{

	@Column(name = "name")
	private String name;
	
	@Column(name="sur_name")
	private String surName;
	
	@Column(name = "identity_number")
	private Long identityNumber;
	
	@Column(name="birth_of_date")
	private int birtOfDate;
	
	
}

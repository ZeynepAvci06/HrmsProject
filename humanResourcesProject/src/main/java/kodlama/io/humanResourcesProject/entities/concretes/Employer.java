package kodlama.io.humanResourcesProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employers")
@Entity
public class Employer extends User {
	
	
	@Column(name = "company_name")
	private String companyName;

	@Column(name = "web_address")
	private String webAdress;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "is_active")
	private boolean isActive;
 
	@Column(name = "phone_number")
	private String phoneNumber;

}

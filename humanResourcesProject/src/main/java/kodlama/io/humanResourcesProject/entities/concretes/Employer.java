package kodlama.io.humanResourcesProject.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "employers")
@Entity
public class Employer extends User {
	@NotBlank
	@NotNull(message = "Companyname can not be null")
	@Column(name = "company_name")
	private String companyName;
	
    @NotBlank
	@NotNull(message = "WebAdress can not be null")
	@Column(name = "web_address")
	private String webAdress;
    
    
	@Column(name = "created_date")
	private LocalDate createdDate;

	
	@Column(name = "is_active")
	private boolean isActive =false;
    
	@NotBlank
	@NotNull(message = "PhoneNumber can not be null")
	@Column(name = "phone_number")
	private String phoneNumber;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "employer")
	private List<JobAdvert> jobAdvertsiment; 

}

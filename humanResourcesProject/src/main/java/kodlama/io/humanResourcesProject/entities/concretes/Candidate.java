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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidates")
public class Candidate extends User{
	
	
	
	@Column(name="first_name")
	private String firstName;
	 
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="identity_number")
	private String identityNumber;

	@Column(name="birth_year")
	private int brithYear;
	
	@Column(name="created_date")
	private LocalDate createdDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	

}

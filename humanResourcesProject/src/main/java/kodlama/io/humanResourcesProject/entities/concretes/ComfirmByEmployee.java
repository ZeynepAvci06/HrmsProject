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
@Table(name="confirm_by_employee")
public class ComfirmByEmployee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name= "employer_id")
	private int employerİd;
	
	@Column(name= "employee_id")
	private int employeeİd;
	
	@Column(name= "is_confirm")
	private boolean isConfirm;
	
	@Column(name= "confirm_date")
	private LocalDate confirmDate;
	

}

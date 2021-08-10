package kodlama.io.humanResourcesProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Table(name="cv_schools")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class EducationForCv extends Base {
	
	@NotNull(message="SchoolName can not be null")
	@Column(name="school_name")
	private String schoolName;
	
	@NotNull(message="DepartmentName can not be null")
	@Column(name="department_name")
	private String departmentName;
	
	@NotNull(message="StartYear can not be null")
	@Column(name="start_year")
	Private LocalDate startYear;
	
	@Column(name="graduation_year",nullable = true)
	private LocalDate graduationYear;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

}

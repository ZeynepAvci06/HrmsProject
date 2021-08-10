package kodlama.io.humanResourcesProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false
@Table(name="cv_experience")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class ExperienceForCv extends Base {
	
	@NotNull(message="workplace can not be null")
	@Column(name="workplace_name")
	@NotBlank
	private String workplaceName;
	
	
    @NotBlank
    @NotNull(message="Position can not be null")
	@Column(name="position")
	private  String position;
    
    
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Past
    @NotNull(message="StartDate can not be null")
    @Column(name="start_date")
	private LocalDate startDate;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name="leave_date",nullable=true)
	private LocalDate LeaveDate;
	
    @ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;
	
	
	

}

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
@Table(name="cv_skill")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class SkillForCv extends Base{
	
	@NotNull(message="Name can not be null")
	@Column(name="name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;

}

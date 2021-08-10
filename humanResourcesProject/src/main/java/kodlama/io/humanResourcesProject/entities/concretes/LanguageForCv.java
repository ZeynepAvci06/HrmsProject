package kodlama.io.humanResourcesProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper =false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class LanguageForCv extends Base{
	
	@NotNull(message="Language can not be null")
	@Column(name="language")
	private String language;
	
	@NotNull(message="Level can not be null")
	@Max(5)
	@Min(1)
	@Column(name="level")
	private short level;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

}

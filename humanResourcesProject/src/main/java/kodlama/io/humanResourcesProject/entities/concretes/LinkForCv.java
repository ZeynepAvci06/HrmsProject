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

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Data
@Table(name="cv_link")
public class LinkForCv extends Base{
	
	@NotNull(message="Name can not be null")
	@Column(name="name")	
	private String name;
	
	@NotNull(message="Url can not be null")
	@Column(name="url")
	private String url;
	
	@ManyToOne
	@JoinColumn(name="candidate_id")
	private Candidate candidate;

}

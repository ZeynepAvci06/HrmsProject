package kodlama.io.humanResourcesProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@Table(name="cv_cover_letters")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class CoverLetterForCv extends Base{
	
	@Column(name="content")
	private String content;

	public CoverLetterForCv(String content, int candidateId) {
		super();
		this.content = content;
		this.candidate.setId(candidateId);
	}
	
	//@JsonIgnore
	@ManyToOne
	@JoinColumn(name="Candidate_id")
	private Candidate candidate;
}

package kodlama.io.humanResourcesProject.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Table(name="cv_images")
@Data
@Entity
public class ImageForCv extends Base{
	
	@NotNull(message="Url can not be null")
	@Column(name="url")
	private int url;
	
	
	@Column(name="uploaded_at",columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime uploadedAt;
	
	//JsonIgnore
	@OneToOne
	@JoinColumn(name="candidate_id",referencedColumnName="user_id")
	private Candidate candidate;

}

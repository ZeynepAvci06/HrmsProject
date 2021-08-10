package kodlama.io.humanResourcesProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdverts"})
@Table(name="work_types")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class WorkType {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
    @Column(name="id")
	private int id;
	
	@Column(name="work_Type")
	private String workType;

	//JobAdvert tablom work_type ile ilişkilendirilmiş durumda
	@OneToMany(mappedBy = "work_type")
	@JsonIgnore
	private List<JobAdvert> jobAdverts;
}



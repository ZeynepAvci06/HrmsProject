package kodlama.io.humanResourcesProject.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitilizer","handler","jobAdverts"})
@Table(name="workhour_id")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class WorkHour {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@Column(name="work_Hours")
	private String workHour;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="workHour")
	private List<JobAdvert> jobAdverts;   
 
}

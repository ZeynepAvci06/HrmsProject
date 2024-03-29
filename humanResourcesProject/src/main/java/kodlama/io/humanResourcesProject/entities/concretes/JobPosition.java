package kodlama.io.humanResourcesProject.entities.concretes;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitiliazer","hadler","jobAdverts")
@Entity
@Data
@Table(name = "job_positions")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {
    // ORM Yapılarında JPA'nın Hibernate İmplementasyonu 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
    
	
	@NotNull(message="PositionName can not be null")
	@NotBlank
	@Column(name = "position_name")
	private String positionName;
	
	@JsonIgnore
	@Column(name="created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdDate = LocalDateTime.now();
	
	@Column(name = "is_active",columnDefinition = "boolean default true")
	private boolean isActive = true;
	
	@Column(name="is_deleted",columnDefinition = "boolean default false")
	private  boolean isDeleted = false;
	
	@JsonIgnore
	@OneToMany(mappedBy="jobPosition")
	private List<JobAdvert> jobAdverts;
	
	
	
	

}

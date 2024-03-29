package kodlama.io.humanResourcesProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@NoArgsConstructor
@Data
public class Base {
    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private int id;
	
	@JsonIgnore
	@Column(name="created_at", columnDefinition =" dateDefault CURRENT_DATE")
	private LocalDate createdAt = LocalDate.now();
	
	@JsonIgnore
    @Column(name="is_active", columnDefinition = "boolean default true")
	private boolean isActive = true;
    
    @Column(name="is_deleted",columnDefinition = "boolean default false")
	private boolean isDeleted = false;
	
	
	
	
}   



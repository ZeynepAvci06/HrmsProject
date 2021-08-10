package kodlama.io.humanResourcesProject.entities.concretes;

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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","JobAdverts"})
public class City {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id" )
	private int id;
	
	@NotBlank
	@NotNull(message = "CityName can not be null")
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy="city")
	@JsonIgnore
	private List<JobAdvert> jobAdverts;
	

}

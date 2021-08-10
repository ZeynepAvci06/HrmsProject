	package kodlama.io.humanResourcesProject.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="candidates")
public class Candidate extends User{
	@NotBlank
	@NotNull(message="FirstName can not be null")
	@Size(min=2, max=25, message="FirstName must be between 2 and 25 characters")
	@Column(name="first_name")
	private String firstName;
	
	@Size(min=2, max=25, message="LastName must be between 2 and 25 characters")
	@NotBlank
	@NotNull(message="LastName can not be null")
	@Column(name="last_name")
	private String lastName;
	
	
	@Size(min = 11, max = 11, message="IdentityNumber must be 11 characters")
    @NotNull(message="IdentityNumber can not be null")
	@Column(name="identity_number")
	private String identityNumber;

	@Column(name="birth_year")
	private int brithYear;
	
	@Column(name="created_date")
	private LocalDate createdDate;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@JsonIgnore
	@OneToMany(mappedBy="candidate")
	private List<LanguageForCv> languages;
	
	
	@JsonIgnore
	@OneToOne(mappedBy="candidate")
	private ImageForCv images;
	
	@JsonIgnore
	@OneToMany(mappedBy="candidate")
	private List<EducationForCv> educations;
	
	
	@JsonIgnore
	@OneToMany(mappedBy="candidate")
	private List<ExperienceForCv> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy="candidate")
	private List<SkillForCv> skills;
	

	@JsonIgnore
	@OneToMany(mappedBy="candidate")
	private List<CoverLetterForCv> coverLetters;
	
	@JsonIgnore
	@OneToMany(mappedBy="candidate")
	private List<LinkForCv> links;
	
	@Column(name="is_verified",columnDefinition="boolean default false")
	private boolean isVerified = false;
	
	@JsonIgnore
	@OneToMany(mappedBy="candidate")
	private List<Favorites> favorites;
}

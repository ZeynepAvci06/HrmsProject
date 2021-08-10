package kodlama.io.humanResourcesProject.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_adverts")
public class JobAdvert {
    @Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
    
    
    @Column(name="description",length = 3000)
    @Type(type="text")
    @NotBlank
    @NotNull(message = " Description can not be null")
	private String description;
    
    
    @Column(name = "salary_min")
    @Min(3000)
    private int salaryMin;
    
    
    @Column(name="salaryMax")
    private int salaryMax;
    
    
    @Column(name="open_position_count")
    @NotNull(message="positionCount can not be null")
    @Min(value=1)
    private int openPositionCount; 
    
    
    @Future
    @JsonFormat(JsonFormat.Shape.STRİNG,pattern = "yyyy-MM-dd")
    @NotNull ("message = positionCount can not be null")
    @NotNull(message = "deadline can not be null")
    @Column(name="deadline")
    private LocalDate deadline;
    
    
    @Column(name = published_At,columnDefinition ="Date default CURRENT _DATE")
    @NotNull(message = "PublishedAt,can not be null")
    private LocalDate publishedAt = LocalDate.now();
    @Column(name = "created_at",columnDefinition = "Date default CURRENT_DATE")
    //jsonIgnore
    private LocalDate createdAt = LocalDate.now();
    
    @Column(name = "is_open", columnDefinition = "boolean default true")
    private boolean isOpen = true;
    
    
    @Column("name = is_active",columnDefinition = "boolean default false")
    private boolean isActive = false;
    
    
    @JsonIgnore
    @Column(name ="is_deleted",columnDefinition = "boolean default false")
    private boolean isDeleted = false;
    @ManyToOne
    @JoinColumn(name = "job_position_id")
    private JobPosition jobPosition;
    
    @ManyToOne
    @JoinColumn(name="employer_id")
    private Employer employer;
    
    
    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;
    
    //Spring Boot hep anatasyon.Burdaki map'lemeyi doğru yaparsak
    //SPRİNG BOOT JPA implementasyonu elimizin altında 
    @ManyToOne
    @JoinColumn(name = work_hour_id)
    private WorkHour workhour;
    //İlişkili olduğu tablonun ilişkisinin hangi yönde olduğu yönünde 
    //yaptığımız bir kod çalışması
    @ManyToOne
    @JoinColumn(name = "work_type_id")
    private WorkType worktype;
    
    @OneToOne(mappedBy = "JobAdvert")
    @JsonIgnore
    private JobAdvertComfirmation jobAdvertComfirmation;
    
    
    @JsonIgnore
    @OneToMany(mappedBy = "JobAdvert")
    private List<Favorites> favorites;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

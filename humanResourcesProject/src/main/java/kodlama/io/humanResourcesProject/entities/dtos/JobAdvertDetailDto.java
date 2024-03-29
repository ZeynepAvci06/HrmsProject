package kodlama.io.humanResourcesProject.entities.dtos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobAdvertDetailDto {
 
	private int jobPositionId;
	private int employerId;
	private String description;
	private int cityId;
	private int minSalary;
	private int maxSalary;
	private int openPositionCount;
	private LocalDate deadLine;
	@JsonIgnore
	private boolean isActive;
	private int workTypeId;
	private int workHourId;
	
	
}

package kodlama.io.humanResourcesProject.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JobAdvertDto {
	private int id;
	private String companyName;
	private String cityName;
	private String jobPosition;
	private int openPositionCount;
	private LocalDate publishedAt = LocalDate.now();
	private LocalDate deadline;
	

}

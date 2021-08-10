package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.WorkHour;

public interface WorkHourDao  extends JpaRepository<WorkHour, Integer> {
	WorkHour getById(int id);
	WorkHour getByWorkHour(String workHour);

}

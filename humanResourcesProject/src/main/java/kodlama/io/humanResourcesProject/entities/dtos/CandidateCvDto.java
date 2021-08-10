package kodlama.io.humanResourcesProject.entities.dtos;

import java.util.List;

import kodlama.io.humanResourcesProject.entities.concretes.Candidate;
import kodlama.io.humanResourcesProject.entities.concretes.EducationForCv;
import kodlama.io.humanResourcesProject.entities.concretes.ExperienceForCv;
import kodlama.io.humanResourcesProject.entities.concretes.ImageForCv;
import kodlama.io.humanResourcesProject.entities.concretes.LanguageForCv;
import kodlama.io.humanResourcesProject.entities.concretes.LinkForCv;
import kodlama.io.humanResourcesProject.entities.concretes.SkillForCv;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateCvDto {
	
	public Candidate candidate;
	public  List<EducationForCv>  educations;
    public  List<SkillForCv> skills;
    public List<LinkForCv> links;
    public List<LanguageForCv> languages;
    public List<ExperienceForCv> experiences;
    public ImageForCv images;
    
}

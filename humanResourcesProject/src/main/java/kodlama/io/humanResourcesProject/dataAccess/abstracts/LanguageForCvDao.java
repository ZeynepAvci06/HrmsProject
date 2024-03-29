package kodlama.io.humanResourcesProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.humanResourcesProject.entities.concretes.LanguageForCv;

public interface LanguageForCvDao extends JpaRepository<LanguageForCv,Integer >{

   LanguageForCv getById(int id);
   List<LanguageForCv> getAllCandidate_id(int id);
   List<LanguageForCv> findAllLanguage (String language);
	
}

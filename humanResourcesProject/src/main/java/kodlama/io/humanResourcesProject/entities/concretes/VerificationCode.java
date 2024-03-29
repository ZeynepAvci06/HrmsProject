package kodlama.io.humanResourcesProject.entities.concretes;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="verification_codes")
public class VerificationCode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="code")
	private String code;
	
	@Column(name="is_verified")
	private boolean isVerified;
	
	@Column(name="verified_date")
	private LocalDate verifiedDate;
	
	@Column(name="user_id")
	private int userId;
	
    @Column(name = "create_at",columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createAt = LocalDateTime.now();
    
    
    public VerificationCode (int userId,String code,boolean isVerified,LocalDateTime createAt) {
    super();
    this.userId = userId;
    this.code = code;
    this.isVerified = isVerified;
    this.createAt =createAt;
    
   }
}

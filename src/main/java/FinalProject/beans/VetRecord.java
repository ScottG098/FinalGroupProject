
package FinalProject.beans;

<<<<<<< HEAD
import java.util.Date;


=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
>>>>>>> ac647e2c09ea0bcbe843af43e3f1a6c08f2f8a41
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Apr 18, 2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VetRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private int id;
	private String recordDate;
	private String recordType;
	private String petName;
	private String vetID;
	
	public VetRecord(String recordDate, String recordType, String petName, String vetID) {
		super();
		this.recordDate = recordDate;
		this.recordType = recordType;
		this.petName = petName;
		this.vetID = vetID;
	}
}



package FinalProject.beans;

import java.util.Date;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
	
	public VetRecord() {
		
	}
	
	public VetRecord(String recordDate, String recordType, String petName, String vetID) {
		super();
		this.recordDate = recordDate;
		this.recordType = recordType;
		this.petName = petName;
		this.vetID = vetID;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the recordDate
	 */
	public String getRecordDate() {
		return recordDate;
	}

	/**
	 * @param recordDate the recordDate to set
	 */
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}

	/**
	 * @return the recordType
	 */
	public String getRecordType() {
		return recordType;
	}

	/**
	 * @param recordType the recordType to set
	 */
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	/**
	 * @return the petName
	 */
	public String getPetName() {
		return petName;
	}

	/**
	 * @param petName the petName to set
	 */
	public void setPetName(String petName) {
		this.petName = petName;
	}

	/**
	 * @return the vetID
	 */
	public String getVetID() {
		return vetID;
	}

	/**
	 * @param vetID the vetID to set
	 */
	public void setVetID(String vetID) {
		this.vetID = vetID;
	}

	@Override
	public String toString() {
		return "VetRecord [id=" + id + ", recordDate=" + recordDate + ", recordType=" + recordType + ", petName="
				+ petName + ", vetID=" + vetID + "]";
	}
	
	
}


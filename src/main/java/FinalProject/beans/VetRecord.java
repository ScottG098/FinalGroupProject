package FinalProject.beans;

import java.util.Date;


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
@Entity
public class VetRecord {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	int id;
	Date recordDate;
	String recordType;
	String petName;
	String vetID;
	
	public VetRecord() {
		super();
	}
	public VetRecord(int id, Date recordDate, String recordType, String petName, String vetID) {
		super();
		this.id = id;
		this.recordDate = recordDate;
		this.recordType = recordType;
		this.petName = petName;
		this.vetID = vetID;
	}
	public VetRecord(Date recordDate, String recordType, String petName, String vetID) {
		super();
		this.recordDate = recordDate;
		this.recordType = recordType;
		this.petName = petName;
		this.vetID = vetID;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(Date recordDate) {
		this.recordDate = recordDate;
	}
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public String getVetID() {
		return vetID;
	}
	public void setVetID(String vetID) {
		this.vetID = vetID;
	}
	
	@Override
	public String toString() {
		return "VetRecord [id=" + id + ", recordDate=" + recordDate + ", recordType=" + recordType + ", petName="
				+ petName + ", vetID=" + vetID + "]";
	}
}

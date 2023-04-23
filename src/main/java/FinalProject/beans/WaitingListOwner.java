package FinalProject.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Apr 15, 2023
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WaitingListOwner {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name ="id")
		private int id;
		private String owner_name;
		private String address;
		private String city;
		private String state;
		private String phoneNumber;
		
		public WaitingListOwner(String owner_name, String address,String city,String state,String phoneNumber) {
			super();
			this.owner_name = owner_name;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.setCity(city);
			this.setState(state);
		}
	}


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
		
		public WaitingListOwner() {
			
		}
		
		public WaitingListOwner(String owner_name, String address,String city,String state,String phoneNumber) {
			super();
			this.owner_name = owner_name;
			this.address = address;
			this.phoneNumber = phoneNumber;
			this.setCity(city);
			this.setState(state);
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
		 * @return the owner_name
		 */
		public String getOwner_name() {
			return owner_name;
		}

		/**
		 * @param owner_name the owner_name to set
		 */
		public void setOwner_name(String owner_name) {
			this.owner_name = owner_name;
		}

		/**
		 * @return the address
		 */
		public String getAddress() {
			return address;
		}

		/**
		 * @param address the address to set
		 */
		public void setAddress(String address) {
			this.address = address;
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}

		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}

		/**
		 * @return the phoneNumber
		 */
		public String getPhoneNumber() {
			return phoneNumber;
		}

		/**
		 * @param phoneNumber the phoneNumber to set
		 */
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		@Override
	public String toString() {
		return "WaitingListOwner [id=" + id + ", owner_name=" + owner_name + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", phoneNumber=" + phoneNumber + "]";
	}
	}


/**
 *@author Uday F Chinhamora- ufchinhamora

 *CIS175 -Spring 2023
 *Mar 31, 2023
*/
package FinalProject.beans;

/**
 * @author uchin
 *
 */
import jakarta.persistence.Embeddable;

@Embeddable
public class Owner {
	private String owner_name;
	private String address;
	private String city;
	private String state;
	private String phoneNumber;
	
	public Owner() {
	
	}
	
	public Owner(String owner_name, String address,String city,String state,String phoneNumber) {
		this.owner_name = owner_name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
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

	
	

}

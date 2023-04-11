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
		super();
		// TODO Auto-generated constructor stub
	}
	public Owner(String owner_name, String address,String city,String state,String phoneNumber) {
		super();
		this.owner_name = owner_name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.setCity(city);
		this.setState(state);
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Owner [owner_name=" + owner_name + ", address=" + address + "city=" + city+ ", state=" + state+  ", phoneNumber=" + phoneNumber + "]";
	}


}

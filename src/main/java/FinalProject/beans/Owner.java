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
	/**
	 * @param state2
	 */
	private void setState(String state2) {
		this.state = state2;
		
	}
	/**
	 * @param city2
	 */
	private void setCity(String city2) {
		this.city = city2;
		
	}
	


}

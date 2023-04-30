/**
 *@author Uday F Chinhamora- ufchinhamora


 *CIS175 -Spring 2023
 *Mar 31, 2023
*/
package FinalProject.beans;

import org.springframework.beans.factory.annotation.Autowired;


import jakarta.persistence.Column;
/**
 * @author uchin
 *
 */
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private int id;
	private String name;
	private String breed;
	private String date_of_birth;
	
	private String price;
	
	
	@Autowired
	private Owner owner;
	
	public Animal() {
	
	}
	
	public Animal(String name) {
		
		this.name = name;
	}
	public Animal(String name, String breed, String date_of_birth, String price) {
		this.name = name;
		this.breed = breed;
		this.date_of_birth = date_of_birth;
		this.price=price;
	}
	public Animal(int id, String name, String breed, String date_of_birth, String  price) {
		
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.date_of_birth = date_of_birth;
		this.price=price;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the date_of_birth
	 */
	public String getDate_of_birth() {
		return date_of_birth;
	}

	/**
	 * @param date_of_birth the date_of_birth to set
	 */
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the owner
	 */
	public Owner getOwner() {
		return owner;
	}

	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	
	
}


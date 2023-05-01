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

	
	
	
}


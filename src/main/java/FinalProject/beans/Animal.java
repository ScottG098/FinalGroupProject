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

@Entity

public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private int id ;
	private String name;
	private String breed;
	private String date_of_birth;
	
	private double price;
	
	
	@Autowired
	private Owner owner;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
		this.date_of_birth ="" ;
	}
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	public Animal(String name, String breed, String date_of_birth,double price) {
		super();
		this.name = name;
		this.breed = breed;
		this.date_of_birth = date_of_birth;
		this.price=price;
	}
	public Animal(int id, String name, String breed, String date_of_birth,double price) {
		super();
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.date_of_birth = date_of_birth;
		this.price=price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", breed=" + breed + ", date_of_birth=" + date_of_birth
				+ ", price=" + price 	+ ", owner=" + owner + "]";
	}

	
}

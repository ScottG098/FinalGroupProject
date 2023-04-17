/**
 *@author Uday F Chinhamora- ufchinhamora

 *CIS175 -Spring 2023
 *April 09, 2023
*/
package FinalProject.controller;

/**
 * @author uchin
 *
 */
import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;

import FinalProject.beans.Animal;
import FinalProject.beans.Owner;
import FinalProject.beans.WaitingListOwner;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Animal player() {
		Animal bean = new Animal("Ranger");
		
		return bean;
	}

	@Bean
	public Owner team() {
		Owner bean = new Owner("Gary Simons","5245 James Street", "Des Moines","IA","555-555-4444");
		return bean;
	}
	
	@Bean
	public WaitingListOwner waitingOwner() {
		WaitingListOwner bean = new WaitingListOwner("Gary Simons","5245 James Street", "Des Moines","IA","555-555-4444");
		return bean;
	}
}

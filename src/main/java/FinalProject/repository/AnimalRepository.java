/**
 *@author Uday F Chinhamora- ufchinhamora

 *CIS175 -Spring 2023
 *April 09, 2023, 2023
*/
package FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import FinalProject.beans.Animal;

/**
 * @author uchin
 *
 */

@EnableJpaRepositories
public interface AnimalRepository  extends JpaRepository<Animal, Long>{

}

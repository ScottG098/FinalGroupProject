/**
 *@author Uday F Chinhamora- ufchinhamora

 *CIS175 -Spring 2023
 *April 09, 2023, 2023
*/
package FinalProject.repository;

import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import FinalProject.beans.Animal;

/**
 * @author uchin
 *
 */

@EnableJpaRepositories
public interface AnimalRepository  extends JpaRepository<Animal, Long>{
	@Query("SELECT a FROM Animal a ORDER BY CASE " + "WHEN a.name = :userInput THEN a.name " + "WHEN a.breed = :userInput THEN a.breed " + "WHEN a.price = :userInput THEN a.price" + "WHEN a.id = :userInput THEN a.id" + "ELSE a.name END ASC")
	List<Animal> findAllSortedByUserInput(@Param("userInput")String userInput);
}

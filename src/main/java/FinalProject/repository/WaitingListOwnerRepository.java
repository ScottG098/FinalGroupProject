package FinalProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import FinalProject.beans.WaitingListOwner;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Apr 15, 2023
 */
public interface WaitingListOwnerRepository extends JpaRepository<WaitingListOwner, Long>{
	@Query("SELECT o FROM WaitingListOwner o ORDER BY CASE " + " WHEN o.owner_name = :userInput THEN o.owner_name " + " WHEN o.address = :userInput THEN o.address" + " WHEN o.city = :userInput THEN o.city " + " WHEN o.state = :userInput THEN o.state" + " ELSE o.owner_name END ASC")
	List<WaitingListOwner> findAllSortedByUserInput(@Param("userInput")String userInput);
}

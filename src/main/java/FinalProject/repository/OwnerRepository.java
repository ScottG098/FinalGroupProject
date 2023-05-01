package FinalProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import FinalProject.beans.Animal;
import FinalProject.beans.WaitingListOwner;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Apr 14, 2023
 */
public interface OwnerRepository extends JpaRepository<WaitingListOwner, Long>{
	
}

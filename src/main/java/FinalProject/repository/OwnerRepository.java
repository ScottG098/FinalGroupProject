package FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import FinalProject.beans.WaitingListOwner;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Apr 14, 2023
 */
public interface OwnerRepository extends JpaRepository<WaitingListOwner, Long>{

}

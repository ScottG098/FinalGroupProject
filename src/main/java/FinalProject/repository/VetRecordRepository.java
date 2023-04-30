package FinalProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import FinalProject.beans.VetRecord;

/**
 * @author Scott Grigsby-sdgrigsby
 *CIS175-Spring 2023
 * Apr 21, 2023
 */
@EnableJpaRepositories
public interface VetRecordRepository  extends JpaRepository<VetRecord, Long>{

}

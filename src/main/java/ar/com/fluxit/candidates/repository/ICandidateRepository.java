/**
 * 
 */
package ar.com.fluxit.candidates.repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ar.com.fluxit.candidates.entity.Candidate;



/**
 * 
 * @author Magdaly Santos
 *
 */
public interface ICandidateRepository extends JpaRepository<Candidate,Long>{ 

	@Query()
	public Page<Candidate> findAllByDocumentNumberAndFullName(int documentNumber,int fullName,Pageable pageable);
}


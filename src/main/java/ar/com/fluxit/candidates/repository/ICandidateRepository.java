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

	@Query("select c From Candidate c where c.documentNumber=?0 ")
	public Page<Candidate> findAllByDocumentNumberAndFullName(Integer documentNumber,String fullName,Pageable pageable);

	
}


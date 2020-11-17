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

	@Query("select c From Candidate c where (c.documentNumber=?1 or ?1 is null) and ( c.fullName=?2 or ?2 is null)")
	public Page<Candidate> findAllByDocumentFullname(Integer documentNumber, String fullName, Pageable pageable);

	
}


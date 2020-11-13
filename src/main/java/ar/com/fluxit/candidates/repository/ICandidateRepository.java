/**
 * 
 */
package ar.com.fluxit.candidates.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ar.com.fluxit.candidates.entity.Candidate;



/**
 * 
 * @author Magdaly Santos
 *
 */
public interface ICandidateRepository extends JpaRepository<Candidate,Long>{ 

}


/**
 * 
 */
package ar.com.fluxit.candidates.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ar.com.fluxit.candidates.entity.Candidate;
import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
import ar.com.fluxit.candidates.model.ICandidate;
import ar.com.fluxit.candidates.repository.ICandidateRepository;


/**
 * @author Magdaly Santos
 *
 */
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CandidateServiceTest {

	private final static long ID = 1L;

	@MockBean
	private ICandidateRepository mockRepository;

	@Autowired
	private CandidateService service;

	@Test
	void testFindCandidateById() throws CandidateNotFoundException  {
		doReturn(Optional.of(getCandidate())).when(mockRepository).findById(ID);
		ICandidate candidate = service.get(ID);
		assertEquals(ID, candidate.getId());
	}


	public ICandidate getCandidate() {
		Candidate candidate = new Candidate();
		candidate.setId(ID);
		candidate.setEmail("prueba@gmail.com");
		candidate.setFullName("Magdaly Santos");
		candidate.setAddress("Marcelo T Alvear");
		return candidate;
	}
}

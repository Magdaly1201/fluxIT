/**
 * 
 */
package ar.com.fluxit.candidates.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;
import ar.com.fluxit.candidates.service.CandidateService;

/**
 * @author Magdaly Santos
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
public class CandidateControllerTest {

	@MockBean
	private CandidateService mockService;

	@Autowired
	private CandidateController controller;

	private final static long ID = 1;

	@Test
	void testFindCandidateById() throws CandidateNotFoundException {
		doReturn(getCandidate()).when(mockService).get(ID);
		CandidateResponseDTO candidateDto = controller.get(ID);
		assertEquals(ID, candidateDto.getId());
	}

	public CandidateResponseDTO getCandidate() {
		CandidateResponseDTO candidateDTO = new CandidateResponseDTO();
		candidateDTO.setId(ID);
		candidateDTO.setEmail("prueba@gmail.com");
		candidateDTO.setFullName("Magdaly Santos");
		candidateDTO.setAddress("Marcelo T Alvear");
		return candidateDTO;
	}

}

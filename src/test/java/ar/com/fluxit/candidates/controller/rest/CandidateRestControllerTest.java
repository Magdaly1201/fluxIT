/**
 * 
 */
package ar.com.fluxit.candidates.controller.rest;

import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import ar.com.fluxit.candidates.controller.CandidateController;
import ar.com.fluxit.candidates.interceptor.Interceptor;
import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;

/**
 * @author Magdaly Santos
 *
 */
@SpringBootTest
@AutoConfigureMockMvc
public class CandidateRestControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CandidateController controller;

	@MockBean
	private Interceptor inteceptor;

	private static final String ENDPOINT_CANDIDATE = "/api/v1/candidate/{id}";
	private static final Long ID = 1L;
	
	@BeforeEach
	public void setupInterceptor() throws Exception {
		Mockito.when(inteceptor.preHandle(Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(true);
	}
	
	@Test
	public void testGetMeetupById() throws Exception {
		CandidateResponseDTO candidateDTO = this.getCandidateDTO();

		doReturn(getCandidateDTO()).when(controller).get(ID);

		mockMvc.perform(
				MockMvcRequestBuilders.get(ENDPOINT_CANDIDATE, candidateDTO.getId()).accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk()).andExpect((jsonPath("$.id").value(candidateDTO.getId())))
				.andExpect((jsonPath("$.fullname").value(candidateDTO.getFullName())));

	}

	private CandidateResponseDTO getCandidateDTO() {
		CandidateResponseDTO candidateDTO = new CandidateResponseDTO();
		candidateDTO.setId(ID);
		candidateDTO.setEmail("prueba@gmail.com");
		candidateDTO.setFullName("Magdaly Santos");
		candidateDTO.setAddress("Marcelo T Alvear");
		return candidateDTO;
		
	}
	
}

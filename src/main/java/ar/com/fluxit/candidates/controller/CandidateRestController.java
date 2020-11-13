package ar.com.fluxit.candidates.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;
import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;
import ar.com.fluxit.candidates.model.dto.CandidateSummaryDTO;


/**
 * 
 * @author Magdaly Santos
 *
 */
@RestController
@RequestMapping("/api")
public class CandidateRestController {

	@Autowired
	private CandidateController controller;
	
	@GetMapping("/candidate/{id}")
	public CandidateResponseDTO get(@PathVariable(value="id") int id) throws CandidateNotFoundException {
		return this.controller.get(id);
	}
	
	@PostMapping("/candidate")
	public CandidateResponseDTO create(@RequestBody CandidateRequestDTO candidate) {
		return this.controller.create(candidate);
	}
	
	@PutMapping("/candidate")
	public CandidateResponseDTO update(@PathVariable(value="id") int id, @RequestBody CandidateRequestDTO candidate) {
		return this.controller.update(id, candidate);
	}
	
	@DeleteMapping("/candidate/{id}")
	public CandidateResponseDTO delete(@PathVariable(value="id") int id) {
		return this.controller.delete(id);
	}
	
	@DeleteMapping("/candidate/filter")
	public List<CandidateSummaryDTO> filter(){
		return this.controller.filter();
	}
	
}

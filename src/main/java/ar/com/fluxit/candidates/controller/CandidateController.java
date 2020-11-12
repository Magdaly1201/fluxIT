package ar.com.fluxit.candidates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;
import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;
import ar.com.fluxit.candidates.model.dto.CandidateSummaryDTO;
import ar.com.fluxit.candidates.service.ICandidateService;
/**
 * 
 * @author Magdaly Santos
 *
 */
@Controller
public class CandidateController {

	@Autowired
	private ICandidateService service;
	
	public CandidateResponseDTO get(int id) {
		return this.service.get(id);
	}
	
	public CandidateResponseDTO create(CandidateRequestDTO candidate) {
		return this.service.create(candidate);
	}
	
	public CandidateResponseDTO update(int id, CandidateRequestDTO candidate) {
		return this.service.update(id, candidate);
	}
	
	public CandidateResponseDTO delete(int id) {
		return this.service.delete(id);
	}
	
	public List<CandidateSummaryDTO> filter(){
		return this.service.filter();
	}
}

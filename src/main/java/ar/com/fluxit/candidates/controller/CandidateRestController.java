package ar.com.fluxit.candidates.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.security.RolesAllowed;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RolesAllowed({"ADMINISTRADOR"})
	public  ResponseEntity<?> get(@PathVariable(value="id") int id) throws CandidateNotFoundException {
		return new ResponseEntity<CandidateResponseDTO>(this.controller.get(id), HttpStatus.OK);
	}
	
	@PostMapping("/candidate")
	@RolesAllowed({"ADMINISTRADOR"})
	public ResponseEntity<?> create(@Valid @RequestBody CandidateRequestDTO candidate) {
		return new ResponseEntity<CandidateResponseDTO>(this.controller.create(candidate), HttpStatus.CREATED);

	}
	
	@RolesAllowed({"ADMINISTRADOR"})
	@PutMapping("/candidate")
	public ResponseEntity<?> update(@PathVariable(value="id") int id, @RequestBody CandidateRequestDTO candidate) throws CandidateNotFoundException {
		return new ResponseEntity<CandidateResponseDTO>(this.controller.update(id, candidate), HttpStatus.CREATED);
	}
	
	@RolesAllowed({"ADMINISTRADOR"})
	@DeleteMapping("/candidate/{id}")
	public ResponseEntity<?> delete(@PathVariable(value="id") int id) throws CandidateNotFoundException {
		return new ResponseEntity<CandidateResponseDTO>(this.controller.delete(id), HttpStatus.OK);
	}
	
	@RolesAllowed({"ADMINISTRADOR"})
	@GetMapping("/candidate/filter")
	public Page<CandidateSummaryDTO> filter(
			@RequestParam(value="page",defaultValue="0",required=false)int page,
			@RequestParam(value="size",defaultValue="10", required=false)int size,
			@RequestParam(value="documentNumber",required=false )Integer documentNumber,
			@RequestParam(value="fullname",required=false )String fullname){
		//TODO: SE PUEDE AGREGAR ORDER Y DIRECTION
		return this.controller.filter(PageRequest.of(page, size), documentNumber, fullname);
	}
	

}

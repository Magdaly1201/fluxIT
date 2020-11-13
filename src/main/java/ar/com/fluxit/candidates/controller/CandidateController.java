package ar.com.fluxit.candidates.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
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
	

    @Autowired
    private ModelMapper modelMapper;
    
	public CandidateResponseDTO get(int id) {
		return this.modelMapper.map(this.service.get(id),
				CandidateResponseDTO.class);
	}
	
	public CandidateResponseDTO create(CandidateRequestDTO candidate) {
		return this.modelMapper.map(this.service.create(candidate),
				CandidateResponseDTO.class);
	}
	
	public CandidateResponseDTO update(int id, CandidateRequestDTO candidate) {
		return this.modelMapper.map(this.service.update(id, candidate),
				CandidateResponseDTO.class);
	}
	
	public CandidateResponseDTO delete(int id) {
		return this.modelMapper.map(this.service.delete(id),
				CandidateResponseDTO.class);
	}
	
	public List<CandidateSummaryDTO> filter(){
        return this.service.filter().stream()
                .map(d -> this.modelMapper.map(d, CandidateSummaryDTO.class))
                .collect(Collectors.toList());
	}
}

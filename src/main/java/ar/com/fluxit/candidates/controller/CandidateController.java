package ar.com.fluxit.candidates.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
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
    
	public CandidateResponseDTO get(int id) throws CandidateNotFoundException {
		return this.modelMapper.map(this.service.get(id),
				CandidateResponseDTO.class);
	}
	
	public CandidateResponseDTO create(CandidateRequestDTO candidate) {
		return this.modelMapper.map(this.service.create(candidate),
				CandidateResponseDTO.class);
	}
	
	public CandidateResponseDTO update(int id, CandidateRequestDTO candidate) throws CandidateNotFoundException {
		return this.modelMapper.map(this.service.update(id, candidate),
				CandidateResponseDTO.class);
	}
	
	public CandidateResponseDTO delete(int id) throws CandidateNotFoundException {
		return this.modelMapper.map(this.service.delete(id),
				CandidateResponseDTO.class);
	}
	
	public Page<CandidateSummaryDTO> filter(PageRequest pageRequest, int documentNumber, String fullName){
        return this.service.filter(pageRequest, documentNumber, fullName)
                .map(d -> this.modelMapper.map(d, CandidateSummaryDTO.class));
	}
}

package ar.com.fluxit.candidates.service;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;
import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;
import ar.com.fluxit.candidates.model.dto.CandidateSummaryDTO;

/**
 * 
 * @author mxs690
 *
 */
public class CandidateService implements ICandidateService {

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#get(int)
	 */
	@Override
	public CandidateResponseDTO get(int id) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#create(ar.com.fluxit.candidates.model.dto.CandidateRequestDTO)
	 */
	@Override
	public CandidateResponseDTO create(CandidateRequestDTO candidate) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#update(int, ar.com.fluxit.candidates.model.dto.CandidateRequestDTO)
	 */
	@Override
	public CandidateResponseDTO update(int id,CandidateRequestDTO candidate) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#delete(int)
	 */
	@Override
	public CandidateResponseDTO delete(int id) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#filter()
	 */
	@Override
	public List<CandidateSummaryDTO> filter(){
		return null;
	}
}

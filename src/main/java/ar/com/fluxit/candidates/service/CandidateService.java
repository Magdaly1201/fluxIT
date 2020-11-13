package ar.com.fluxit.candidates.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ar.com.fluxit.candidates.entity.Candidate;
import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
import ar.com.fluxit.candidates.model.ICandidate;
import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;
import ar.com.fluxit.candidates.repository.ICandidateRepository;

/**
 * 
 * @author mxs690
 *
 */
@Service
public class CandidateService implements ICandidateService {

	@Autowired
	private ICandidateRepository repository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#get(int)
	 */
	@Override
	public ICandidate get(long id) throws CandidateNotFoundException {
		return this.repository.findById(id).orElseThrow(()-> new CandidateNotFoundException());
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#create(ar.com.fluxit.candidates.model.dto.CandidateRequestDTO)
	 */
	@Override
	public ICandidate create(CandidateRequestDTO candidate) {
		Candidate candidateSave =this.modelMapper.map(candidate, Candidate.class);
		return repository.save(candidateSave);
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#update(int, ar.com.fluxit.candidates.model.dto.CandidateRequestDTO)
	 */
	@Override
	public ICandidate update(int id,CandidateRequestDTO candidate) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#delete(int)
	 */
	@Override
	public ICandidate delete(int id) {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#filter()
	 */
	@Override
	public List<ICandidate> filter(){
		return null;
	}
}

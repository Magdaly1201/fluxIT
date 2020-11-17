package ar.com.fluxit.candidates.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
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
		Candidate candidateSave = this.modelMapper.map(candidate, Candidate.class);
		return this.repository.save(candidateSave);
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#update(int, ar.com.fluxit.candidates.model.dto.CandidateRequestDTO)
	 */
	@Override
	public ICandidate update(long id,CandidateRequestDTO candidateDTO) throws CandidateNotFoundException {
		ICandidate  candidateFind =(Candidate) this.get(id);
		Candidate candidateUpdate= new Candidate();
		this.modelMapper.map(candidateFind, candidateUpdate);
		this.modelMapper.map(candidateDTO, candidateUpdate);
		return this.repository.save(candidateUpdate);
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#delete(int)
	 */
	@Override
	public ICandidate delete(long id) throws CandidateNotFoundException {
		ICandidate  candidateFind = (Candidate) this.get(id);
		Candidate candidateDelete = new Candidate();
		this.modelMapper.map(candidateFind, candidateDelete);
		this.repository.delete(candidateDelete);
		return candidateFind; 
	}
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.service.ICandidateService#filter()
	 */
	@Override
	public Page<ICandidate> filter(PageRequest pageRequest, Integer documentNumber, String fullName){
		return  this.repository.findAllByDocumentFullname(documentNumber,fullName,pageRequest).map(d->d);
	}
}

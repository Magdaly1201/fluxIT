package ar.com.fluxit.candidates.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
import ar.com.fluxit.candidates.model.ICandidate;
import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;

public interface ICandidateService {

	ICandidate get(long id) throws CandidateNotFoundException;

	ICandidate create(CandidateRequestDTO candidate);

	ICandidate update(long id, CandidateRequestDTO candidateDTO) throws CandidateNotFoundException;

	ICandidate delete(long id) throws CandidateNotFoundException;

	Page<ICandidate> filter(PageRequest pageRequest, Integer documentNumber, String fullName);

}
package ar.com.fluxit.candidates.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
import ar.com.fluxit.candidates.model.ICandidate;
import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;

public interface ICandidateService {

	ICandidate get(long id) throws CandidateNotFoundException;

	ICandidate create(CandidateRequestDTO candidate);

	ICandidate update(int id, CandidateRequestDTO candidateDTO) throws CandidateNotFoundException;

	ICandidate delete(int id) throws CandidateNotFoundException;

	Page<ICandidate> filter(PageRequest pageRequest, int documentNumber, String fullName);

}
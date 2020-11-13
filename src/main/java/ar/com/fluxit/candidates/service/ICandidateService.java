package ar.com.fluxit.candidates.service;

import java.util.List;

import ar.com.fluxit.candidates.model.ICandidate;
import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;

public interface ICandidateService {

	ICandidate get(int id);

	ICandidate create(CandidateRequestDTO candidate);

	ICandidate update(int id, CandidateRequestDTO candidate);

	ICandidate delete(int id);

	List<ICandidate> filter();

}
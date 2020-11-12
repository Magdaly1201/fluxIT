package ar.com.fluxit.candidates.service;

import java.util.List;

import ar.com.fluxit.candidates.model.dto.CandidateRequestDTO;
import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;
import ar.com.fluxit.candidates.model.dto.CandidateSummaryDTO;

public interface ICandidateService {

	CandidateResponseDTO get(int id);

	CandidateResponseDTO create(CandidateRequestDTO candidate);

	CandidateResponseDTO update(int id, CandidateRequestDTO candidate);

	CandidateResponseDTO delete(int id);

	List<CandidateSummaryDTO> filter();

}
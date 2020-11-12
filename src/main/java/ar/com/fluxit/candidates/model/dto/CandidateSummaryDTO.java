package ar.com.fluxit.candidates.model.dto;

import java.time.LocalDate;

import ar.com.fluxit.candidates.model.ICandidateSummary;

public class CandidateSummaryDTO implements ICandidateSummary{

	private int documentNumber;
	private String fullName;
	
	/**
	 * @return the documentNumber
	 */
	@Override
	public int getDocumentNumber() {
		return documentNumber;
	}
	/**
	 * @return the fullName
	 */
	@Override
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param documentNumber the documentNumber to set
	 */
	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
}

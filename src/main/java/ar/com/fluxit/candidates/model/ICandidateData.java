package ar.com.fluxit.candidates.model;

import java.time.LocalDate;

public interface ICandidateData {

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getDocumentNumber()
	 */
	Integer getDocumentNumber();

	/**
	 * @return the birthDate
	 */
	LocalDate getBirthDate();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getFullName()
	 */
	String getFullName();

	/**
	 * @return the address
	 */
	String getAddress();

	/**
	 * @return the numberPhone
	 */
	Integer getNumberPhone();

	/**
	 * @return the email
	 */
	String getEmail();

}
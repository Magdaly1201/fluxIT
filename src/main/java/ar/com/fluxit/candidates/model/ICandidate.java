package ar.com.fluxit.candidates.model;

import java.time.LocalDate;

public interface ICandidate {

	/**
	 * @return the id
	 */
	long getId();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getDocumentNumber()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getDocumentNumber()
	 */
	int getDocumentNumber();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getBirthDate()
	 */
	LocalDate getBirthDate();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getFullName()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getFullName()
	 */
	String getFullName();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getAddress()
	 */
	String getAddress();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getNumberPhone()
	 */
	int getNumberPhone();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getEmail()
	 */
	String getEmail();

}
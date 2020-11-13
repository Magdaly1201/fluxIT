/**
 * 
 */
package ar.com.fluxit.candidates.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ar.com.fluxit.candidates.model.ICandidate;
import ar.com.fluxit.candidates.model.ICandidateData;
import ar.com.fluxit.candidates.model.ICandidateSummary;

/**
 * @author mxs690
 *
 */
@Entity
@Table(name="candidates")
public class Candidate implements ICandidateSummary, ICandidateData, ICandidate {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(nullable=false)
	private int documentNumber;
	private LocalDate birthDate;
	@Column(nullable=false)
	private String fullName;
	private String address;
	private int numberPhone;
	private String email;
	
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getId()
	 */
	@Override
	public long getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getDocumentNumber()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getDocumentNumber()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getDocumentNumber()
	 */
	@Override
	public int getDocumentNumber() {
		return documentNumber;
	}
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getBirthDate()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getBirthDate()
	 */
	@Override
	public LocalDate getBirthDate() {
		return birthDate;
	}
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getFullName()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getFullName()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getFullName()
	 */
	@Override
	public String getFullName() {
		return fullName;
	}
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getAddress()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getAddress()
	 */
	@Override
	public String getAddress() {
		return address;
	}
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getNumberPhone()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getNumberPhone()
	 */
	@Override
	public int getNumberPhone() {
		return numberPhone;
	}
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidateData#getEmail()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.model.ICandidate#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param documentNumber the documentNumber to set
	 */
	public void setDocumentNumber(int documentNumber) {
		this.documentNumber = documentNumber;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param numberPhone the numberPhone to set
	 */
	public void setNumberPhone(int numberPhone) {
		this.numberPhone = numberPhone;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	

	
}

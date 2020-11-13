package ar.com.fluxit.candidates.model.dto;

import java.time.LocalDate;

import ar.com.fluxit.candidates.model.ICandidate;
/**
 * 
 * @author Magdaly Santos
 *
 */
public class CandidateResponseDTO implements ICandidate{
	
	private long id;
	private int documentNumber;
	private LocalDate birthDate;
	private String fullName;
	private String address;
	private int numberPhone;
	private String email;
	
	/**
	 * @return the id
	 */
	@Override
	public long getId() {
		return id;
	}
	/**
	 * @return the documentNumber
	 */
	@Override
	public int getDocumentNumber() {
		return documentNumber;
	}
	/**
	 * @return the birthDate
	 */
	@Override
	public LocalDate getBirthDate() {
		return birthDate;
	}
	/**
	 * @return the fullName
	 */
	@Override
	public String getFullName() {
		return fullName;
	}
	/**
	 * @return the address
	 */
	@Override
	public String getAddress() {
		return address;
	}
	/**
	 * @return the numberPhone
	 */
	@Override
	public int getNumberPhone() {
		return numberPhone;
	}
	/**
	 * @return the email
	 */
	@Override
	public String getEmail() {
		return email;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
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

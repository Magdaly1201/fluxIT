package ar.com.fluxit.candidates.model.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import ar.com.fluxit.candidates.model.ICandidateData;

public class CandidateRequestDTO implements ICandidateData {
	
	@NotEmpty(message="No puede estar vacio")
	@Size(min=4,max=8, message="El tamaño tiene que estar entre 5 y 8")
	private int documentNumber;
	
	@NotEmpty(message="No puede estar vacio")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate birthDate;
	
	@NotEmpty(message="No puede estar vacio")
	@Size(min=4,max=25, message="El tamaño tiene que estar entre 4 y 25 caracteres")
	private String fullName;
	
	@Size(min=4,max=25, message="El tamaño tiene que estar entre 4 y 25 caracteres")
	@NotEmpty(message="No puede estar vacio")
	private String address;
	
	
	@NotEmpty(message="No puede estar vacio")
	private int numberPhone;
	
	@NotEmpty(message="No puede estar vacio")
	@Email(message="No es una direccion de correo bien formada")
	private String email;
	
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

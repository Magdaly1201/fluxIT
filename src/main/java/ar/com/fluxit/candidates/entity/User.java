package ar.com.fluxit.candidates.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ar.com.fluxit.candidates.model.IUser;
import ar.com.fluxit.candidates.model.IUserData;
import ar.com.fluxit.candidates.model.dto.IUserLogin;

@Entity
@Table(name="users")
public class User implements Serializable, IUser,IUserLogin, IUserData{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "user_name", nullable = false)
	private String username;
	
	@Column(name = "full_name", nullable = false)
	private String fullName;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "role", nullable = false)
	private String role;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "created_at", nullable = false)
	private LocalDateTime createAt;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getId()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserJWT#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getFullName()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserData#getFullName()
	 */
	@Override
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getUsername()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserLogin#getUsername()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserData#getUsername()
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getPassword()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserLogin#getPassword()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserData#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getRole()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserData#getRole()
	 */
	@Override
	public String getRole() {
		return role;
	}

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getEmail()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserData#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getCreateAt()
	 */
	@Override
	public LocalDateTime getCreateAt() {
		return createAt;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param createAt the createAt to set
	 */
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", fullName=" + fullName + ", password=" + password
				+ ", role=" + role + ", email=" + email + ", createAt=" + createAt + "]";
	}

	
}

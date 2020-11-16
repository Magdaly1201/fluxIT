package ar.com.fluxit.candidates.model;

public interface IUserData {

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getFullName()
	 */
	String getFullName();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getUsername()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserLogin#getUsername()
	 */
	String getUsername();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getPassword()
	 */
	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUserLogin#getPassword()
	 */
	String getPassword();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getRole()
	 */
	String getRole();

	/* (non-Javadoc)
	 * @see ar.com.fluxit.candidates.entity.IUser#getEmail()
	 */
	String getEmail();

}
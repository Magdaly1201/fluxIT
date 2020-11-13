/**
 * 
 */
package ar.com.fluxit.candidates.exception;

/**
 * @author Magdaly Santos
 *
 */
public class CandidateNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String message ="Candidato No encontrado";
	
	public CandidateNotFoundException() {
		super(message);
	}
	
}
